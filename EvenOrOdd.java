//Write a Program to Print Even Number or Odd Number Using ElseIf Ladder;

import java.util.Scanner;


public class EvenOrOdd{
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    System.out.println("ENTER A NUMBER :");
    int num = obj.nextInt();

    if(num%2==0)
    {
        System.out.println(num+" "+"is Even");
    }
    else if(num%2!=0)
    {
        System.out.println(num+" "+"is Odd");
    }


}
    
}