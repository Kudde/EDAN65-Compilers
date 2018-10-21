package lang;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import beaver.Parser.Exception;

import lang.ast.Program;
import lang.ast.LangParser;
import lang.ast.LangScanner;

public class Interpreter {
	/**
	 * Entry point
	 * @param args
	 */

    public static Object DrAST_root_node; //Enable debugging with DrAST

	public static void main(String[] args) {
                System.out.println("HEj hej");
		try {
			if (args.length != 1) {
				System.err.println(
						"You must specify a source file on the command line!");
				System.exit(1);
				return;
			}

			String filename = args[0];
			LangScanner scanner = new LangScanner(new FileReader(filename));
			LangParser parser = new LangParser();
			Program program = (Program) parser.parse(scanner);
                        if (program.errors().size() > 0) {
                                System.err.println( "The program does not compile correctly!");
                                System.exit(1);
                                return;
                        } else {
                                System.out.println("Starting program eval");
                                program.eval();
                        }


		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace(System.err);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
