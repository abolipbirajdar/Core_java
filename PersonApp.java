package task2;
/*Create a parent class called "Person" with attributes such as 
 * name, age, and a method called "speak". Create a child class called "Student" 
 * that inherits from Person and has an additional attribute called "grade" and 
 * a method called "study". Create an object of the Student class and call both 
 * the "speak" and "study" methods.*/

// Main application class
public class PersonApp {
    // Main method where program execution begins
    public static void main(String args[]) {
        // Create a new Student object
        Student std = new Student();
        
        // Call the speak method inherited from Person
        std.speak();
        
        // Call the study method specific to Student
        std.study();
    }
}

// Parent class representing a Person
class Person {
    // Attributes: name and age
    String name = "Person";
    int age = 20;

    // Method to print a message when called
    void speak() {
        System.out.println(name + " is speaking.....");
    }
}

// Child class representing a Student, inheriting from Person
class Student extends Person {
    // Additional attribute: grade
    float grade = 10;

    // Method to print a message when called
    void study() {
        System.out.println(name + " is studying..... Grade: " + grade);
    }
}

/*Output:
Person is speaking.....
Person is studying..... Grade: 10.0
*/