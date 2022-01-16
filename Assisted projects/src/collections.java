import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;

public class collections {

	public static void main(String[] args) {
		ArrayList<String> anil=new ArrayList<>();
		HashSet<Integer> harsha = new HashSet();
		
//		adding elements to arraylist
		anil.add("anil");
		anil.add("akhila");
		anil.add("harsha");
		anil.add("karunakar");
		anil.add("jayamma");
		System.out.println("array list is : " +anil);
		anil.remove("harsha");
		System.out.println("array list is : " +anil);
//operation with linked arraylist
		LinkedList<String> car=new LinkedList<>();
		car.add("creta");
		car.add("audi q6");
		car.addFirst("ambasidor");
		car.addLast("kia seletos");
		System.out.println("linkedlist is : " +car);

//adding elements into hashset
		harsha.add(101);
		System.out.println(harsha);
//operation with linkedhashset
		
	}

}
