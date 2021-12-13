package JavaBasicPrograms;
import java.util.Scanner;

public class FlipCoin {
	static int b = 0;
	static int c = 0;
	static int d = 0;
	static int e = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times coin Flips: ");
		final int j = sc.nextInt();
		int i=1;
		while(i<=j) {
			double a = (double)Math.floor(Math.random()*10)%2;
			if(a<0.5) {
				b++;
			}else {
				c++;
			}
			i=i+1;
		
		}
		System.out.println("Number of times Tails: "+b);
		System.out.println("Number of times Heads: "+c);
		System.out.println("Total no of times coin Flipped:"+j);
		d = (int)(b*100/j);
		System.out.println("Percentage of Tails: "+d);
		e = (int)(c*100/j);
		System.out.println("Percentage of Heads: "+e);
	}

}

