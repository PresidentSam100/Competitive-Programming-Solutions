import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Conundrum {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("conundrum.dat"));
        while (sc.hasNextLine())
        {
            int shift = sc.nextInt();
            String message = sc.next();
            ArrayList <String> alphabet = new ArrayList<>();
            String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i < alpha.length(); i++)
                alphabet.add(alpha.substring(i, i+1));
            Collections.reverse(alphabet);
            System.out.println(alphabet);
            for (int x = alphabet.size() - 1; x > alphabet.size() - shift - 1; x--)
            {
                alphabet.add(0, alphabet.remove(alphabet.size() - 1));
            }
            System.out.println(alphabet);
            for (int x = 0; x < alphabet.size(); x++)
            {
                if (x % shift == 0)
                {
                    alphabet.add(0, alphabet.remove(x));
                }
            }
            System.out.println(alphabet);
            Collections.reverse(alphabet);
            System.out.println(alphabet + "\n");
        }
    }
}
