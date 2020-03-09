package com.Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenTypeValue {

	public static void printMapKeyValues(Map<? extends Number,?> hmap)
	{
		Iterator<? extends Number> itr=(Iterator<? extends Number>) hmap.keySet().iterator();
		while(itr.hasNext())
		{
			Number n=(Number)itr.next();
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
	 HashMap<Number,String> hmap=new HashMap<Number,String>();
	 hmap.put(12,"Twelve");
	 hmap.put(45,"Forty Five");
	 hmap.put(69,"Sixty Nine");
	 printMapKeyValues(hmap);
		

	}

}
