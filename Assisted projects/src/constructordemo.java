
public class constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student(501,101);
		s.display();
	}

}

class student{
	int a;
	int b;
	student(int i,int j) {
		// TODO Auto-generated constructor stub
		a=i;
		b=j;
		int c=a+b;
	}
	 void display(){
		System.out.println("Sum of two numbers is : " + (a+b));
	}
	
}
