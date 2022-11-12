package Refactoring;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumArrayMethod {
    static Scanner s1 = new Scanner(System.in);
    static List<Integer> numArray = new ArrayList<>();

    static void printInputMessage(){
        System.out.println("Enter integer ( 0 or minus for Exit)");
    }
    static void closeInputMessage(){
        s1.close();
    }
    static List<Integer> getNumArray(){
        while (true) {
            int number = s1.nextInt();
            if (number <= 0)
                break;
            numArray.add(number);
        }
        return numArray;
    }
}
