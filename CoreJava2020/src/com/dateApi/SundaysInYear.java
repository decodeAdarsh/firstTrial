package com.dateApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class SundaysInYear {

	public static void main(String[] args) {
		int c=0;
		LocalDate localDate=LocalDate.now();
		LocalDate localDate2=LocalDate.of(localDate.getYear(),01,01);
		LocalDate localDate3=LocalDate.of(localDate.getYear(),12,31);
		for(int i=localDate2.getDayOfYear();i<localDate3.getDayOfYear();i++)
		{
			DayOfWeek dow= DayOfWeek.of(localDate2.get(ChronoField.DAY_OF_WEEK));
			//System.out.println(dow);
			if(dow== DayOfWeek.SUNDAY)
			{
				c++;
			}
			//System.out.println(localDate2.getDayOf());
			localDate2=localDate2.plusDays(1);
		}
		System.out.println("No of Sundays= "+c);
	
		

	}

}
