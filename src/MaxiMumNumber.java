public class MaxiMumNumber {
    public static void main(String[] args) {
//     que4:-   Find Maximum Element:
//
//        Task: Given an integer array, write a program to find and print the maximum element in the array.
//        Sample Input: [5, 12, 3, 19, 7, 26, 14]
//        Sample Output: Maximum Element = 26
        int[] array = {5, 12, 3, 19, 7, 26, 14};
        int max = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("MaximumNumber = " + max);
    }


    }

