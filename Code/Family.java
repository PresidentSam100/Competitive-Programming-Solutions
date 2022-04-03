import java.io.File;
import java.util.Scanner;
// UIL District2 2012
// Question 5
// Family Portrait
public class Family {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("family.dat"));
        int N = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < N; x++)
        {
            String [][] picture = new String[18][12];
            for (int r = 0; r < picture.length; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c < picture[r].length; c++)
                    picture[r][c] = s.substring(c,c+1);
            }
            for (int c = 0; c < picture[0].length; c++)
            {
                for (int r = picture.length - 1; r >= 0; r--)
                    System.out.print(picture[r][c]);
                System.out.println();
            }
            System.out.println();
        }
    }
}
