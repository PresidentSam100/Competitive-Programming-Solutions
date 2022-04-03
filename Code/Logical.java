import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 7
// Logical
public class Logical {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("logical.in"));
        int n = sc.nextInt();
        sc.nextLine();
        String expression = "";
        boolean done = false;
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            if (!s.matches("([A-Z]=[0-9],?)+")) {
                expression = s;
                if (done)
                System.out.println();
                done = true;
                //System.out.println(expression);
            }
            else
            {
                String check = expression;
                String[] ss = s.split("[,=]");
                for (int i = 0; i < ss.length; i+=2)
                {
                    String let = ss[i];
                    boolean b = ss[i + 1].equals("1");
                    check = check.replaceAll(let,"" + b);
                }

                //System.out.println(check);

                while (check.contains(")"))
                {
                    int b = check.indexOf(")");
                    int a = b;
                    while (check.charAt(a) != '(')
                    {
                        a--;
                    }
                    String c = check.substring(a,b+1);

                    while (c.contains("!"))
                    {
                        int x = c.contains("! true")?c.indexOf("! true"):Integer.MAX_VALUE;
                        int y = c.contains("! false")?c.indexOf("! false"):Integer.MAX_VALUE;
                        if (x < y)
                            c = c.replaceFirst("! true","false");
                        else if (y < x)
                            c = c.replaceFirst("! false","true");
                    }

                    while (c.contains("&&"))
                    {
                        int w = c.contains("true && true")?c.indexOf("true && true"):Integer.MAX_VALUE;
                        int x = c.contains("true && false")?c.indexOf("true && false"):Integer.MAX_VALUE;
                        int y = c.contains("false && true")?c.indexOf("false && true"):Integer.MAX_VALUE;
                        int z = c.contains("false && false")?c.indexOf("false && false"):Integer.MAX_VALUE;
                        int[] v = {w,x,y,z};
                        Arrays.sort(v);
                        if (v[0] == w)
                            c = c.replaceFirst("true && true","true");
                        else if (v[0] == x)
                            c = c.replaceFirst("true && false","false");
                        else if (v[0] == y)
                            c = c.replaceFirst("false && true","false");
                        else if (v[0] == z)
                            c = c.replaceFirst("false && false","false");
                    }

                    while (c.contains("^"))
                    {
                        int w = c.contains("true ^ true")?c.indexOf("true ^ true"):Integer.MAX_VALUE;
                        int x = c.contains("true ^ false")?c.indexOf("true ^ false"):Integer.MAX_VALUE;
                        int y = c.contains("false ^ true")?c.indexOf("false ^ true"):Integer.MAX_VALUE;
                        int z = c.contains("false ^ false")?c.indexOf("false ^ false"):Integer.MAX_VALUE;
                        int[] v = {w,x,y,z};
                        Arrays.sort(v);
                        if (v[0] == w)
                            c = c.replaceFirst("true \\^ true","false");
                        else if (v[0] == x)
                            c = c.replaceFirst("true \\^ false","true");
                        else if (v[0] == y)
                            c = c.replaceFirst("false \\^ true","true");
                        else if (v[0] == z)
                            c = c.replaceFirst("false \\^ false","false");
                    }

                    while (c.contains("||"))
                    {
                        int w = c.contains("true || true")?c.indexOf("true || true"):Integer.MAX_VALUE;
                        int x = c.contains("true || false")?c.indexOf("true || false"):Integer.MAX_VALUE;
                        int y = c.contains("false || true")?c.indexOf("false || true"):Integer.MAX_VALUE;
                        int z = c.contains("false || false")?c.indexOf("false || false"):Integer.MAX_VALUE;
                        int[] v = {w,x,y,z};
                        Arrays.sort(v);
                        if (v[0] == w)
                            c = c.replaceFirst("true \\|\\| true","true");
                        else if (v[0] == x)
                            c = c.replaceFirst("true \\|\\| false","true");
                        else if (v[0] == y)
                            c = c.replaceFirst("false \\|\\| true","true");
                        else if (v[0] == z)
                            c = c.replaceFirst("false \\|\\| false","false");
                    }

                    c = c.substring(1,c.length()-1);
                    check = check.substring(0,a)+c+check.substring(b+1);
                }

                while (check.contains("!"))
                {
                    int x = check.contains("! true")?check.indexOf("! true"):Integer.MAX_VALUE;
                    int y = check.contains("! false")?check.indexOf("! false"):Integer.MAX_VALUE;
                    if (x < y)
                        check = check.replaceFirst("! true","false");
                    else if (y < x)
                        check = check.replaceFirst("! false","true");
                }

                while (check.contains("&&"))
                {
                    int w = check.contains("true && true")?check.indexOf("true && true"):Integer.MAX_VALUE;
                    int x = check.contains("true && false")?check.indexOf("true && false"):Integer.MAX_VALUE;
                    int y = check.contains("false && true")?check.indexOf("false && true"):Integer.MAX_VALUE;
                    int z = check.contains("false && false")?check.indexOf("false && false"):Integer.MAX_VALUE;
                    int[] v = {w,x,y,z};
                    Arrays.sort(v);
                    if (v[0] == w)
                        check= check.replaceFirst("true && true","true");
                    else if (v[0] == x)
                        check = check.replaceFirst("true && false","false");
                    else if (v[0] == y)
                        check = check.replaceFirst("false && true","false");
                    else if (v[0] == z)
                        check = check.replaceFirst("false && false","false");
                }

                while (check.contains("^"))
                {
                    int w = check.contains("true ^ true")?check.indexOf("true ^ true"):Integer.MAX_VALUE;
                    int x = check.contains("true ^ false")?check.indexOf("true ^ false"):Integer.MAX_VALUE;
                    int y = check.contains("false ^ true")?check.indexOf("false ^ true"):Integer.MAX_VALUE;
                    int z = check.contains("false ^ false")?check.indexOf("false ^ false"):Integer.MAX_VALUE;
                    int[] v = {w,x,y,z};
                    Arrays.sort(v);
                    if (v[0] == w)
                        check = check.replaceFirst("true \\^ true","false");
                    else if (v[0] == x)
                        check = check.replaceFirst("true \\^ false","true");
                    else if (v[0] == y)
                        check = check.replaceFirst("false \\^ true","true");
                    else if (v[0] == z)
                        check = check.replaceFirst("false \\^ false","false");
                }

                while (check.contains("||"))
                {
                    int w = check.contains("true || true")?check.indexOf("true || true"):Integer.MAX_VALUE;
                    int x = check.contains("true || false")?check.indexOf("true || false"):Integer.MAX_VALUE;
                    int y = check.contains("false || true")?check.indexOf("false || true"):Integer.MAX_VALUE;
                    int z = check.contains("false || false")?check.indexOf("false || false"):Integer.MAX_VALUE;
                    int[] v = {w,x,y,z};
                    Arrays.sort(v);
                    if (v[0] == w)
                        check = check.replaceFirst("true \\|\\| true","true");
                    else if (v[0] == x)
                        check = check.replaceFirst("true \\|\\| false","true");
                    else if (v[0] == y)
                        check = check.replaceFirst("false \\|\\| true","true");
                    else if (v[0] == z)
                        check = check.replaceFirst("false \\|\\| false","false");
                }
                System.out.println(check);
            }
        }
    }
}
