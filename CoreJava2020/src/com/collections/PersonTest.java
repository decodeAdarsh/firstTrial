package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {

	private double weight;
	private double height;
	private String name;
	
	public Person(double weight, double height, String name) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person p) {
		if(this.weight > p.weight) {
			return 1;
		}
		else if (this.weight < p.weight){
			return -1;
		}
		else
		{
			 if(this.height > p.height) {
					return 1;
				}
				else if (this.height < p.height){
					return -1;
				}
				else
					return 0;
					
				}
		}
			
}


public class PersonTest {
	public static void main(String[] args) {
		
		testTreeSet();

	}
	
	private static void testTreeSet() {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person(56.67,6.7,"Sekhar"));
		treeSet.add(new Person(56.67,4.7,"Subudhi"));
		treeSet.add(new Person(66.60,5.1,"Suresh"));
		treeSet.add(new Person(76.97,5.4,"Ramesh"));
		
		Iterator<Person> itr = treeSet.iterator();
		while(itr.hasNext()) {
			Person p = itr.next();
			System.out.println(p);
		}
	}
}
