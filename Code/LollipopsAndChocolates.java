import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Taylor Invitational
// Question 19
// Lollipops and Chocolates
public class LollipopsAndChocolates {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("candy.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String [] s = sc.nextLine().split(" ");
            boolean[] numbers = new boolean[s.length];
            boolean[] words = new boolean[s.length];
            ArrayList<String> wordList = new ArrayList<>();
            ArrayList<Integer> numberList = new ArrayList<>();
            for (int i = 0 ; i < s.length; i++)
            {
                if (Character.isDigit(s[i].charAt(0)))
                {
                    numbers[i] = true;
                    words[i] = false;
                    numberList.add(Integer.parseInt(s[i]));
                }
                else if (Character.isLetter(s[i].charAt(0)))
                {
                    numbers[i] = false;
                    words[i] = true;
                    wordList.add(s[i]);
                }
            }
            Collections.sort(wordList);
            Collections.sort(numberList);
            for (int i = 0; i < s.length; i++)
            {
                if (words[i])
                    s[i] = wordList.remove(0);
                else if (numbers[i])
                    s[i] = "" + numberList.remove(0);
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
