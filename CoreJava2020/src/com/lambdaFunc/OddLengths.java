package com.lambdaFunc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class OddLengths {

	public static void main(String[] args) {
		List<String> arrList=new ArrayList<String>();
		arrList.add("Adarsh");
		arrList.add("Subudhi");
		arrList.add("Mr.Suraj");
		arrList.add("Anand");
		
			
		
		arrList.removeIf((name)->name.length()%2!=0);
		System.out.println(arrList);

	}

}
