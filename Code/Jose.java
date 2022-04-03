import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/*
Jose
Question 6
UIL Invitational A 2020
*/
public class Jose {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("jose.dat"));
        HashMap<String,Integer> let = new HashMap<>();
        HashMap<Integer,Integer> pos = new HashMap<>();
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            if (s.isBlank())
                break;
            String[] ss = s.split(" ");
            let.put(ss[0],Integer.parseInt(ss[1]));
        }
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            if (s.isBlank())
                break;
            String[] ss = s.split(" ");
            pos.put(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]));
        }
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++)
        {
            String s = sc.nextLine();
            int num = 0;
            for (int j = 1; j <= s.length(); j++)
            {
                int a = 0;
                int b = 0;
                if (let.containsKey(s.substring(j-1,j)))
                {
                    a = let.get(s.substring(j-1,j));
                }
                else if (Character.isDigit(s.charAt(j-1)))
                {
                    a = Integer.parseInt(s.substring(j-1,j));
                }
                if (pos.containsKey(j))
                {
                    b = pos.get(j);
                }
                num += a * b;
            }
            num %= 11;
            if (num ==10)
                s = s.replaceAll("_","X");
            else
                s = s.replaceAll("_",""+num);
            System.out.println(s);
        }
    }
}
