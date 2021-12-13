package JavaBasicPrograms;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int temp = 0;
		System.out.println(a);
		System.out.println(b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap: "+a);
		System.out.println("After swap: "+b);
	}
}

