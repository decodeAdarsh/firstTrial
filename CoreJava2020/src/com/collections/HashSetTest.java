package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From -HashSet\n");
		testHashSet();
		System.out.println("From -Linked HashSet\n");
		testLinkedHashSet();
	}
	private static void testHashSet() {
		Set<String> hset = new HashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");
		
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
	private static void testLinkedHashSet() {
		LinkedHashSet<String> hset = new LinkedHashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");
		
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}

}
