
class methods{
	String name;
	int id;
	int age;
	

public methods(String sname,int sage,int sid) {
	name=sname;
	age=sage;
	id=sid;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods m=new methods("anil",22,452);
		System.out.println(m.name + m.age + m.id);
	}
}


