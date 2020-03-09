package com.dateApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DifferentLocales {
	public static void main(String args[]) {
		DateTimeFormatter italianFormatter =
				DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.CHINESE);
				LocalDate date3 = LocalDate.of(2014, 3, 18);
				String formattedDate_2 = date3.format(italianFormatter); 
				System.out.println(formattedDate_2);
				DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMANY);
				LocalDate date5 = LocalDate.of(2014, 3, 18);
				String formattedDate_3 = date5.format(frenchFormatter);
				System.out.println(formattedDate_3);
	}
}
