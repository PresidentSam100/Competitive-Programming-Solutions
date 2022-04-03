import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 8
// Enchantment Table
public class Enchantment {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("enchantment.in"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        while ((a * c) % 26 != 1)
            c++;
        sc.nextLine();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < 26; i++)
        {
            int d = c * (i - b) % 26;
            while (d < 0)
                d += 26;
            map.put(alpha.substring(i,i+1),alpha.substring(d,d+1));
        }

        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            String res = "";
            for (int i = 0; i < s.length(); i++)
            {
                if (Character.isLetter(s.charAt(i)))
                    res += map.get(s.substring(i,i+1));
                else
                    res += s.substring(i,i+1);
            }
            System.out.println(res);
        }
    }
}
