package lang;

import java.io.File;

import org.junit.Test;

public class ASTTests {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles/ast");

	@Test public void test1() {
		Util.testValidSyntax(TEST_DIRECTORY, "test1.in");
	}

	@Test public void test2() {
		Util.testValidSyntax(TEST_DIRECTORY, "test2.in");
	}

}
