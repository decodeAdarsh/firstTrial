package com.lambdaFunc;
import java.util.*;
@FunctionalInterface
interface OrderPredicate 
{
	boolean test(Order t);
	
}

class OrderList {

	private static List<Order> orderList = new ArrayList<Order>();
	static {
		Random random = new Random();
		for(int i=0;i<40;i++) {
			String status = i%2==0 ? "ACCEPTED" : "COMPLETED";
			int price = random.nextInt(50000);
			Order order = new Order(status, price);
			orderList.add(order);
		}
	}
	public static List<Order> getOrders() {
		return orderList;
	}
	
	public static void printOrders(List<Order> orders) {
		for(Order o: orders) {
			System.out.println(o);
		}
	}
	
}

class Order {
	private String status;
	private int price;
	
	public Order() {}

	public Order(String status, int price) {
		this.status = status;
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setstatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return status + " - " + price;
	}
}

public class assignment2 {

	public static void main(String[] args) 
	{
		List<Order> allOrders=OrderList.getOrders();
		OrderList.printOrders(allOrders);
		OrderPredicate predicateStatus=(Order o)->"ACCEPTED".contentEquals(o.getStatus());
		OrderPredicate predicatePrice=(Order o)->o.getPrice()>10000;
		System.out.println("\n\n Filtered List\n\n");
		List<Order> filteredOrders=filterOrders(allOrders,predicatePrice);
		OrderList.printOrders(filteredOrders);
		System.out.println("\n\n");
		List<Order> filterOrder=filterOrders(allOrders,predicateStatus);
		OrderList.printOrders(filterOrder);
	}
	public static List<Order> filterOrders(List<Order> orders, OrderPredicate predicate) {
		List<Order> filteredOrders = new ArrayList<Order>();
		for(Order o: orders) {
			if (predicate.test(o)) {
				filteredOrders.add(o);
			}
		}
		return filteredOrders;
	}
}
