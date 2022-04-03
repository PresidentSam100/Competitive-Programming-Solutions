import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
Lukas
Question 8
UIL Invitational A 2020
*/
public class Lukas {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("lukas.dat"));
        String[] keys = sc.nextLine().split(",");
        ArrayList<String>reserved = new ArrayList<>(Arrays.asList(keys));
        reserved.add("true");
        reserved.add("false");
        reserved.add("null");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++)
        {
            String s = sc.nextLine();
            if (reserved.contains(s))
            {
                System.out.println("Invalid");
            }
            else if (!s.substring(0,1).matches("[$_a-zA-Z]"))
            {
                System.out.println("Invalid");
            }
            else if (!s.substring(1).matches("[$_a-zA-Z0-9]*"))
            {
                System.out.println("Invalid");
            }
            else
            {
                System.out.println("Valid");
            }
        }
    }
}
