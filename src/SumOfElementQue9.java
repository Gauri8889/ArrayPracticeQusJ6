public class SumOfElementQue9 {
    public static void main(String[] args) {
//  Que 9 :-      Sum of Even Elements:
//
//        Task: Write a Java program to find the sum of all even numbers in an integer array.
//        Sample Input: [1, 2, 3, 4, 5, 6, 7, 8]
//        Sample Output: Sum of even elements = 20
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;

        for (int i = 0; i < Array.length; i++) {
            if(Array[i] % 2 == 0){
                sum = sum + Array[i];
            }
        }
        System.out.println("Sum of even element = " + sum);

    }
}
