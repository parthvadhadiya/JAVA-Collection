import java.util.*;
class students{
	int id;
	String name, email;
	boolean adult;
	public students(int id,String name, String email, boolean adult){
		this.id = id;
		this.name = name;
		this.email = email;
		this.adult = adult;
	}
	
}

class ListIterator{
	
	public static void main(String arg[]){
	List<students> ll = new LinkedList<students>();
	
	students obj1 = new students(1,"parth", "parth@g.com", true);
	students obj2 = new students(2,"abc", "abc@y.com", true);
	students obj3 = new students(3,"xyz", "xyz@l.com", false);
	
	ll.add(obj1);
	ll.add(obj2);
	ll.add(obj3);
	
	for(students st:ll){
		System.out.println(st.id+" "+st.name+" "+st.email+" "+st.adult);
		
	}
	
	}
}