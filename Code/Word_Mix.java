import java.io.File;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 9
// Word Mix
public class Word_Mix {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("word_mix.dat"));
        String a = sc.next();
        String b = sc.next();
        String s = "";
        for (int i = 0; i < Math.min(a.length(),b.length()); i++)
        {
            if (i % 2 == 0)
                s += a.substring(i, i+1);
            else
                s += b.substring(i, i+1);
        }
        System.out.println(s);
    }
}
