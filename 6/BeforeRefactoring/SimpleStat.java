import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class NumArrayMethod{
	private void printInputMessage(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter integer ( 0 or minus for Exit)");
	}
	private void closeInputMessage(){
		s1.close();
	}
	private List<Integer> getNumArray(){
		List<Integer> ns = new ArrayList<>();
		while (true) {
			int n = s1.nextInt();
			if (n <= 0)
				break;
			ns.add(n);
		}
		return ns;
	}
	
}
public class SumMethod {
	long sum = 0;
	private long getSum(List numArray){
		for (int element : numArray) {
			sum += element;
		}
		return sum;
	}
	private void printSum(long sum){
			System.out.println("Sum: " + sum);
	}
}
public class ProductMethod {
	long product = 1;
	private long getProduct(List numArray){
		for (int element : numArray) {
			product *= element;
		}
		return product;
	}
	private void printProduct(long product){
		System.out.println("Product: " + product);
	}
}
