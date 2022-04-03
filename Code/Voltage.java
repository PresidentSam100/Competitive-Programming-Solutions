import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// Clements Invitational
// Question 3
// Voltage
public class Voltage {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("voltage.dat"));
        while (sc.hasNext())
        {
            String [] s = sc.nextLine().split(" ");
            ArrayList<String> array = new ArrayList<>();
            array.add("volts");array.add("amperes");array.add("ohms");
            boolean[] done = new boolean[array.size()];
            s[1] = s[1].substring(0, s[1].length()-1);
            double V = 0;
            double O = 0;
            double A = 0;
            double F = 0;
            for (int i = 0; i <=2; i+=2)
            {
                int index = array.indexOf(s[i+1]);
                double temp = Double.parseDouble(s[i]);
                done[index] = true;
                if (index== 0)
                    V = temp;
                else if (index == 1)
                    O = temp;
                else if (index ==2)
                    A = temp;
            }
            String tem = "";
            if (!done[0])
            {
                tem = array.get(0);
                F = A * O;
            }
            else if (!done[1])
            {
                tem = array.get(1);
                F = V / A;
            }
            else if (!done[2])
            {
                tem = array.get(2);
                F = V / O;
            }
            System.out.printf("%.2f " + tem + "\n",F);
        }
    }
}
