import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleStat {
	public static void main(String[] args) {
		
		printPrompt("Enter integer ( 0 or minus for Exit)");

		List<Integer> positiveNumbers = getPositiveNumbers();

		final long sum = getSum(positiveNumbers);
        printValue("Sum: ", sum);

        final long product = getProduct(positiveNumbers);
		printValue("Product: ", product);
	}

    private static void printPrompt(String prompt) {
        System.out.println(prompt);
    }

    private static List<Integer> getPositiveNumbers() {
        List<Integer> ns = new ArrayList<>();
        Scanner s1 = new Scanner(System.in);
		while (true) {
			int n = s1.nextInt();
			if (n <= 0)
				break;
			ns.add(n);
		}
		s1.close();
    }

    private static long getSum(List<Integer> ns){
        long s = 0;
		for (int i : ns) {
			s += i;
		}
        return s;
    }

    private static long getProduct(List<Integer> ns){
        long p = 1;
        for (int i : ns) {
			p *= i;
		}
        return p;
    }

    private static void printValue(String string, final long value) {
        System.out.println(string + value);
    }

}