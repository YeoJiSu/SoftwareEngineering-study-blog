import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleStat {
	public static void main(String[] args) {
		
		System.out.println("Enter integer ( 0 or minus for Exit)");
		List<Integer> ns = getPositiveNumbers();

        // 합 구하기
		long s = 0;
		for (int i : ns) {
			s += i;
		}
        System.out.println("Sum: " + s);

        // 곱 구하기
        long p = 1;
        for (int i : ns) {
			p *= i;
		}
		System.out.println("Product: " + p);
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
}