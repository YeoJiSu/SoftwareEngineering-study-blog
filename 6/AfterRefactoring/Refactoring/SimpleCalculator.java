package Refactoring;
import java.util.List;
import static Refactoring.NumArrayMethod.*;
import static Refactoring.ProductMethod.*;
import static Refactoring.SumMethod.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        printInputMessage();
        List<Integer> numArray = getNumArray();
        closeInputMessage();

        long sum = getSum(numArray );
        long product = getProduct(numArray );

        printSum(sum);
        printProduct(product);
    }
}
