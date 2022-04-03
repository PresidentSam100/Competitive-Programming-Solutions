import java.io.File;
import java.util.Scanner;
// Taylor Invitational
// Question 12
// Safe Numbers
public class SafeNumbers {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("numbers.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            int base = sc.nextInt();
            int num = sc.nextInt();
            System.out.print(base + " " + num+ " ");
            while (base > 2)
            {
                try
                {
                    int a =  Integer.parseInt(""+num,base-1);
                    String b = Integer.toString(a,base-2);
                    num = Integer.parseInt(b);
                    base -= 2;
                }
                catch (Exception e)
                {
                    System.out.println(base + " " + num);
                    break;
                }
            }
            if (base==2)
            System.out.println("SAFE");
        }
    }
}
