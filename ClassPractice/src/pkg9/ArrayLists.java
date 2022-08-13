package pkg9;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(25);
		list.add(56);
		list.add(78);
		list.add(96);
		
		System.out.println(list.size());
		
		list.set(1,777);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		ArrayList<String>list1=new ArrayList<>();
		
		list1.add("abc");
		list1.add("def");
		list1.add("xyz");
		list1.add("jkl");
		list1.add("mno");
		
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		ArrayList <Object> list2=new ArrayList<>();
		list2.add("velocity");
		list2.add(15);
		list2.add('@');
		list2.add(89);
		list2.add("classes");
		list2.add("96");
		
		int sum=0;
		for(Object k:list2)
		{
			try {
				sum=sum+Integer.parseInt(k.toString());
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(sum);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}


