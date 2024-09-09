public class ShiftArrayElementQue15 {

    public static void main(String[] args) {

//  Que 15:-      Shift Array Elements:
//
//        Task: Write a Java program to shift all elements of an integer array to the left by one position.
//        Sample Input: [10, 20, 30, 40, 50]
//        Sample Output: [20, 30, 40, 50, 10]

        int[] array = {10, 20, 30, 40, 50};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[j];
                       array[j] = array[i];
                       array[i] = temp;
                }
            }
            System.out.print(array[i]);
            if(i != array.length -1){
                System.out.print(", ");
            }
        }

    }
}
