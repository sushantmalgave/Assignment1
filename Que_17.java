import java.util.Scanner;
public class Que_17
{ 
    public static void main(String[] args) 
    {  
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter first binary number");
       int a = sc.nextInt();
       System.out.println("Please enter second binary number");
       int b = sc.nextInt();
       int sum = (a + b);
       System.out.println("Sum of two binary number is : " + sum);
       sc.close();
    }
}
    
       