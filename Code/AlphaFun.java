import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// UIL District1 2012
// Question 1
// Alpha Fun
public class AlphaFun {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("alphafun.dat"));
        ArrayList <String> words = new ArrayList<>();
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            int index = words.size();
            for (int i = 0; i < words.size(); i++)
            {
                String word = words.get(i);
                if (s.charAt(1) < word.charAt(1))
                {
                    index = i;
                    break;
                }
                else if (s.charAt(1) == word.charAt(1))
                {
                    char temp,letter;
                    if (s.length() < 4)
                        temp = ' ';
                    else
                        temp = s.charAt(3);
                    if (word.length() < 4)
                        letter = ' ';
                    else
                        letter = word.charAt(3);
                    if (temp < letter)
                    {
                        index = i;
                        break;
                    }
                    else if (temp == letter)
                    {
                        if (s.charAt(s.length()-1) < word.charAt(word.length()-1))
                        {
                            index = i;
                            break;
                        }
                        else if (s.charAt(s.length()-1) == word.charAt(word.length()-1))
                        {
                            if (s.charAt(0) < word.charAt(0))
                            {
                                index = i;
                                break;
                            }
                            else if (s.charAt(0) == word.charAt(0))
                            {
                                if (s.compareTo(word) < 0)
                                {
                                    index = i;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            words.add(index, s);
        }
        for (int i = 0; i < words.size(); i++)
            System.out.println(words.get(i));
    }
}
