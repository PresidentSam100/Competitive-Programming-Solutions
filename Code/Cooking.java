import java.io.File;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 2
// Cooking Food
public class Cooking {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("cooking.in"));
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            int total = 0;
            for (int i = 0; i < s.length(); i++)
                total += s.charAt(i);
            int min = total / 60;
            int sec = total % 60;
            System.out.println(min + "min, " + sec + "sec");
        }
    }
}
