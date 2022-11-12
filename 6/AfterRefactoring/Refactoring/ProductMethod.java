package Refactoring;
import java.util.List;

public class ProductMethod {
    static long product = 1;
    static long getProduct(List<Integer> numArray){
        for (int number : numArray) {
            product *= number;
        }
        return product;
    }
    static void printProduct(long product){
        System.out.println("Product: " + product);
    }
}
