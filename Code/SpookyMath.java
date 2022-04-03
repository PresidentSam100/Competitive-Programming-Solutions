import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// Taylor Invitational
// Question 16
// Spooky Math
public class SpookyMath {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("spooky.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String s = sc.nextLine();
            String [] ss = s.split(" ");
            ArrayList<String> math = new ArrayList<>(Arrays.asList(ss));
            boolean dzero = false;
            for (int i = 0; i < math.size(); i++)
            {
                if ("*".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    String integer = "" + (a * b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
                else if ("/".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    if (b.equals(0))
                    {
                        System.out.print("Infinity ");
                        dzero = true;
                        break;
                    }
                    String integer = "" + (a / b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
            }
            for (int i = 0; i < math.size(); i++)
            {
                if ("+".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    String integer = "" + (a + b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
                else if ("-".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    String integer = "" + (a - b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
            }
            if (!dzero)
            System.out.print(math.get(0) + " ");
            dzero = false;
            math = new ArrayList<>(Arrays.asList(ss));
            for (int i = 0; i < math.size(); i++)
            {
                if ("+".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    String integer = "" + (a + b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
                else if ("-".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    String integer = "" + (a - b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
            }
            for (int i = 0; i < math.size(); i++)
            {
                if ("*".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    String integer = "" + (a * b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
                else if ("/".equals(math.get(i)))
                {
                    Integer a = Integer.parseInt(math.get(i - 1));
                    Integer b = Integer.parseInt(math.get(i + 1));
                    if (b.equals(0))
                    {
                        System.out.println("Infinity");
                        dzero = true;
                        break;
                    }
                    String integer = "" + (a / b);
                    math.remove(i + 1);
                    math.remove(i);
                    math.set(i - 1, integer);
                    i -= 2;
                }
            }
            if (!dzero)
            System.out.println(math.get(0));
        }
    }
}
