import java.util.*;
class ArrayListExample{
	public static void main(String arg[]){
		ArrayList<String> lt = new ArrayList<String>();
		lt.add("parth");
		lt.add("abc");
		lt.add("xyz");
		
		// -> iterate using iterater
		/*Iterator i = lt.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		
		// -> iterate using for each loop
		for(String temp:lt){
			System.out.println(temp);
		}
		
	}
	
}

/*
-> lt.addAll(lt1); for adding all elements from lt1 ArrayList to lt ArrayList
-> lt.addAll(lt1); for removing all elements from lt1 ArrayList to ArrayList
-> lt.retainAll(lt1); for fetch comman element from this two ArrayList 
*/