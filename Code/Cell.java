import java.io.File;
import java.util.Scanner;
// UIL District2 2012
// Question 2
// Cell Phone
public class Cell {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(new File("cell.dat"));
        double a = 0;
        double b = 0;
        while (sc.hasNextLine())
        {
            double ms = sc.nextDouble();
            a += Math.floor(ms);
            b += Math.ceil(ms);
        }
        System.out.println("PLAN A: " + (int)a);
        System.out.println("PLAN B: " + (int)b);
    }
}
