import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// Clements Invitational
// Question 7
// Column Totals
public class ColumnTotals {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("columntotals.dat"));
        ArrayList <Integer> totals = new ArrayList<>();
        while (sc.hasNext())
        {
            String s = sc.nextLine() + ",";
            String total = "";
            int col = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (!s.substring(i,i+1).equals(","))
                    total+=s.substring(i,i+1);
                else
                {
                    if (total.equals(""))
                        total = "0";
                    if (col < totals.size())
                        totals.set(col,totals.get(col) + Integer.parseInt(total));
                    else
                        totals.add(col,Integer.parseInt(total));
                    total = "";
                    col++;
                }
            }
        }
        for (int i = 0; i < totals.size(); i++)
        {
            System.out.print(totals.get(i));
            if (i < totals.size()-1)
                System.out.print(",");
        }
    }
}
