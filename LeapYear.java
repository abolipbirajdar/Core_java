package lab1;
import java.util.Scanner;

	public class LeapYear {
		public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        //  Ask the user to enter a year
		        System.out.print("Please enter a year: ");
		        int year = sc.nextInt();

		        //  Check if the year is a leap year
		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		            System.out.println(year + " is a leap year.");
		        } 
		        else {
		            System.out.println(year + " is not a leap year.");
		        }

		        
		    }
		}
		


