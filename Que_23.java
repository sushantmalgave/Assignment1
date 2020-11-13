import java.util.Scanner;

public class Que_23
{

   public static void main(String[] args)
   {

      int number;
      Scanner s;
      s = new Scanner(System.in);
      System.out.println("Enter the binary number");

      number = Integer.parseInt(s.nextLine());

String hexa = Integer.toHexString(number);
System.out.println("Hexadecimal value is : "+hexa);
}
}
