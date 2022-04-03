import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Taylor Invitational
// Question 9
// Currency
public class Currency {
    public static void main(String[] args)throws  Exception {
        Scanner sc = new Scanner(new File("currency.dat"));
        int N = sc.nextInt();
        for (int w = 0; w < N; w++)
        {
            sc.nextLine();
            String s = sc.nextLine();
            String[]ss = s.split(" ");
            int total = sc.nextInt();
            int temp;
            int comb = 0;
            ArrayList <Integer> data = new ArrayList<>();
            for (int i = 1; i < ss.length; i++)
                data.add(Integer.parseInt(ss[i]));
            Collections.sort(data);
            Collections.reverse(data);
            for (int i = 0; i < data.size()-1; i++)
            {
                temp = total;
                temp -= data.get(i);
                for (int j = i+1; j < data.size(); j++)
                {
                    if (data.get(j) <= temp)
                        temp-=data.get(j);
                    if (temp == 0)
                    {
                        comb++;
                        temp+=data.get(j);
                    }
                }
            }
            System.out.println(comb + " combinations");
        }
    }
}
