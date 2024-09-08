import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
//       2. Sum of Array Elements:
//
//        Task: Write a program to calculate the sum of all elements in an integer array of size 10.
//        Sample Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        Sample Output: Sum = 55

        int[]Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        System.out.println("sum =  " + sum );
    }
}
