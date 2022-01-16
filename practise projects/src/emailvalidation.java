
	import java.util.ArrayList;
	import java.util.Scanner;
	public class emailvalidation {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<String> list = new ArrayList<>();
	list.add("moshaanilkumar@gmail.com");
	list.add("moshaanil49@gmail.com");
	list.add("akhilacreddy@gmail.com");
	list.add("c.akhilareddy@gmail.com");
	System.out.println(list);
	System.out.println("enter the mailid to find : ");
	Scanner sc = new Scanner(System.in);
	String mailid=sc.nextLine();
	for(String ref : list) {
	if (list.contains(mailid)){
	System.out.println("mailid you entered is true");
	break;
	}
	else {
	System.out.println("plese enter the correct mail id ");
	break;
	}
	}
	}
	}

