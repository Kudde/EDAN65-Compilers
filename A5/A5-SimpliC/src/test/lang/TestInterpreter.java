package lang;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Scanner;
import lang.ast.LangParser;
import lang.ast.LangScanner;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

import lang.ast.ErrorMessage;
import lang.ast.Program;

/**
 * This is a parameterized test: one test case is generated for each input
 * file found in TEST_DIRECTORY. Input files should have the ".in" extension.
 */
@RunWith(Parameterized.class)
public class TestInterpreter {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles/interpreter");

	private final String filename;
	public TestInterpreter(String testFile) {
		filename = testFile;
	}

        @Test public void runTest() throws Exception {
	        PrintStream out = System.out;
	        try {
	                Program program = (Program) parse(new File(TEST_DIRECTORY, filename));
	                ByteArrayOutputStream baos = new ByteArrayOutputStream();
	                System.setOut(new PrintStream(baos));
	                program.eval();
	                compareOutput(baos.toString(),
	                new File(TEST_DIRECTORY, Util.changeExtension(filename, ".out")),
	                new File(TEST_DIRECTORY, Util.changeExtension(filename, ".expected")));
	        } finally {
	                System.setOut(out);
	        }
	}

	private Object parse(File file) throws IOException, Exception {
		LangScanner scanner = new LangScanner(new FileReader(file));
		LangParser parser = new LangParser();
		return parser.parse(scanner);
	}

	private void compareOutput(String in, File out, File expected) {
		try {
			Files.write(out.toPath(), in.getBytes());
			assertEquals("Output no match",
				readFileToString(expected),
				norm(in));
		} catch (IOException e) {
			fail("Åhnej! Compare fel : " + e.getMessage());
		}
	}

	private String readFileToString(File file) throws FileNotFoundException {
		if (!file.isFile())
			return "";

		Scanner scanner = new Scanner(file);
		scanner.useDelimiter("\\Z");
		String text = norm(scanner.hasNext() ? scanner.next() : "");
		scanner.close();
		return text;
	}

	private String norm(String text) {
		return text.replace(System.getProperty("line.separator"), "\n").trim();
	}

	@Parameters(name = "{0}")
	public static Iterable<Object[]> getTests() {
		return Util.getTestParameters(TEST_DIRECTORY, ".in");
	}
}
