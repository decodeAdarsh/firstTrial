package com.collections;

import java.util.HashMap;
import java.util.Iterator;

class Employee
{
	private int id;
	private int salary;
	
	public Employee(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode()
	{
		return 25;
	}
	@Override
	public boolean equals(Object ob)
	{
		return true;
	}
}
public class EmployeeCollectionTest {

	public static void main(String[] args) {
		HashMap<Employee,String> ht=new HashMap<>();
		ht.put(new Employee(12,5000),"Adarsh");
		ht.put(new Employee(11,7000),"Subudhi");
		ht.put(new Employee(10,4000),"Bikash");
		Iterator<Employee> itr=ht.keySet().iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			System.out.println(e);
		}

	}

}
