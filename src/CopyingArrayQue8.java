public class CopyingArrayQue8 {
    public static void main(String[] args) {
//    Que 8:-    Copying Arrays:
//
//        Task: Create two integer arrays of size 5. Write a program to copy the elements of the first array into the second array.
//                Sample Input: First Array: [1, 2, 3, 4, 5]
//        Sample Output: Second Array: [1, 2, 3, 4, 5]
            int[] firstArray = {1, 2, 3, 4, 5};
            int SecondArray;
            int temp;

        for (int i = 0; i < firstArray.length; i++) {
            SecondArray = firstArray[i];
            System.out.print(SecondArray);
            System.out.print(", ");
        }
    }
}
