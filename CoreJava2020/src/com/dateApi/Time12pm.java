package com.dateApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time12pm {

	public static void main(String[] args) {
		timeTo12();

	}
	public static void timeTo12()
	{
		Duration d;
		LocalDateTime lt=LocalDateTime.now();
		LocalDateTime to12=LocalDateTime.of(lt.getYear(), lt.getMonth(), lt.getDayOfMonth(), 12, 00);
		
		if(lt.getHour()<12)
			 d=Duration.between(lt, to12);
		else
		{
			to12=to12.plusDays(1);
			d=Duration.between(to12,lt);
		}
		System.out.println("Duration: "+d);
	}

}
