// write a program to print the number which is divisible by 4 using if;

import java.util.Scanner;
public class DivisibleBy4{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int num = obj.nextInt();

        if(num%4==0){
            System.out.println(num+" "+"Is Divisible By 4");
        }
        else{
            System.out.println(num+" "+"Is Not Divisible By 4");
        }
    }
}