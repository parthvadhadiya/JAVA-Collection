import java.util.*;
class LinkedListExample{
	public static void main(String str[]){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("parth");
		ll.add("abc");
		ll.add("xyz");
		
		//ll.remove("xyz");
		//this is example of java list interface.
		ll.add(1,"new");
		/*
		Iterator it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
		
		for(String temp:ll){
			System.out.println(temp);
			
		}
		
	}
	
}