package com.dateApi;

import java.time.LocalTime;
import java.time.ZoneId;

public class TimeInTimeZones {

	public static void main(String[] args) {
		ZoneId romeZone= ZoneId.of("Europe/Rome");
		LocalTime localTime_2 = LocalTime.now(romeZone);
		System.out.println(localTime_2);
		ZoneId Zone2= ZoneId.of("Africa/Cairo");
		LocalTime localTime_3 = LocalTime.now(Zone2);
		System.out.println(localTime_3);


	}

}
