import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// Mayde Creek Invitational
// Question 12
// Best Seller
public class BestSeller {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("best_seller.dat"));
        ArrayList<String[]> data = new ArrayList<>();
        while (sc.hasNext()) {
            String ss = sc.nextLine();
            String[] s = ss.split("[,]");
            String name = s[0];
            int numberSale = Integer.parseInt(s[1]);
            double profit = Double.parseDouble(s[2].substring(1)) * numberSale;
            s[2] = "" + profit;
            boolean add = true;
            for (int i = data.size() - 1; i >= 0; i--)
            {
                String[] temp = data.get(i);
                if (profit < Double.parseDouble(temp[2]))
                {
                    data.add(i + 1, s);
                    add = false;
                    break;
                }
                else if (profit == Double.parseDouble(temp[2]))
                {
                    if (numberSale < Integer.parseInt(temp[1]))
                    {
                        data.add(i + 1, s);
                        add = false;
                        break;
                    }
                    else if (numberSale == Integer.parseInt(temp[1]))
                    {
                        if (name.compareTo(temp[0]) > 0)
                        {
                            data.add(i + 1, s);
                            add = false;
                            break;
                        }
                    }
                }
            }
            if (add)
                data.add(0, s);
        }
        for (int i = 0; i < data.size(); i++)
        {
            String [] w = data.get(i);
            System.out.printf("$%.2f - " + w[0] + "/" + w[1] + "\n", Double.parseDouble(w[2]));
        }
    }
}
