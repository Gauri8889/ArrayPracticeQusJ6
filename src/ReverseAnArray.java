public class ReverseAnArray {
    public static void main(String[] args) {
//    Que 6:-    Reverse an Array:
//
//        Task: Create a program to reverse the elements in a character array and print the reversed array.
//        Sample Input: [Reverse an Array:
//          Sample Input: ['a', 'b', 'c', 'd', 'e']

// Sample Output: ['e', 'd', 'c', 'b', 'a']
        char[]Array = {'a', 'b', 'c', 'd', 'e'};
        char reverse ;


        for (int i =  Array.length - 1 ; i >=0; i--) {
            System.out.print(Array[i]);
            if(i != Array.length - 5){
                System.out.print(", ");
            }
        }

    }
}
