import java.util.Scanner;

public class ArrayQuetion1 {
    public static void main(String[] args) {
        // que;1- Integer Array Initialization

        //Task: Create an integer array of size 5 and initialize it with the value 10,20,30,40,and 50.
        //Sample input : None (initialize directly).
        //Sample Output : [10,20,30,40,50]

        Scanner scanner = new Scanner(System.in);
        int size = 5;
        int[] intArray = new int[size];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("enter integer");
            intArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            if (i != intArray.length - 1){
                System.out.print(", ");
            }

        }
    }
}
