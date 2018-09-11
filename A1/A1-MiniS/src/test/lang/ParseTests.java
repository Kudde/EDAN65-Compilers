package lang;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.fail;

public class ParseTests {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles");

	@Test public void testASSIGNMENT() {
		Util.testValidSyntax(TEST_DIRECTORY, "assignment.in");
	}

	@Test public void testIF() {
		Util.testValidSyntax(TEST_DIRECTORY, "if.in");
	}

	@Test public void testFOR() {
		Util.testValidSyntax(TEST_DIRECTORY, "for.in");
	}

	@Test public void testMucho() {
		Util.testValidSyntax(TEST_DIRECTORY, "mucho.in");
	}

	@Test public void testError() {
		Util.testSyntaxError(TEST_DIRECTORY, "err.in");
	}

	@Test public void testParseError() {
		Util.testSyntaxError(TEST_DIRECTORY, "pErr.in");
	}

}
