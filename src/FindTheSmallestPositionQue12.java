public class FindTheSmallestPositionQue12 {
    public static void main(String[] args) {

//    Que12 :-    Find the Smallest Positive Number:
//
//        Task: Given an integer array, write a program to find the smallest positive number in the array.
//                Sample Input: [12, -5, 0, 8, 3]
//        Sample Output: Smallest positive number = 3
        int[] array = {12, -5, 0, 8, 3};
        int PositionNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if(PositionNumber > array[i] && array[i] > 0){
                PositionNumber = array[i];
            }
        }
        System.out.println("Smallest position number = " + PositionNumber);
    }
}
