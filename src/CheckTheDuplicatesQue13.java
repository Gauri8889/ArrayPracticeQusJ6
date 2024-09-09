public class CheckTheDuplicatesQue13 {
    public static void main(String[] args) {

//    Que 13:-    Check for Duplicates:
//
//        Task: Write a program to check if there are any duplicate elements in an integer array.
//                Sample Input: [7, 3, 9, 2, 3, 8]
//        Sample Output: Duplicate found: 3
        int[] array = {7, 3, 9, 2, 3, 8};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if(array[i]  == array[j]){

                    System.out.println("DuplicateNumber = " + array[i]);
                }
            }
        }
    }
}
