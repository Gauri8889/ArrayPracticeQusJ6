public class FindSecondLargestNumberQue10 {
    public static void main(String[] args) {
//    Que 10 :- Find Second Largest Element:
//
//        Task: Write a program to find the second-largest element in an integer array.
//                Sample Input: [15, 22, 8, 19, 31]
//        Sample Output: Second Largest Element = 22
        int[] array = {15, 22, 8, 19, 31};
        int LargestNumber = array[0];
        int SecondLargestNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if(LargestNumber < array.length){
                LargestNumber = array[i];

            }
        }
        System.out.println("LargestNumber = " + LargestNumber);
        for (int i = 0; i < array.length; i++) {
            if(SecondLargestNumber < array[i] && LargestNumber != array[i]){
                SecondLargestNumber = array[i];
            }
        }
        System.out.println("secondLargestNumber = " + SecondLargestNumber);
    }
}
