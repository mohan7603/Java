import java.util.Scanner;
public class Student{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        String StudentName,StudentSection;
        int StudentRoll,StudentClass,Mark1,Mark2,Mark3,Mark4,Mark5,total;
        float average;


        // Get Student Input

        System.out.println("ENTER YOUR NAME :");
        StudentName = obj.nextLine();
    

        System.out.println("ENTER YOUR ROLL NUMBER :");
        StudentRoll = obj.nextInt();

        System.out.println("ENTER YOUR Class :");
        StudentClass = obj.nextInt();

        System.out.println("ENTER YOUR SECTION :");
        StudentSection = obj.nextLine();
        obj.nextLine();
        

        System.out.println("ENTER YOUR MARK 1 :");
        Mark1 = obj.nextInt();

        System.out.println("ENTER YOUR MARK 2 :");
        Mark2 = obj.nextInt();

        System.out.println("ENTER YOUR MARK 3 :");
        Mark3 = obj.nextInt();

        System.out.println("ENTER YOUR MARK 4 :");
        Mark4 = obj.nextInt();

        System.out.println("ENTER YOUR MARK 5 :");
        Mark5 = obj.nextInt();

        // Total marks

        total =(Mark1+Mark2+Mark3+Mark4+Mark5);

        // Average 

        average = (Mark1+Mark2+Mark3+Mark4+Mark5) / 5;

        
        System.out.println("Name :"+" "+StudentName);

        System.out.println("RollNumber :"+" "+StudentRoll);

        System.out.println("class :"+" "+StudentClass);

        System.out.println("Section :"+" "+StudentSection);

        System.out.println("Mark 1 :"+" "+Mark1);
        System.out.println("Mark 2 :"+" "+Mark2);
        System.out.println("Mark 3 :"+" "+Mark3);
        System.out.println("Mark 4 :"+" "+Mark4);
        System.out.println("Mark 5 :"+" "+Mark5);

        System.out.println("The Total is :"+" "+total);

        System.out.println("Average is :"+" "+average);






    }
}