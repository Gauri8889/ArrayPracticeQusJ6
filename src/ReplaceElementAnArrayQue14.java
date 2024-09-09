public class ReplaceElementAnArrayQue14 {
    public static void main(String[] args) {

//   Que 14 :-     Replace Elements in an Array:
//
//        Task: Write a program to replace all occurrences of a specific integer in an array with another integer.
//                Sample Input: Array: [4, 5, 6, 4, 7], Replace 4 with 9
//        Sample Output: [9, 5, 6, 9, 7]
        int[] array = {4, 5, 6, 4, 7};
        int ReplaceElement = 4;
        for (int i = 0; i < array.length; i++) {
            if(ReplaceElement == array[i]){
                array[i] = 9;
            }
            System.out.print(array[i]);
            System.out.print(", ");
        }
    }
}
