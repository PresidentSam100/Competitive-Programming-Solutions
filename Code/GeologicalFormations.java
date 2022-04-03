import java.io.File;
import java.util.*;
// Taylor Invitational
// Question 11
// Geological Formations
public class GeologicalFormations {
    public static final char SULFUR = '@';
    public static final char TUNGSTEN = '#';
    public static final char ALUMINUM = '!';
    public static final char CARBON = '$';
    public static final char NICKEL = '*';
    public static final char URANIUM = '^';
    public static final char GOLD = '+';
    public static final char SILVER = ':';
    public static final char PLATINUM = '%';
    public static final char LEAD = '&';
    public static final char SILICON = '|';
    public static final char PLUTONIUM = '(';
    public static final char COPPER = ')';
    public static final char ZINC = '1';
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(new File("formations.dat"));
        int N = sc.nextInt();
        for (int x = 0; x<N;x++)
        {
            ArrayList <Character> contains = new ArrayList<>();
            ArrayList <String> minerals = new ArrayList<>();
            ArrayList <Integer>  rows = new ArrayList<>();
            ArrayList <Integer> cols = new ArrayList<>();
            ArrayList <Integer> size = new ArrayList<>();
            sc.nextLine();
            String[][] array = new String[10][10];
            for (int r = 0; r < 10; r++)
            {
                String s = sc.nextLine();
                for (int c = 0; c< 10; c++)
                    array[r][c] = s.substring(c,c+1);
            }
            for (int r = 0; r < 10; r++)
            {
                for (int c = 0; c< 10; c++)
                {
                    String s = array[r][c];
                    if (!s.equals("."))
                    {
                        if (contains.contains(s.charAt(0)))
                        {
                            for (int i = 0; i < minerals.size(); i++)
                            {
                                if (contains.get(i) ==s.charAt(0))
                                    size.set(i, size.get(i) + 1);
                            }
                        }
                        else
                        {
                            contains.add(s.charAt(0));
                            rows.add(r+1);
                            cols.add(c+1);
                            size.add(1);
                            char ch = s.charAt(0);
                            if (ch == SULFUR)
                                minerals.add("Sulfur");
                            else if (ch == TUNGSTEN)
                                minerals.add("Tungsten");
                            else if (ch == ALUMINUM)
                                minerals.add("Aluminum");
                            else if (ch == CARBON)
                                minerals.add("Carbon");
                            else if (ch == NICKEL)
                                minerals.add("Nickel");
                            else if (ch == URANIUM)
                                minerals.add("Uranium");
                            else if (ch == GOLD)
                                minerals.add("Gold");
                            else if (ch == SILVER)
                                minerals.add("Silver");
                            else if (ch == PLATINUM)
                                minerals.add("Platinum");
                            else if (ch == LEAD)
                                minerals.add("Lead");
                            else if (ch == SILICON)
                                minerals.add("Silicon");
                            else if (ch == PLUTONIUM)
                                minerals.add("Plutonium");
                            else if (ch == COPPER)
                                minerals.add("Copper");
                            else if (ch == ZINC)
                                minerals.add("Zinc");
                        }
                    }
                }
            }
            if (minerals.isEmpty())
                System.out.println("NO DEPOSITS");
            else
                System.out.println("SURVEY " + (x+1) + ":");
            for (int i = 0; i < minerals.size(); i++)
                System.out.println("(" + rows.get(i) + "," + cols.get(i) + ") - " + minerals.get(i) + " size " + size.get(i));
            System.out.println();
        }
    }
}
