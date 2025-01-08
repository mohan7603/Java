import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
         // Menu
        System.out.println("\t\t--Choose an Operation--");
        System.out.println("");
        System.out.println("\t\t 1.Addition (+)");
        System.out.println("\t\t 2.Subraction (-)");
        System.out.println("\t\t 3.Multiplication (*)");
        System.out.println("\t\t 4.Division (/)");
        System.out.println("\t\t 5.Modules (%)");
        System.out.println("");
        System.out.println("Enter Your Choice (1 -5)");
        




        int choice = obj.nextInt();
        
        // Get input number
        int result;
        System.out.println("ENTER NUMBER 1 :");
        int num1 = obj.nextInt();
        System.out.println("ENTER NUMBER 2 :");
        int num2 = obj.nextInt();

 
        // perform operation based on user choice
        switch(choice){
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result = " +num1+ "+" +num2 +"="+ result);
                break;
            case 2:// subraction
                result = num1 - num2;
                System.out.println("Result = " +num1+ "-" +num2 +"="+ result);
                break;
            case 3: // multiplication
                result = num1 * num2;
                System.out.println("Result = " +num1+ "*" +num2 +"="+ result);
                break;
            case 4: // Division
                result = num1 / num2;
                System.out.println("Result = " +num1+ "/" +num2 +"="+ result);
                break;
            case 5: // modules
                result = num1 % num2;
                System.out.println("Result = " +num1+ "%" +num2 +"="+ result);
                break;
                





        }
       
    }
} 