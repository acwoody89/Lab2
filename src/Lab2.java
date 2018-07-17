import java.util.Scanner;


/**
* <h1>Individual Total Sum</h1>
* Asks the user for length, width, and height of a room.
* Then spits back out the area, perimeter, and volume of the room.
* At the end, the program will ask if the user would like to continue
*   using "Y" and "y", or "N" and "n" 
* 
** @author  Alex Wood
* @version 1.0
* @since   7/16/2018
*/
public class Lab2 {

	public static void main(String[] args) {
		getPerimeter();
	}


	public static void getPerimeter() {
		double length = 0;
		double width = 0;
		double height = 0;
		double perimeter = 0;
		double area = 0;
		double volume = 0;
		
		String userAns = "y"; // used to check if the user wants to continue
		
		Scanner scan = new Scanner(System.in);
		
		while (userAns.equals("y") || userAns.equals("Y")) {
			System.out.println("************************************************");
			System.out.println("Please enter the length of the classroom.");
			length = scan.nextDouble();

			System.out.println("Please enter the width of the classroom");
			width = scan.nextDouble();
			
			System.out.println("Please enter the length of the classroom.");
			height = scan.nextDouble();
			
			/*
			 * entered into formulas are the user inputed length, width, and height 
			 */
			perimeter = 2 * (length + width);  
			area = length * width;
			volume = length * width * height;
			
			System.out.println("************************************************");
			System.out.println("The Area: " + (int)area);           // casts area as an int to truncate
			System.out.println("The Perimeter: " + (int)perimeter); // casts perimeter as an int to truncate
			System.out.println("The Volume: " + (int)volume);		// // casts volume as an int to truncate
			System.out.println("************************************************");
			System.out.println("Continue? (Y/N)");
			
			userAns = scan.next();
			
			/*
			 * Changes userAns to N to exit the while loop,
			 * could change it to anything but "y" or "Y" to exit while 
			 */
			if ((userAns == "N") || (userAns == "n")) {
				userAns = "N";
			}
			
		}
		
		scan.close();
	}
}
