package JavaBasicPrograms;
import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend: ");
		int a = sc.nextInt();
		System.out.println("Enter the Divisor: ");
		int b = sc.nextInt();
		int Q = 0;
		int R = 0;
		Q = (a/b);
		System.out.println("Quotient= "+Q);
		R = (a%b);
		System.out.println("Remainder= "+R);
	}

}

