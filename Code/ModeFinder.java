import java.io.File;
import java.util.*;
// Clements Invitational
// Question 2
// Mode Finder
public class ModeFinder {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("modefinder.dat"));
        while (sc.hasNextInt())
        {
            ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<Integer> total = new ArrayList<>();
            ArrayList<Integer> mode = new ArrayList<>();
            String []s = sc.nextLine().split(" ");
            int max = 1;
            for (int i =0 ;i < s.length;i++)
            {
                int j = Integer.parseInt(s[i]);
                if (numbers.contains(j))
                {
                    int index = numbers.indexOf(j);
                    total.set(index, total.get(index) + 1);
                    if (total.get(index) > max)
                        max = total.get(index);
                }
                else
                {
                    numbers.add(j);
                    total.add(1);
                }
            }
            for (int i = 0; i < numbers.size(); i++)
            {
                if (total.get(i) == max)
                    mode.add(numbers.get(i));
            }
            Collections.sort(mode);
            for (int i =0 ; i < mode.size(); i++)
                System.out.print(mode.get(i) + " ");
            System.out.println();
        }
    }
}
