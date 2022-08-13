package pkg5;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="velocity";
		if(a.equals("velocity"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(a.equalsIgnoreCase("VELOCITY"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(a.length());
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.toLowerCase());
		
		System.out.println(a.indexOf("i"));
		
		String b=a.replace("e","o");
		System.out.println(b);
		
		if(a.startsWith("vel"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(a.endsWith("ty"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println(a.concat(" pune"));
		
		String []c=a.split("");
		System.out.println(Arrays.toString(c));
		
		if(a.contains("loc"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		String d=new String("onkar");
		String e="onkar";
		
		String f=d.intern();
		if(f==e)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
