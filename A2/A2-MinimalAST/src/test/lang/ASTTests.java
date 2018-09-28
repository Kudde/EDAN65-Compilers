package lang;

import java.io.File;

import org.junit.Test;

public class ASTTests {
	/** Directory where the test input files are stored. */
	private static final File TEST_DIRECTORY = new File("testfiles/ast");

	@Test public void funtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "funtest.in");
	}

	@Test public void decltest() {
		Util.testValidSyntax(TEST_DIRECTORY, "decltest.in");
	}
	@Test public void subtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "subtest.in");
	}
	@Test public void addtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "addtest.in");
	}
	@Test public void divtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "divtest.in");
	}
	@Test public void multest() {
		Util.testValidSyntax(TEST_DIRECTORY, "multest.in");
	}
	@Test public void allexprtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "allexprtest.in");
	}
	@Test public void gcdtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "gcd.in");
	}
	@Test public void addmultest() {
		Util.testValidSyntax(TEST_DIRECTORY, "addmultest.in");
	}
	@Test public void paramtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "paramtest.in");
	}
	@Test public void whiletest() {
		Util.testValidSyntax(TEST_DIRECTORY, "whiletest.in");
	}
	@Test public void randomtest() {
		Util.testValidSyntax(TEST_DIRECTORY, "randomtest.in");
	}
	@Test public void funcalltest() {
		Util.testValidSyntax(TEST_DIRECTORY, "funcalltest.in");
	}


}
