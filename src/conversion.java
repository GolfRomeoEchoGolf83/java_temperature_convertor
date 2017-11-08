import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// Scanner 
		Scanner sc = new Scanner(System.in);
		
		// ask with conversion user wants
		// take a val
			// if celsius convert to degree
			// if degree convert to celsius
			// if other then invalid
		// display result
		// ask if user is willing to make an other conversion
	}
	
	// arrond a number
	public static double arrondi (double A, int B) {
		return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

}
