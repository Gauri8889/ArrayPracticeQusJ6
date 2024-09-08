import java.util.Scanner;

public class CreateAnIntegerArray {
    //Write a program to create an integer array to store 5 integers. Accept the five integer values from user and print them on console.
    public static void main(String[] args){
        // Create an integer array to store 5 integers
        int[] numbers = new int[5];
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter 5 integers
        System.out.println("please enter 5 integers:");
        // Loop to read 5 integers from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();


        }
        // Close the scanner
        scanner .close();
        // Print the integers to the console
        System.out.println("You entered the following integers:");
      for (int i = 0; i < numbers.length; i++) {
         System.out.println("Integer " + (i + 1) + ": " + numbers[i]);
        }

    }

}
