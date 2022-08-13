package pkg10;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Object,Object>map1=new Hashtable<>();
		
		map1.put(1,"Mumbai");
		map1.put(1,"satara");
		map1.put("pune","Mumbai");
		map1.put(15,"56");
		map1.put(3,"Goa");
		map1.put(4,"Banglore");
		
		System.out.println(map1);
	}

}
