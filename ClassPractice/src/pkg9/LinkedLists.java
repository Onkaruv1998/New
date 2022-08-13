package pkg9;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list=new LinkedList();
		list.add(78);
		list.add(96);
		list.add(52);
		list.add(32);
		list.add(87);
		list.add(52);
		
		System.out.println(list.get(3));
		
		list.add(4, 500);
		System.out.println(list);
		
		list.remove(4);
		System.out.println(list);
		
		for(int a=0;a<list.size();a++)
		{
			System.out.println(list.get(a));
		}
		
		Iterator it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
