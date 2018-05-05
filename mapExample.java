import java.util.*;
class mapExample{
	public static void main(String arg[]){
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1,"parth");
		map.put(3,"a");
		map.put(2,"b");
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue()); 
		}
	}
	
}