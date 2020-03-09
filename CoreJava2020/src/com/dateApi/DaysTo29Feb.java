package com.dateApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DaysTo29Feb {

	public static void main(String[] args) {
		LocalDate localDate=LocalDate.of(2023,Month.JANUARY,25);
		LocalDate localDate1= LocalDate.of(localDate.getYear(),localDate.getMonth(),localDate.getDayOfMonth());
		if(localDate.getYear()%4==0&&localDate.getYear()%400==0&&localDate.getYear()%100!=0&&localDate.getMonthValue()<=2)
		{
			Period p=Period.between(localDate, localDate1);
			System.out.println(p);	
		}
		else if(localDate.getYear()%4==0&&localDate.getYear()%400==0&&localDate.getYear()%100!=0&&localDate.getMonthValue()>2)
		{
			localDate1=localDate1.plusYears(4);
			LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
			Period p=Period.between(localDate, localDate2);
			System.out.println(p);	
		}
		else
		{
			if(localDate.getYear()%4==1)
			{
				localDate1=localDate1.plusYears(3);
				LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
				Period p=Period.between(localDate, localDate2);
				System.out.println(p);		
			}
			else if(localDate.getYear()%4==2) {
				localDate1=localDate1.plusYears(2);
				LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
				Period p=Period.between(localDate, localDate2);
				System.out.println(p);	
			
			}
			else {
				localDate1=localDate1.plusYears(1);
				LocalDate localDate2=LocalDate.of(localDate1.getYear(),02,29);
				Period p=Period.between(localDate, localDate2);
				System.out.println(p);	
			
			}
		}
		
	}
}