import java.util.Scanner;

public class ElementSearchInArrayQue7 {
    public static void main(String[] args) {
//     Que 7:-   Element Search in Array:
//
//        Task: Write a Java program to search for a specific integer in an array and print its index if found.
//                Sample Input: Array: [4, 8, 15, 16, 23, 42],
//                Search Element: 16
//        Sample Output: Element 16 found at index 3
        Scanner scanner = new Scanner(System.in);
        int[] number = {4, 8, 15, 16, 23, 42};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if(i != number.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("enter search Element");
        int SearchElemnet = scanner.nextInt();

        for (int i = 0; i < number.length; i++) {
            if(SearchElemnet == number[i]){
                System.out.println("Element 16 found at index = " + i);
            }
        }
    }
}
