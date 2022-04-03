import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// UIL State 2004
// Question 3
// Function Finder Fun
public class Function {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("function.dat"));
        ArrayList <String> functions = new ArrayList<>();
        String[] res = {"if", "while", "for", "switch", "return"};
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            String temp = "";
            boolean function = false;
            for (int i = s.length() - 1; i >= 0; i--)
            {
                String l = s.substring(i,i+1);
                if (function && !l.matches("[\\W]"))
                    temp = l + temp;
                if (l.equals("("))
                    function = true;
                else if (l.matches("[\\W]"))
                {
                    function = false;
                    if (!functions.contains(temp) && !temp.equals(""))
                    {
                        boolean add = true;
                        for (int j = 0; j < res.length; j++)
                        {
                            if (temp.equals(res[j]))
                            {
                                add = false;
                                break;
                            }
                        }
                        if (add)
                            functions.add(temp);
                    }
                }
            }
        }
        for (int i = 0; i < functions.size(); i++)
            System.out.println(functions.get(i));
    }
}
