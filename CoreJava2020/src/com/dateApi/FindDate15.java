package com.dateApi;

import java.time.LocalDate;

public class FindDate15 {

	public static void main(String[] args) {
		dayAfter15();

	}
	public static void dayAfter15()
	{
		LocalDate ld=LocalDate.now();
		LocalDate after15=ld.plusDays(15);
		System.out.println(after15);
	}

}
