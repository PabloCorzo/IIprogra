package pr2;

import java.util.ArrayList;
import java.util.List;

import util.Graph;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("\nTest shortestPathFindsAPath"); 
        System.out.println("----------------------------"); 
        // We build the graph
        Graph<Integer> g = new Graph<>();
        g.addEdge(1, 2);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(5, 4);

        // We build the expected path
        List<Integer> expectedPath = new ArrayList<>();
        expectedPath.add(1);
        expectedPath.add(5);
        expectedPath.add(4);;
    }
}
