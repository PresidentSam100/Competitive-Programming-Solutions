import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;
// Seven Lakes Invitational
// Question 6
// Beacon
public class Beacon {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("beacon.in"));
        while (sc.hasNextInt()) {
            long x = sc.nextLong();
            if (x == 0)
            {
                System.out.println("Ingots Needed: 0");
                System.out.println("Faces: 0\n");
                continue;
            }
            BigInteger ingots = new BigInteger("0");
            for (long i = x; i > 1; i--)
                ingots = ingots.add(new BigInteger("" + (int)Math.pow(2 * i - 1, 2) * 9));
            BigInteger faces = new BigInteger(""+ ((x * x * 4) + 2 * (long)Math.pow(2 * x - 1, 2)));
            System.out.println("Ingots Needed: " + ingots);
            System.out.println("Faces: " + faces);
            System.out.println();
        }
    }
}
