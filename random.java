import java.util.Random;
import java.util.Scanner;
public class random {
    public static void main(String[] args)
    {
        int a,b;
        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        a= rand.nextInt(3);
        System.out.println("press\n 1:paper\n2:scissor\n 0:rock");
        b= sc.nextInt();
        if(a==0)
        {
            System.out.println("Computer choice is Rock");
            if(b==2)
            {
                System.out.println("\nComputer wins");
            }
           else if(b==0)
            {
                System.out.println("\nDraw");
            }
            else{
                System.out.println("\nYou win");
            }
        }
        
    else if(a==1)
        {
            System.out.println("Computer choice is Papper");
            if(b==0)
            {
                System.out.println("\nComputer wins");
            }
           else if(b==1)
            {
                System.out.println("\nDraw");
            }
            else{
                System.out.println("\nYou win");
            }
        }
    else if(a==2)
        {
            System.out.println("Computer choice is Scissor");
            if(b==1)
            {
                System.out.println("\nComputer wins");
            }
           else if(b==2)
            {
                System.out.println("\nDraw");
            }
            else{
                System.out.println("\nYou win");
            }
        }
        
    }
         else
    {
        System.out.println("Invalid Entry");
        
    }
}
