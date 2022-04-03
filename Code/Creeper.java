import java.io.File;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 5
// Creeper
public class Creeper {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("creeper.in"));
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine().toLowerCase().matches(".*c.*r.*e.*e.*p.*e.*r.*")?"Aw Man":"I Still Rule The World");
        }
    }
}
