public class sleepandwait extends Thread
		{
			int a=10;
			int b=20;
			int c =a*b;
			int d=a+b;
		 	public void run()
		 	{
		  		System.out.println("product of two numbers is :"+c);
		}
		 	public static void main( String args[] ) throws InterruptedException
		 	{
		  		sleepandwait mt = new  sleepandwait();
		  		mt.start();
		  		Thread.sleep(1000);
		  		System.out.println("Product of two numbers displayed");
		 	}
		

	}


