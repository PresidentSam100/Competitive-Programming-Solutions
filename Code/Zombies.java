import java.io.File;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 4
// Fighting Zombies
public class Zombies {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(new File("zombies.in"));
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine().replaceAll("[zombieZOMBIE]",""));
        }
    }
}
