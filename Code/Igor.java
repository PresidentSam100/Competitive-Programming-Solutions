import java.io.File;
import java.util.*;
/*
Igor
Question 4
UIL Invitational A 2020
*/
public class Igor {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("igor.dat"));
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            String s = sc.next();
            ArrayList<String> let = new ArrayList<>();
            ArrayList<Integer> count = new ArrayList<>();
            for (int j = 0; j < s.length(); j++)
            {
                if (let.contains(s.substring(j,j+1)))
                {
                    count.set(let.indexOf(s.substring(j,j+1)),count.get(let.indexOf(s.substring(j,j+1)))+1);
                }
                else
                {
                    let.add(s.substring(j,j+1));
                    count.add(1);
                }
            }
            boolean odd = true;
            int num = 0;
            for (int j = 0; j < count.size(); j++)
            {
                if (count.get(j)%2==0)
                {
                    num += count.get(j);
                    count.set(j,0);
                }
                else
                {
                    num+=count.get(j)-1;
                    count.set(j,1);
                }
                if (odd&&count.get(j)%2==1) {
                    num++;
                    odd=false;
                    count.set(j,0);
                }
            }
            num *= num;
            for (int j = 0; j< count.size(); j++)
                num += count.get(j);
            System.out.println(num);
        }
    }
}
