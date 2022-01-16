import java.util.Scanner;
public class trycatch {
int num1,num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the numbers to perform divison: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		new trycatch().divide();
	}


void divide() {
	
	try {
		int res= num1/num2;
		System.out.println("result of 2 numbers  :"+res);

	}catch(ArithmeticException ae){
		System.out.println("exception occured");
	}
}
}