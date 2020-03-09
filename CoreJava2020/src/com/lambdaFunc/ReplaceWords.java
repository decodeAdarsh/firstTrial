package com.lambdaFunc;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class ReplaceWords {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Adarsh");
		ar.add("Subudhi");
		ar.add("Suraj");
		UnaryOperator<String> ur=(String s)->s.replaceAll(s,s.toUpperCase());
		check(ar,ur);
		System.out.println(ar);
	}
	
	public static void check(ArrayList<String> ar,UnaryOperator<String> ur) {
		for(int i=0;i<ar.size();i++) {
			String a=ur.apply(ar.get(i));
			ar.set(i,a);
		}

	}

}
