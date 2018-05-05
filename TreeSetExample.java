import java.util.*;  
class TreeSetExample{  
 public static void main(String args[]){  
  
  TreeSet<String> al=new TreeSet<String>();  
  al.add("parth");  
  al.add("abc");  
  al.add("pqr");  
  al.add("xyz");  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  