package com.Generics;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PrintGenericsTest {
	private static void PrintNumber(List<? extends Number> arrayList) {
		Iterator<? extends Number> itr = (Iterator<? extends Number>) arrayList.iterator();
		while(itr.hasNext()) {
	    	Number n = itr.next();
			System.out.println(n);
		}
	}
	public static void main(String []args)
	{
		List<Integer> arrayListint = new ArrayList<Integer>();
		arrayListint.add(12);
		arrayListint.add(6);
		arrayListint.add(79);
		PrintNumber(arrayListint);
		
	}

}
