package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
    public static void checkingAdjusters() {
    	
    	//current date
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
        
        //nextMonthSecondDay
        LocalDate nextMonthSecondDay = date.with(TemporalAdjusters.firstDayOfNextMonth()).withDayOfMonth(2);
        System.out.println("Next month's Second day: " + nextMonthSecondDay);
        
        //next Saturday of current month
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday: " + nextSaturday);
        
        //lastDay of current month
        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayofMonth :" +lastDay);
    }
    //DriverCode
    public static void main(String[] args) {
        checkingAdjusters();
    }
}
