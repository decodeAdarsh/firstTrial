package com.lambdaFunc;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FirstLetter {

	
		static StringBuilder s=new StringBuilder("");
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<StringBuilder> ar=new ArrayList<StringBuilder>();
			ar.add(new StringBuilder("Adarsh"));
			ar.add(new StringBuilder("Subudhi"));
			ar.add(new StringBuilder("Tushar"));
			ar.add(new StringBuilder("Bikash"));
			Consumer<StringBuilder> consumer=(StringBuilder s1)->s.append(s1.charAt(0));
			check(ar,consumer);
			System.out.println(s+"\n");
		}
		
		public static void check(ArrayList<StringBuilder> ar,Consumer c) {
			for(StringBuilder a:ar) {
				c.accept(a);
			}
		}

	}


