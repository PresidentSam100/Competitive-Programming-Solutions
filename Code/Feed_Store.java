import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Feed_Store {
    private static List<List<Node>> adj;
    private static String[] name;
    private static int[] wantedFeed;
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("feed_store.dat"));
        int feed = sc.nextInt();
        String[] s = sc.next().split(",");
        name = new String[s.length+1];
        wantedFeed = new int[s.length+1];
        name[0] = "A";wantedFeed[0] = 0;
        for (int i = 0; i < s.length; i++)
        {
            name[i+1] = s[i].substring(0,1);
            wantedFeed[i+1] = Integer.parseInt(s[i].substring(1,2));
        }

        while (sc.hasNext())
        {
            String[] connection = sc.next().split("[/-]");
            String locationA = connection[0];
            String locationB = connection[1];
            int distance = Integer.parseInt(connection[2]);
            System.out.println(locationA + locationB + distance);
        }

        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(wantedFeed));
    }

    public static void dijkstra(List<List<Node>> a, int src)
    {
        adj = a;
        for (int i = 0; i < name.length; i++)
        {}

    }
}

class Node implements Comparator<Node>
{
    public int node;
    public int cost;
    public Node()
    {

    }
    public Node(int node, int cost)
    {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compare(Node node1, Node node2)
    {
        if (node1.cost < node2.cost)
            return -1;
        if (node1.cost > node2.cost)
            return 1;
        return 0;
    }
}