import java.util.Scanner;
class Que_22
{
    public static void main(String args[])
    {
       Scanner input = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       String binaryString =input.nextLine();
       System.out.println("Decimal number is: "+Integer.parseInt(binaryString,2));
    }
}