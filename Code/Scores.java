import java.io.File;
import java.util.Scanner;
// UIL Regional 2004
// Question 2
// Test Scores
public class Scores {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("scores.dat"));
        while (sc.hasNextLine())
        {
            String [] s = sc.nextLine().split(" ");
            System.out.println(s[1] + " " + s[0]);
        }
    }
}
