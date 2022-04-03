import java.io.File;
import java.util.Scanner;
// Tompkins Mock
// Question 8
// Jack Be Nimble
public class Jack {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("jack.dat"));
        while (sc.hasNextLine())
        {
            sc.nextLine();
            System.out.println(sc.nextLine());
        }
    }
}
