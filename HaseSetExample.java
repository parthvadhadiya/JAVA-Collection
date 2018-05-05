import java.util.*;  
class HaseSetExample{  
 public static void main(String args[]){  
  HashSet<String> set=new HashSet<String>();  
  set.add("parth");  
  set.add("xyz");  
  set.add("abc");  
  set.add("pqr");  
  
  set.remove("xyz");
  
  Iterator itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}