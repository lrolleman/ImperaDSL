import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Formatter;

import org.antlr.runtime.RecognitionException;

import ImperaExceptions.ImperaException;
import ImperaSDLParser.ImperaRig;
import Global.GlobalMethods;
import Global.PersistentData;
import Global.Root;
import SymbolTable.Value;
import SymbolTable.VarValue;


public class Impera {

	public static void main(String[] args) throws RecognitionException, ImperaException, IOException {
		//System.out.println(new ImperaRig("test.imp").getDOTGraph());
		PersistentData.initFlags();
		for (String arg : args) {
			switch (arg) {
			case "-v":
				PersistentData.verbose = true;
				break;
			case "-runtests":
				//Run an initial startup program so all tests are running on a "warmed up" environment
				PrintStream out = System.out;
				System.setOut(new PrintStream(new ByteArrayOutputStream()));
				ImperaRig impstartup = new ImperaRig("Tests\\startup.imptest");
				Root testprogram = impstartup.getImperiTree();
				testprogram.execute();
				System.setOut(out);
				
				File testdir = new File("Tests");
				int numpassed = 0;
				FilenameFilter testfilter = new FilenameFilter() {
					public boolean accept(File dir, String name) {
						if (name.endsWith(".imp"))
							return true;
						else
							return false;
					}
				};
				FilenameFilter expfilter = new FilenameFilter() {
					public boolean accept(File dir, String name) {
						if (name.endsWith(".exp"))
							return true;
						else
							return false;
					}
				};
				File[] tests = testdir.listFiles(testfilter);
				File[] results = testdir.listFiles(expfilter);
				
				
				for (int i=0; i<tests.length; i++) {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					PrintStream ps = new PrintStream(baos);
					
					System.setOut(ps);
					
					long starttime = System.nanoTime();
					ImperaRig imp = new ImperaRig("Tests\\" + tests[i].getName());
					Root program = imp.getImperiTree();
					long parseend = System.nanoTime();
					Value testret = program.execute();
					long endtime = System.nanoTime();
					String result = baos.toString("UTF8");
					//System.err.print(result);
					
					String testname = tests[i].getName().substring(0, tests[i].getName().indexOf("."));
					String resultname = results[i].getName().substring(0, results[i].getName().indexOf("."));
					if (testname.equals(resultname)) {
						FileReader freader = new FileReader(results[i]);
						BufferedReader reader = new BufferedReader(freader);
						String expresult = "";
						String line = "";
						while ((line = reader.readLine()) != null) {
							expresult = expresult + line + "\n";
						}
						reader.close();
						//System.err.print(expresult);
						if (result.equals(expresult)) {
							numpassed++;
							System.err.println(tests[i].getName() + ": " + "Test Passed");
						} else
							System.err.println(tests[i].getName() + ": " + "Test Failed");
						if (PersistentData.verbose)
							System.err.format("\t%-15s %10d\n\t%-15s %10d\n\t%-15s %10d\n",
									"Parse Time:", parseend-starttime, "Run Time:", endtime-parseend, "Total:",
									 endtime-starttime);
					} else {
						System.err.println("Something went wrong in the tests");
						System.exit(-1);
					}
					System.setOut(out);
				}
				System.err.println(numpassed + "/" + tests.length + " passed");
				break;
			default:
				if (arg.endsWith(".imp")) {
					ImperaRig imp = new ImperaRig(arg);
					//System.out.println(imp.getDOTGraph());
					Root program = imp.getImperiTree();
					Value ret = program.execute();
					System.out.print("Program: " + arg + " terminated with return value: ");
					if (ret == null)
						System.out.println(ret);
					else 
						GlobalMethods.print(null, ret);
				}
			}
		}
	}

}
