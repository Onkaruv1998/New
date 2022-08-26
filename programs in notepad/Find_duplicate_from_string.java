package pack_123;

import java.util.Arrays;

public class Find_duplicate_from_string {
	public static void main(String[] args) {
		String a= "vecocity class katraj class pune class 2022 batch";
		String x []=a.split(" ");
		System.out.println(Arrays.toString(x));
		
		for(int i=0;i<(x.length-1);i++) {
			String f=x[i];
			int count=0;
			for(int j=i+1;j<x.length;j++) {
				String g=x[j];
				if(f.equals(g)) { //equals to
					count=count+1;
				}
				
			}
			
			System.out.println(f+ " repeted " +count +  " times");
		}
		System.out.println(Arrays.toString(x));
		
		
		
	}
}

