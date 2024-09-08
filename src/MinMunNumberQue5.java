public class MinMunNumberQue5 {
    public static void main(String[] args) {
//  Que5:-      Find Minimum Element:
//
//        Task: Write a Java program to find the minimum value in a double array.
//        Sample Input: [2.5, 3.8, 1.9, 5.6, 4.3]
//        Sample Output: Minimum Element = 1.9
        double[] array = {2.5, 3.8, 1.9, 5.6, 4.3};
        double min = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("MinmumNumber = " + min);
    }

    }
