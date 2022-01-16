import java.awt.image.AreaAveragingScaleFilter;

public class innerclass {
	class addition{
		
		int a=10;
		int b=20;
		int c=a+b;
	private	 void display() {
			System.out.println("sum of two numbers : "+c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclass A=new innerclass();
		innerclass.addition add=A.new addition(); 
		add.display();
		
	
		
	}

}
