package lab1;

import java.util.Scanner;//importing Scanner class

public class VotingEligibility {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Ask the user for their age
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        //  Check if the age is 18 or more
        if (age >= 18) {
            System.out.println("*****--------------You are eligible to vote.-----------*********");
        } else {
            System.out.println("*****--------------You are not eligible to vote.-------*********");
        }

        
    }

}
