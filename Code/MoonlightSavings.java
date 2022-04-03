import java.io.File;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Scanner;
// Taylor Invitational
// Question 5
// Moonlight Savings
public class MoonlightSavings {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("moonlight.dat"));
        HashMap <Integer,String> months = new HashMap<>();
        months.put(1,"January");
        months.put(2,"February");
        months.put(3,"March");
        months.put(4,"April");
        months.put(5,"May");
        months.put(6,"June");
        months.put(7,"July");
        months.put(8,"August");
        months.put(9,"September");
        months.put(10,"October");
        months.put(11,"November");
        months.put(12,"December");
        int N = sc.nextInt();
        sc.nextLine();
        for (int x =0; x<N; x++)
        {
            String[] s =sc.nextLine().split("/");
            int month = Integer.parseInt(s[0]);
            int day = Integer.parseInt(s[1]);
            int year = Integer.parseInt(s[2]);
            int sYear = 2018;
            int sMonth = 8;
            int sDay = 17;
            int space = 0;
            while (sYear != year || sMonth != month || sDay != day)
            {
                space++;
                if (daysInMonth(sMonth,sYear) == sDay++)
                {
                    sDay = 1;
                    if (sMonth++ == 12)
                    {
                        sMonth = 1;
                        sYear++;
                    }
                }
            }
            if (space == 0)
                System.out.println("Just a Space Warp Shady!!!");
            else
                System.out.println(months.get(month) + " " + day + ", " + year + " is " + space + " days after August 17, 2018");
        }
    }

    public static int daysInMonth(int month,int year)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (month == 2 && year % 4 == 0)
            return 29;
        else if (month == 2)
            return 28;
        return -1;
    }
}
