public class AverageArrayOfElement {
    public static void main(String[] args) {
//   que3:-     Average of Array Elements:
//
//        Task: Create a float array of size 7. Write a program to calculate the average of the elements in the array.
//                Sample Input: [1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f]
//        Sample Output: Average = 4.7857143
        float[] Array = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f};
        float sum= 0;
        double Average;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        Average = ( sum / Array.length);
        System.out.println("Average = " + Average);
    }
}
