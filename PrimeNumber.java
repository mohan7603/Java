//Write a Program to Print Prime Number 1 to 100 Using For Loop :

public class PrimeNumber{
    public static void main(String args[]){

        int start =1,last=100;

        System.out.println("The Prime Number From 1 To 100 :");

        for(int i = start;i <= last;i++){
            int Count=0;

            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    Count++;
                    
                }
            }
            if(Count == 2){
            System.out.println(i);
            
        }
        
        }
    }
}