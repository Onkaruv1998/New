package pkg10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Object,Object>map=new HashMap();
		
		map.put(1,"Mumbai");
		map.put(1,"satara");
		map.put("pune","Mumbai");
		map.put(15,"56");
		map.put(3,"Goa");
		map.put(4,"Banglore");
		
		System.out.println(map);
		
		for(Map.Entry<Object,Object>k:map.entrySet())
		{
			System.out.println(k.getKey()+"---> "+k.getValue());
		}
		
		Set mapset=map.entrySet();
		Iterator it=mapset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
