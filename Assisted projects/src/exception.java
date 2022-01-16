import java.util.Scanner;
public class exception {
	int firstnum,secnum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int firstnum=0,secnum=0;
		System.out.println("enter the two numbers : ");
		Scanner sc= new Scanner(System.in);
		int firstnum=sc.nextInt();
		int secnum = sc.nextInt();
		new exception().mulnumber(firstnum,secnum);
		new exception().divnumbers(firstnum,secnum);
		new exception().mod(firstnum,secnum);
		
	}

  void  mulnumber(int firstnum,int secnum) {
	int Result;
	Result=firstnum*secnum;
	System.out.println(" mul of 2numbers : "+Result);
	}
  void divnumbers(int firstnum,int secnum) {
	  float Result;
	  try {
		  Result=firstnum/secnum;
		  System.out.println(" div of 2numbers : "+Result);
		}catch (ArithmeticException ae) {
			  System.out.println(" div of "+ firstnum+ "with 0 is not possible");
				
		}
		
  }
  void mod(int firstnum,int secnum) {
	  int Result;
		Result=firstnum%secnum;
		System.out.println(" mod of 2numbers : "+Result);
		
  }
}
