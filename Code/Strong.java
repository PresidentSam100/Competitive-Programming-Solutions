import java.io.File;
import java.util.Scanner;
// Tompkins Mock
// Question 4
// Strong Passwords
public class Strong {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("strong.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String s = sc.nextLine();
            boolean digit = false;
            boolean eight = s.length() >= 8;
            boolean specUp = false;
            boolean only = true;
            for (int i = 0; i < s.length(); i++)
            {
                if (Character.isDigit(s.charAt(i)))
                    digit = true;
                else if (Character.isUpperCase(s.charAt(i)) || "!@#$%^&*()_+=".contains(s.substring(i,i+1)))
                    specUp = true;
                else if (!Character.isLowerCase(s.charAt(i)))
                    only = false;
            }
            if (digit && eight && specUp && only)
                System.out.println("STRONG");
            else
                System.out.println("INVALID");
        }
    }
}
