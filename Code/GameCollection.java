import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// Clements Invitational
// Question 4
// Game Collection
public class GameCollection {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("gamecollection.dat"));
        ArrayList <String> consoles = new ArrayList<>();
        ArrayList <Integer> maxPlayers = new ArrayList<>();
        ArrayList <String> gameNames = new ArrayList<>();
        while (sc.hasNext())
        {
            String [] s = sc.nextLine().split("/");
            String console = s[2];
            int maxPlayer = Integer.parseInt(s[1]);
            String gameName = s[0];
            int index = consoles.size();
            for (int i = 0; i < consoles.size(); i++)
            {
                if (consoles.get(i).compareTo(console) > 0) {
                    index = i;
                    break;
                }
                else if (consoles.get(i).compareTo(console) == 0)
                {
                    if (maxPlayers.get(i) > maxPlayer) {
                        index = i;
                        break;
                    }
                    else if (maxPlayers.get(i) == maxPlayer)
                    {
                        if (gameNames.get(i).compareTo(gameName) > 0) {
                            index = i;
                            break;
                        }
                    }
                }
            }
            consoles.add(index, console);
            maxPlayers.add(index, maxPlayer);
            gameNames.add(index, gameName);
        }
        for (int i = 0; i < consoles.size(); i++)
            System.out.println("\"" + gameNames.get(i) + "\"" + " (" + consoles.get(i) + " - " + maxPlayers.get(i) + ")");
    }
}
