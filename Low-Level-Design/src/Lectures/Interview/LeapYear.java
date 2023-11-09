package Lectures.Interview;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        boolean isLeapYear=false;
        if(year % 4==0){
            if(year %100 != 0 || year % 400 ==0){
                isLeapYear=true;
            }

        }
        if(isLeapYear){
            System.out.println("Yes it is leap year");
        }
        else{
            System.out.println("No it is not a leap year");
        }
    }
}






