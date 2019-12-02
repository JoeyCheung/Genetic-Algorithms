import java.io.*; 
import java.util.Scanner;

public class Main {

	private static Constraints functions;
	private static MaxFunction toAnswer;
	
    public static void main(String[] args) throws FileNotFoundException {
    	String currentDirectory = System.getProperty("user.dir");
    	Scanner in = new Scanner(new File(currentDirectory + "/data.txt"));
    	System.out.println(currentDirectory + "data.txt");
    	String number = "";
    	while (in.hasNext()) {
    		number = number + " " + in.next();
    	}
    	
    	String[] number1 = number.split(" ");
    	int[] parsed = new int[number1.length];
    	for(int i = 0; i < number1.length - 1; i++) {
    		parsed[i] = Integer.parseInt(number1[i+1]);
    	}
    	
        functions = new Constraints(parsed[0]);
        toAnswer = new MaxFunction(parsed[1]);

        int[][] toMaximize = functions.generateConstraintFunctions();
        int[] toBeMaximised = toAnswer.generate();

        Printer printer = new Printer();
        printer.print(toBeMaximised);
        printer.print(toMaximize);

    }
}
