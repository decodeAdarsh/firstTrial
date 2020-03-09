package com.dateApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormats {

	public static void main(String[] args) {
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.of(2016, 4, 27);
		String formattedDate = date1.format(formatter);
		LocalDate date2 = LocalDate.parse(formattedDate, formatter);
		LocalDate date3 = LocalDate.parse("20140318",DateTimeFormatter.BASIC_ISO_DATE); 
		LocalDate date4 = LocalDate.parse("2014-03-18",	DateTimeFormatter.ISO_LOCAL_DATE); 
		System.out.println(date1+"\n"+date2+"\n"+date3+"\n"+date4+"\n");
	}

}
