// Write a program to print leap year or not using if condition:

import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){o
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER YEAR :");
        int Year = obj.nextInt();

        if(Year%4==0 && Year%100!=0 || (Year%400==0)){
            System.out.println(Year+" "+"is Leap Year");
        }
        else{
            System.out.println(Year+" "+"is Not a Leap Year");
        }

    }
}