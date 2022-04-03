import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// Taylor Invitational
// Question 4
// Sorting Systems
public class SortingSystems {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("sorting.dat"));
        int N = sc.nextInt();
        for (int x = 0; x < N; x++)
        {
            ArrayList <String> names = new ArrayList<>();
            ArrayList <Integer> fss = new ArrayList<>();
            ArrayList <Integer> sfss = new ArrayList<>();
            ArrayList <Double> drakes = new ArrayList<>();
            sc.nextLine();
            int X = sc.nextInt();
            if (X == 0)
            {
                System.out.println("SECTOR EMPTY");
                break;
            }
            for (int y = 0; y < X; y++)
            {
                sc.nextLine();
                String name = sc.next();
                int fs = sc.nextInt();
                int sfs = sc.nextInt();
                double drake = 100;
                for (int i = 0; i < 7; i++)
                    drake *= sc.nextDouble();
                if (drake > 100)
                    drake = 100;
                int index = names.size();
                for (int i = 0; i < names.size(); i++)
                {
                    if (fss.get(i) < fs)
                    {
                        index = i;
                        break;
                    }
                    else if (fss.get(i) == fs)
                    {
                        if (sfss.get(i) < sfs)
                        {
                            index = i;
                            break;
                        }
                        else if (sfss.get(i) == sfs)
                        {
                            if (drakes.get(i) < drake)
                            {
                                index = i;
                                break;
                            }
                            else if (drakes.get(i) == drake)
                            {
                                if (names.get(i).compareTo(name) > 0)
                                {
                                    index = i;
                                    break;
                                }
                            }
                        }
                    }
                }
                names.add(index, name);
                fss.add(index, fs);
                sfss.add(index, sfs);
                drakes.add(index, drake);
            }
            for (int i = 0; i < names.size(); i++)
                System.out.printf((i+1)+ ": " + names.get(i) + ", Fueling stations: " + fss.get(i) + ", Star Fleet stations: " + sfss.get(i) + " Probability of Intelligent Life: %%%.3f\n",drakes.get(i));
        }
    }
}
