package JavaBasicPrograms;
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int N = sc.nextInt();
		int R = 1;
		for(int i = 1; i <= N; i++) {
			R = R*2;
			System.out.println(R);
		}
		
	}

}

