import java.io.File;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 2
// Playtime
public class Playtime {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("playtime.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String[]s = sc.nextLine().split(",");
            String name = s[0];
            int minutes = Integer.parseInt(s[1]);
            int years = minutes / (60 * 24 * 365);
            minutes %= (60 * 24 * 365);
            int days = minutes / (60 * 24);
            minutes %= (60 * 24);
            int hours = minutes / (60);
            minutes %= 60;
            System.out.print(name + " - ");
            if (years != 0)
                System.out.print(years + " year(s) ");
            if (days != 0)
                System.out.print(days + " day(s) ");
            if (hours != 0)
                System.out.print(hours + " hour(s) ");
            if (minutes != 0)
                System.out.print(minutes + " minute(s) ");
            System.out.println();
        }
    }
}
