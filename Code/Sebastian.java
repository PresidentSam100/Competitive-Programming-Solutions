import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/*
Sebastian
Question 11
UIL Invitational A 2020
*/
public class Sebastian {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("sebastian.dat"));
        ArrayList<String> words= new ArrayList<>();
        while (sc.hasNext())
        {
            String s = sc.next();
            if (!words.contains(s))
            words.add(s);
        }
        Collections.sort(words);
        Collections.sort(words, Comparator.comparingInt(String::length));
        for (int i = 0; i < words.size(); i++)
        {
            System.out.println(words.get(i));
        }
    }
}
