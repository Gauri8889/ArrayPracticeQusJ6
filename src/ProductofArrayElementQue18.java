import java.lang.reflect.Array;

public class ProductofArrayElementQue18 {
    public static void main(String[] args) {
//   Que 18 :-     Product of Array Elements:
//
//        Task: Write a Java program to find the product of all elements in a double array.
//        Sample Input: [1.5, 2.0, 3.5]
//        Sample Output: Product = 10.5
        double[] Array = {1.5, 2.0, 3.5};
        double product = calculateProduct(Array);

        // Print the result
        System.out.println("Product = " + product);
    }


    public static double calculateProduct(double[] array) {
        double product = 1.0;
        for (double number : array) {
            product *= number;
        }
        return product;
    }
}
