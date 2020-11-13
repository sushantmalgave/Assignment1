import java.util.Scanner;
class Que_21
{
  public static void main(String args[])
  {
    Scanner input = new Scanner( System.in );
    System.out.print("Enter a decimal number : ");
    int num =input.nextInt();
    String octalString = Integer.toOctalString(num);
    System.out.println("Decimal to octal: " + octalString);
  }
}

 