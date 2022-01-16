public class threads extends Thread
{
	int a=10;
	int b=20;
	int c =a*b;
 	public void run()
 	{
  		System.out.println("product of two numbers is :"+c);
}
 	public static void main( String args[] )
 	{
  		threads mt = new  threads();
  		mt.start();
 	}
}
