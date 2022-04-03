import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// UIL State 2004
// Question 5
// Scheduling Nightmare on Elm Street
public class DVR {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("dvr.dat"));
        ArrayList <String> priority = new ArrayList<>();
        ArrayList <Integer> times = new ArrayList<>();
        ArrayList <String> shows = new ArrayList<>();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < X; x++)
            priority.add(sc.nextLine());
        for (int y = 0; y < Y; y++)
        {
            int time = sc.nextInt();
            String show = sc.nextLine().substring(1);
            int index = shows.size();
            for (int i = 0; i < shows.size(); i++)
            {
                if (times.get(i) > time)
                {
                    index = i;
                    break;
                }
                else if (times.get(i) == time)
                {
                    if (priority.indexOf(shows.get(i)) > priority.indexOf(show))
                    {
                        index = i;
                        break;
                    }
                }
            }
            times.add(index, time);
            shows.add(index, show);
        }
        ArrayList <Integer> finTimes = new ArrayList<>();
        ArrayList <String> finShows = new ArrayList<>();
        for (int i = 0; i < shows.size(); i++)
        {
            if (!finTimes.contains(times.get(i)) && !finShows.contains(shows.get(i)))
            {
                finTimes.add(times.get(i));
                finShows.add(shows.get(i));
                System.out.println(shows.get(i));
            }
        }
    }
}
