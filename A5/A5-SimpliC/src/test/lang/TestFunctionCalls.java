package lang;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import lang.ast.ErrorMessage;
import lang.ast.Fun;
import lang.ast.IdDecl;
import lang.ast.Program;

/**
 * This is a parameterized test: one test case is generated for each input
 * file found in TEST_DIRECTORY. Input files should have the ".in" extension.
 */
@RunWith(Parameterized.class)
public class TestFunctionCalls {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles/functioncalls");

	private final String filename;
	public TestFunctionCalls(String testFile) {
		filename = testFile;
	}

	@Test public void runTest() throws Exception {
		Program program = (Program) Util.parse(new File(TEST_DIRECTORY, filename));
		StringBuilder sb = new StringBuilder();

		for(Fun fun : program.getFuns()) {
			sb.append("Fun: ");
			sb.append(fun.getIdDecl().getID()).append("\n");
			appendReach(sb, fun).append("\n");
			for (IdDecl id : fun.functionCalls()) {
				sb.append(" > ");
				sb.append(id.getID()).append("\n");
			}
			sb.append("\n");
		}

		String actual = sb.toString();
		Util.compareOutput(actual,
				new File(TEST_DIRECTORY, Util.changeExtension(filename, ".out")),
				new File(TEST_DIRECTORY, Util.changeExtension(filename, ".expected")));
	}

	private StringBuilder appendReach(StringBuilder sb, Fun fun) {

			sb.append("Reach: { ");
			for (Fun f : fun.reachable()) {
				sb.append(f.getIdDecl().getID());
				sb.append(" ");
			}
			sb.append("}");

			return sb;
	}


	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return Util.getTestParameters(TEST_DIRECTORY, ".in");
	}

}
