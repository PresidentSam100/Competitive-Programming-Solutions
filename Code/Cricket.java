import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("cricket.dat"));
        String[]scores = {"M","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","25"};
        int[] redHits = new int[scores.length];
        int[] blueHits = new int[scores.length];
        boolean[] redLock = new boolean[scores.length];
        boolean[] blueLock = new boolean[scores.length];
        int redPoints = 0;
        int bluePoints = 0;

        while (sc.hasNextLine())
        {
            String[] s = sc.nextLine().split("[/()x]");
            int[] playerHits = new int[scores.length];
            boolean[] playerLock = new boolean[scores.length];

            if (s[0].equals("red "))
            {
                playerHits = redHits;
                playerLock = redLock;
            }
            else if (s[0].equals("blue "))
            {
                playerHits = blueHits;
                playerLock = blueLock;
            }
            for (int i = 1; i < s.length; i+=2)
            {
                int hits = Integer.parseInt(s[i]);
                int points = 0;
                if (s[i+1].equals("B"))
                    points = 21;
                else if (!s[i+1].equals("M"))
                    points = Integer.parseInt(s[i+1]);
                playerHits[points] += hits;
                if (playerHits[points] >= 3)
                    playerLock[points] = true;
                if (playerLock[points] && !(redLock[points] && blueLock[points]))
                {
                    if (s[0].equals("red "))
                        redPoints += (playerHits[points] - 3) * Integer.parseInt(scores[points]);
                    else if (s[0].equals("blue "))
                        bluePoints += (playerHits[points] - 3) * Integer.parseInt(scores[points]);
                    playerHits[points] = 3;
                }
            }
            System.out.println(Arrays.toString(redHits));
            System.out.println(redPoints);
            System.out.println(Arrays.toString(blueHits));
            System.out.println(bluePoints);
            System.out.println();
        }
        System.out.println(redPoints);
        System.out.println(bluePoints);
    }
}
