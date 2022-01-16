import java.util.*;
public class maps {

	public static void main(String[] args) {
		HashMap<Integer,String> emps=new HashMap<>();
		emps.put(101,"harsha");
		emps.put(102, "anil");
		emps.put(103, "akhila");
		emps.remove(104, "chitra");
		System.out.println("usha"+emps);
//		hashtable
		Hashtable<Integer,String> studs=new Hashtable<>();
		studs.put(101,"telugu");
	      studs.put(102,"hindi");  
	     studs.put(103,"english");  
	      studs.put(104,"maths");  
	      studs.put(105,"science");  

	      for(Map.Entry n:studs.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

			
		}
	}


