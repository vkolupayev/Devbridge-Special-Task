package com.company;

/*Implement a method that prints all dates between two given years that remain the same if numbers of the date are reversed.

Method signature:
static void printBonusDatesBetween(int fromYear, int toYear)

It should print dates in interval from fromYear (inclusive) to toYear (exclusive) that satisfy the condition.

For example, calling printBonusDatesBetween(2010, 2015) should print:
2010-01-02
2011-11-02
*/

import java.time.LocalDate;


public class Main {

    private static void printBonusDatesBetween(int fromYear, int toYear) {
        LocalDate startDate = LocalDate.of(fromYear, 01, 01);
        LocalDate endDate = LocalDate.of(toYear-1, 12, 31);
        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1))
        {
            String str = date.toString().replace("-","");
            StringBuilder input = new StringBuilder();
            input.append(str);
            String rev_str = input.reverse().toString();
            if(str.equals(rev_str)){
                System.out.println(date);
            }
        }

    }

    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }
}
