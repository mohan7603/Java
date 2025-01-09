// write a program to add two number between 500 to 520 using if else;

import java.util.Scanner;

public class AddTwoNumber{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter num 1 between 500 to 520:");
        int num1 =obj.nextInt();
        System.out.println("Enter num 2 between 500 to 520:");
        int num2 =obj.nextInt();

        if(num1>=500 && num1<=520){
            if(num2>=500 && num2<=520)
            {
                int sum = num1 +num2;
                System.out.println("The sum of is"+" "+num1+" "+"+"+" "+num2+" "+"="+" "+sum);

            }
            else
            {
                System.out.println("The Second number not in range between 500 to 520");
            }

        }
        else
        {
            System.out.println("The First number not in range between 500 to 520 ");
        }


    }
}