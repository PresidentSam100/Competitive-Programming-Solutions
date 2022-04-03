import java.io.File;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 1
// Scale
public class Scale {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("scale.dat"));
        while (sc.hasNextInt())
        {
            String [] data = sc.nextLine().split(" ");
            int [] values = new int[data.length];
            for (int i = 0; i < data.length; i++)
            {
                int total;
                if (i == data.length - 1)
                    total = Integer.parseInt(data[i]) * Integer.parseInt(data[i - 1]);
                else if (i == 0)
                    total = Integer.parseInt(data[i]) * Integer.parseInt(data[i + 1]);
                else
                    total = Integer.parseInt(data[i - 1]) * Integer.parseInt(data[i]) * Integer.parseInt(data[i + 1]);
                values[i] = total;
            }
            for (int i = 0; i < values.length; i++)
                System.out.print(values[i] + " ");
            System.out.println();
        }
    }
}
