import java.util.Scanner;
public class typecasting {
	public static void main(String Arg[]) {
		char a='C';
		float b=a;
		System.out.println(b);
		double c=b;
		System.out.println(c);
		System.out.println("Enter the input : ");
		Scanner sc= new Scanner(System.in);
		double d=sc.nextInt();
		float e=(float)d;
		System.out.println(e);
		int f=(int)e;
		System.out.println(f);}
}
