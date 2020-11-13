import java.util.Scanner;
public class Que_18
{ 
    public static void main(String[] args) 
    {  
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter first binary number");
       int a = sc.nextInt();
       System.out.println("Please enter second binary number");
       int b = sc.nextInt();
       int multiflication = (a * b);
       System.out.println("Multiflication of two binary number is : " + multiflication);
       sc.close();
    }
}
  