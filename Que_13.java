import java.util.Scanner;
public class Que_13
{
    public static void main(String[] args) 
    {
        double h, w, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height of rectangle:");
        h = s.nextDouble();
        System.out.print("Enter width of rectangle:");
        w = s.nextDouble();
        perimeter = 2 * (h + w);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = h * w;
        System.out.println("Area of rectangle:"+area);
    }
}