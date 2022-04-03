import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// UIL Regional 2004
// Question 10
// Roman Numeral Translator
public class Roman {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("roman.dat"));
        Map<String,Integer> data = new HashMap<>();
        data.put("I",1);
        data.put("V",5);
        data.put("X",10);
        data.put("L",50);
        data.put("C",100);
        data.put("D",500);
        data.put("M",1000);
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            int total = 0;
            int check = 0;
            for (int i = 0; i < s.length(); i++)
            {
                total += data.get(s.substring(i, i+1));
                if (data.get(s.substring(i,i+1)) > check)
                    total -= check * 2;
                check = data.get(s.substring(i, i+1));
            }
            System.out.println(total);
        }
    }
}
