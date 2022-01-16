import java.util.Scanner;
public class arthamaticcalculator {
public static void main(String[] args) {
// TODO Auto-generated method stub
// double Ans;
Scanner sc=new Scanner(System.in);
System.out.println("eneter the two numbers");
int firstnum=sc.nextInt();
int secnum= sc.nextInt();
System.out.println("Enter the operator : ");
char op=sc.next().charAt(0);
double Ans=0;
switch(op){
case '+': Ans=firstnum+secnum;
System.out.println("Sum of two numbers is : "+Ans);
break;
case '-':Ans=firstnum-secnum;
System.out.println("difference between two numbers is : "+Ans);
break;
case '*': Ans=firstnum*secnum;
System.out.println("product of two numbers is : "+Ans);
break;
case '/':Ans=firstnum/secnum;
System.out.println("divison of two numbers is : "+Ans);
break;
}
// System.out.println("the answer is " +Ans);
return;
}
}
