import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// Tompkins Mock
// Question 9
// Values
public class Values {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("values.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList <String> data = new ArrayList<>();
        ArrayList <Integer> values = new ArrayList<>();
        for (int x = 0; x < N; x++)
        {
            String s = sc.nextLine();
            int total = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (!s.substring(i, i+1).equals(" "))
                    total += s.charAt(i) - 64;
            }
            for (int i = 0; i < values.size() + 1; i++)
            {
                if (i == values.size() || values.get(i) > total)
                {
                    values.add(i, total);
                    data.add(i, s);
                    break;
                }
                else if (values.get(i) == total)
                {
                    if (s.compareTo(data.get(i)) < 0)
                    {
                        values.add(i, total);
                        data.add(i, s);
                        break;
                    }
                }
            }
            if (data.isEmpty())
                data.add(s);
            if (values.isEmpty())
                values.add(total);
        }
        for (int i = 0; i < data.size(); i++)
            System.out.println(values.get(i) + " " + data.get(i));
    }
}
