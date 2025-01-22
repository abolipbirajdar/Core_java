package lab2;

//Write a program to check given number is prime number or not

import java.util.Scanner; // Importing the Scanner class for user input

public class PrimeCheck {
	
	public static void main(String[] args) {
        int num, count = 0; // Declare variables: num for input and count for counting divisors
        
        System.out.println("Enter any number: "); // Prompt the user to enter a number
        
        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt(); // Read the integer input for the prime number check
        
        // Loop to count the divisors of the number
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // Check if i is a divisor of num
                count++; // Increment the count if i divides num
            }
        }

        // A prime number has exactly two divisors: 1 and itself
        if (count == 2) {
            System.out.println("The number is prime: " + num); // Output if the number is prime
        } else {
            System.out.println("The number is not prime"); // Output if the number is not prime
        }
        
        
    }
}

/* Output:
  *Enter any number: 17
  *The number is prime: 17
   
  *Enter any number:20
  *The number is not prime
*/


	


