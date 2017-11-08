import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// Scanner 
		Scanner sc = new Scanner(System.in);
		
		// variable initialisation 
		double toConvert, converted=0;
		char response=' ', mode=' ';
		
		System.out.println("TEMPARUTURE CONVERTOR");
		System.out.println("=====================");
		
		do { // while user is willing to test temperature 
			// ask which conversion user wants
			mode = ' ';
			System.out.println("Which conversion are you willing to make :");
			System.out.println("1 - Celsius to Fahrenheit");
			System.out.println("2 - Fahrenheit to Celsius");
			mode = sc.nextLine().charAt(0);
			
			// if user choose a number but 1 or 2
			if (mode != '1' && mode != '2') {
			System.out.println("Wrong choice, you can only convert Celsius and Fahrenheit");
			} while (mode != '1' && mode != '2');
 		
		// take a val
		System.out.println("Temperature to convert :");
		toConvert = sc.nextDouble();
		sc.nextLine(); // emptu line 
			// if celsius convert to fahrenheit
		if(mode = '1') {}
			// if fahrenheit convert to celsius
		if(mode = '2') {}
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
