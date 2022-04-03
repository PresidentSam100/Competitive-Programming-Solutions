import java.io.File;
import java.util.Scanner;
// Tompkins Mock
// Question 1
// Mary Had a Little Lamb
public class Mary {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("mary.dat"));
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
