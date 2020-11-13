import java.util.Scanner;
class Que_20
{
    public static void main(String args[])
    {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a decimal number : ");
      int num =input.nextInt();
      String Str = Integer.toHexString(num);
      System.out.println("Decimal to hexadecimal: "+Str);
    }
}