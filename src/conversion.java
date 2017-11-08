import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// Scanner 
		Scanner sc = new Scanner(System.in);
		
		// variable initialisation 
		
		System.out.println("TEMPARUTURE CONVERTOR");
		System.out.println("=====================");
		
		
		// ask with conversion user wants
		System.out.println("Which conversion are you willing to make :");
		System.out.println("1 - Celsius to Fahrenheit");
		System.out.println("2 - Fahrenheit to Celsius");
		
		// if user choose a number but 1 or 2
		System.out.println("Wrong choice, you can only convert Celsius and Fahrenheit");
		// take a val
		System.out.println("Temperature to convert :");
			// if celsius convert to degree
			// if degree convert to celsius
			// if other then invalid
		// display result
		System.out.println(" °F refers to : " + " °C.");
		// ask if user is willing to make an other conversion
		System.out.println("Are you willing to convert an other temperature ? (Y/N)");
		
		// Quit
		System.out.println("Good Bye");
	}
	
	// round a number
	public static double arrondi (double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

}
