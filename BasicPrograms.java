package JavaBasicPrograms;
import java.util.Scanner;

public class LargstOfThree {

	public static void main(String[] args) {
		int a; 
		int b;
		int c;
		int largest;
		int temp;
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		
		temp=a>b?a:b;  
		largest=c>temp?c:temp;  
		
		System.out.println("The largest number is: "+largest);  
		}  
}



