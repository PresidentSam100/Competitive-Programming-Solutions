import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Poly {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("poly.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[] s = sc.nextLine().split("[\\s]");
            ArrayList <String> coefficient = new ArrayList<>();
            ArrayList <Integer> degree = new ArrayList<>();
            ArrayList <String> sign = new ArrayList<>();
            for (int i = s.length - 1; i >= 0; i-=2)
            {
                int index = degree.size();
                if (!"+-".contains(s[i]))
                {
                    if (!s[i].contains("x"))
                    {
                        coefficient.add(s[i]);
                        degree.add(0);
                    }
                    else if (!s[i].contains("^"))
                    {
                        s[i] = s[i].replaceAll("x","");
                        coefficient.add(s[i] + "x");
                        degree.add(1);
                    }
                    else
                    {
                        String [] temp = s[i].split("[x^]");
                        coefficient.add(temp[0] + "^x");
                        degree.add(Integer.parseInt(temp[1]));
                    }
                }
                if (i == 0)
                    sign.add("");
                else
                    sign.add(s[i-1]);
            }
            for (int i = 0; i < degree.size(); i++)
                System.out.print(sign.get(i) + " " + coefficient.get(i) + degree.get(i));
            System.out.println();
            /*
            boolean negative=false;

            for (int i = 0; i < s.length; i++)
            {
                if (s[i].equals("-"))
                    negative = true;
                else if (s[i].equals("+"))
                    negative = false;
                else
                {
                    int index = polynomial.size();
                    int current = Integer.parseInt(s[i].substring(s[i].length()-1));
                    for (int j = 0; j < polynomial.size(); j++)
                    {
                        String temp = polynomial.get(j);
                        if (!"+-".contains(temp))
                        {
                            int exponent = Integer.parseInt(temp.substring(temp.length()-1));
                            if (exponent > current)
                            {
                                index = j;
                                break;
                            }
                        }
                    }
                    polynomial.add(index, s[i]);
                    if (negative)
                        polynomial.add(index, "-");
                    else
                        polynomial.add(index, "+");
                }
            }

             */
            System.out.println(Arrays.toString(s));
        }
    }
}
