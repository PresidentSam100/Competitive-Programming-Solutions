import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// Clements Invitational
// Question 6
// Code Names
public class CodeNames {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("codenames.dat"));
        ArrayList <String[]> names = new ArrayList<>();
        while (sc.hasNext())
        {
            String s = sc.nextLine();
            if (s.substring(0,1).equals("^"))
            {
                s=s.substring(1);
                names.add(s.split(","));
            }
            else
            {
                for (int i = 0; i < names.size(); i++)
                {
                    for (int j = 1; j < names.get(i).length; j++)
                    {
                        s = s.replaceAll(names.get(i)[j], names.get(i)[0]);
                    }
                }
                System.out.println(s);
            }
        }
    }
}
