package problem;
import problem.Vertex;
import problem.Edge;
import java.util.ArrayList;
public class Graph<T> implements GraphInterface
{
    public static final int NULL_EDGE = 0;
    private static final int DEFCAP = 50;  // default capacity
    private boolean directed;
    private int numVertices;
    private int maxVertices;
    private T[] vertices;
    private T[] edges;
    private ArrayList<ArrayList<Vertex>> adjList;
    private Integer[] vertexIDs;
    private boolean[] marks;  // marks[i] is mark for vertices[i]
    
    public Graph(boolean direct)
    {
        adjList = new ArrayList<ArrayList<Vertex>>();
        for (int i=0; i < numVertices; i++)
        {
            adjList.add(new ArrayList<Vertex>());
        }
        if (direct == true)
        {
            directed = true;
        }
        else if(direct == false)
        {
            directed = false;
        }
    }
    public boolean isEmpty()
    {
        if (vertices.length == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public void addVertex(T vertex, int vertexID)
    {
        Vertex addition = new Vertex(vertex, vertexID);
        vertices[vertexID] = addition;
        numVertices++;
        
    }
    @Override
    public boolean hasVertex(T vertex)
    {

    }
    @Override
    public void addEdge(T from, T to)
    {

    }
    public void printGraph(ArrayList<ArrayList<Vertex>> adjList)
    {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adjList.get(i).size(); j++) 
            {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}