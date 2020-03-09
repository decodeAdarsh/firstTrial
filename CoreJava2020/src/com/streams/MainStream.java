package com.streams;

import static java.util.stream.Collectors.counting;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainStream {
	
	
	public static void main(String[] args) {
		
		//Assignment-1
		System.out.println("\nAssignment-1");
		TestData.getAllFruits().stream()
		.filter(f->f.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).forEach(System.out::println);
		
		//Assignment-2
		System.out.println("\nAssignment-2");
		Map<String, List<Fruit>> groupColor =TestData.getAllFruits().stream()
				.collect(Collectors.groupingBy(Fruit::getColor));
		System.out.println(groupColor);
		
		//Assignment-3
		System.out.println("\nAssignment-3");
		TestData.getAllFruits().stream().filter(f->f.getColor().equals("Red")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);
		
		System.out.println("\nAssignment-4");
		List<News> newsList =TestData.getAllNews();
		Map<Integer,List<News>> c11;
		c11=  newsList.stream().collect(Collectors.groupingBy(News::getNewsId ));
		Integer maxValuesString = c11.entrySet().stream()
	            .max(Comparator.comparingInt(entry -> entry.getValue().size()))
	            .map(Map.Entry::getKey).orElse(null);

		System.out.println("NewsId with max comments ="+maxValuesString);
		
		System.out.println("\nAssignment-5");
		long c=TestData.getAllNews().stream().filter((News n)->n.getComment().contains("budget")).count();
		System.out.println("No.of times budget present= "+c);
	
		System.out.println("\nAssignment-6");
		Map<String,Long> comments=TestData.getAllNews().parallelStream().collect(Collectors.groupingBy(News::getCommentByUser,counting()));
		System.out.println(comments);
		
		System.out.println("\nAssignment-7");
		TestData.getAllTransactions().stream()
		.filter(t->t.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.forEach(System.out::println);

		System.out.println("\nAssignment-8");
		 Map<Object, List<Transaction>> t1=TestData.getAllTransactions().stream()
		 .collect(Collectors.groupingBy(t->t.getTrader().getCity()));
		 System.out.println(t1.keySet());
	
		System.out.println("\nAssignment-9");
		TestData.getAllTransactions().stream().filter(f->f.getTrader().getCity().equals("Pune")).sorted(Comparator.comparing(t->t.getTrader().getName())).forEach(System.out::println);
	
		TestData.getAllTransactions().stream().filter(f->f.getTrader().getCity().equals("Pune")).sorted(Comparator.comparing(t->t.getTrader().getName())).forEach(System.out::println);
	}

	

}
