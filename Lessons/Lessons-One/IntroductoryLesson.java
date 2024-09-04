/* Program: Introductory Lesson
 * Author: Sullivan Lima
 * Lesson Version: 1.0
 * Year: 2024
 * Language: Java, Version 22
 * Description: This introductory lesson aims to introduce basic Java concepts related to input and output operations on the user’s screen.
 */ 
import java.util.Scanner;

// Here we have a class named IntroductoryLesson.
// The class name is the same as the file name.
// Blank lines are used to make the code more readable.

public class IntroductoryLesson {

    /* Main method that starts the execution of the application. It is the primary method that will run the application. It starts with { and ends with } */
    
    public static void main(String[] args) {
        
        // The method below is used to display something, a text or a number, on the user's screen. We have several ways to use this method, and the first one is with println.
        // Using println displays something on the user's screen. It breaks the line as if pressing Enter.
        // If something is written after this method, it will start on a new line.
        System.out.println("First Java Program");   
        
        // The print method without the ln at the end keeps the cursor on the same line as the text appears.
        System.out.print("The famous: Hello World! ");
        
        // Here we use the print command (without ln at the end) to use backslashes and characters like quotes and \n to show how to move to a new line.
        System.out.print("Continuing with this phrase to demonstrate the behavior of print without the \"ln\".\n");
        
        // The printf command is used to format the string displayed on the screen.
        // The first argument uses a format string which can be fixed text and format specifiers.
        // Each format specifier %s occupies a place for a value and type of data output. The %n functions like \n to move to a new line.
        System.out.printf("%s%n%s%s%s", "When using printf, we can pass multiple arguments: ", "Argument 1, ", "Argument 2, ", "Other Arguments...");
        
        // Example of a code snippet that displays information on the screen and requests data from the user.
        System.out.println("Now, continuing, we will work with user input. We will use another method.");
        
        // Scanner method used to request data from the user, store it in memory, and return the input.
        Scanner input  = new Scanner(System.in);
        
        // Define a variable to store the word entered by the user.
        String userInput; 
        
        // Data output command already shown above, but reinforcing: print without ln to stay on the same line. Indicates where the user will type the word.
        System.out.print("Enter any word: ");
        
        // Retrieve the word entered by the user.
        userInput = input.next();
        
        // Phrase indicating the word entered by the user.
        System.out.printf("The word you entered was: %s%n", userInput);
                
    } // End of the main method

} // End of the IntroductoryLesson class
