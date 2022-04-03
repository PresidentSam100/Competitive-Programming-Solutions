import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// UIL Regional 2004
// Question 9
// drawkcaBsay iPgay itaLnay Day
public class Day {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("day.dat"));
        while (sc.hasNextLine())
        {
            String[] ss = sc.nextLine().split(" ");
            for (int i = 0; i < ss.length; i++)
            {
                ArrayList <String> word = new ArrayList<>();
                for (int x = 0; x < ss[i].length(); x++)
                    word.add(ss[i].substring(x, x+1));
                Collections.reverse(word);
                word.add(word.remove(0));
                for (int x = 0; x < word.size(); x++)
                    System.out.print(word.get(x));
                System.out.print("ay ");
            }
            System.out.println();
        }
    }
}
