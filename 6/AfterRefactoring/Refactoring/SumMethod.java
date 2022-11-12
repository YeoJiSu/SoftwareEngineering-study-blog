package Refactoring;
import java.util.List;

public class SumMethod {
    static long sum = 0;
    static long getSum(List<Integer> numArray){
        for (int number : numArray) {
            sum += number;
        }
        return sum;
    }
    static void printSum(long sum){
        System.out.println("Sum: " + sum);
    }
}
