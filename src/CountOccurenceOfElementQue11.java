public class CountOccurenceOfElementQue11 {
    public static void main(String[] args) {
//   Que 11:-     Count Occurrences of an Element:
//
//        Task: Write a program to count the number of times a specific character appears in a character array.
//                Sample Input: Array: ['a', 'b', 'a', 'c', 'a', 'd'], Character to count: 'a'
//        Sample Output: 'a' occurs 3 times
        char[] array = {'a', 'b', 'a', 'c', 'a', 'd'};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if(array[i] == array[j]){
                    count++;
                }
            }
        }
        System.out.println("'a' occurs " + count + " times ");
    }
}
