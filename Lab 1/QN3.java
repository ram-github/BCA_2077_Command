//WAP to read 3 digit no. & find sum of square of digits.
import java.util.Scanner;
class QN3{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a 3 digit no.: ");
		int n=sc.nextInt();
		int s=0;
		int c=0;
		while(n!=0)
		{
			int rem=n%10;
			s=s+rem*rem;
			n=n/10;
			c++;
		}
		if(c==3)
			System.out.println("Sum of squares of digits: "+s);
		else
			System.out.println("Sorry Pls input 3 digit no");
	}
}