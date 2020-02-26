package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		testArrayList();

	}
	private static void testArrayList()
	{
		
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Adarsh");
		arrList.add("Subudhi");
		arrList.add("Suraj");
		arrList.add("Anand");
	
		for(int i=arrList.size()-1;i>=0;i--) {
			ListIterator<String> litr=arrList.listIterator(i);
			String name = litr.next();
			System.out.println(name);
		}
	}

}
