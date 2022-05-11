package problem;
import problem.Vertex;
import problem.Edge;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
public class Graph<T> implements GraphInterface<T>
{
    public static final int NULL_EDGE = 0;
    private static final int DEFCAP = 50;  // default capacity
    private boolean directed;
    private boolean weighted;
    private int numVertices;
    private Vertex[] vertices = new Vertex[DEFCAP];
    private Edge[] edges = new Edge[DEFCAP];
    private ArrayList<ArrayList<Vertex>> adjList;
    private ArrayList<Integer> vertexIDs;
    private boolean[] marks;  // marks[i] is mark for vertices[i]
    
    public Graph(boolean direct, boolean weight)
    {
        adjList = new ArrayList<ArrayList<Vertex>>();
        for (int i=0; i < DEFCAP; i++)
        {
            adjList.add(new ArrayList<Vertex>());
        }
        if (direct == true)
        {
            directed = true;
        }
        else
        {
            directed = false;
        }
        if(weight == true)
        {
            weighted = true;
        }
        else
        {
            weighted = false;
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
    public Vertex addVertex(T vertex, int vertexID)
    {
        Vertex addition = new Vertex(vertex, vertexID);
        vertices[vertexID] = addition;
        numVertices++;
        System.out.println(vertices[vertexID].toString());
        return addition;
    }
    public boolean hasVertex(int vertexID)
    {
        for(int i=0;i < vertices.length; i++)
        {
            if(vertices[i].getvertexId() == vertexID)
            {
                return true;
            }
        }
        return false;
    }
    public void addEdge(int fromID, int toID, T data)
    {
        Vertex add1 = vertices[fromID];
        Vertex add2 = vertices[toID];
        int edgeCount = 0;
        System.out.println(vertices[0].getvertexId());
        for(int i =0; i < numVertices; i++)
        {
            if (vertices[i].getvertexId() == fromID)
            {
                add1 = vertices[i];
            }
            if (vertices[i].getvertexId() == toID)
            {
                add2 = vertices[i];
            }
        }
        int location = fromID;
        adjList.get(location).add(add2);
        if (directed == false)
        {
            int location2 = toID;
            adjList.get(location2).add(add1);
        }
        Edge obj = new Edge(add1,add2,0);
        edges[edgeCount] = obj;
        edgeCount++;
    }
    public void printGraph()
    {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("Adjacency list of " + "Vertex " + i);
            for (int j = 0; j < adjList.get(i).size(); j++) 
            {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void input(String csvFile) throws FileNotFoundException
    {
        //Reading in vertices
        File in = new File("vertices.csv");
        Scanner inputFile = new Scanner(in);
        String s;
        String[] csv;
        while(inputFile.hasNext())
        {
            s = inputFile.nextLine();
            csv = s.split(",");
        }
        for (int i=0; i < csv.length; i +=2)
        {
            addVertex(csv[i],csv[i+1]);
        }
        //Reading in edges
        File inp = newFile("edges.csv");
        Scanner input = new Scanner(inp);
        String s2;
        String[] csv2;
        while(input.hasNext())
        {
            s2 = input.nextLine();
            csv2 = s2.split(",");
        }
        for(int i=0; i < csv2.length;i +=4)
        {
            addEdge(csv2[i],csv2[i+1],csv2[i+2],csv2[i+3]);
        }
    }
    public void output()
    {
        List<List<String>> data = new List<List<String>>();
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("vertices.csv"));
        writer.write("VertexType,VertexID");
        writer.newLine();
        for (List<String> d: data)
        {
            writer.write(String.join(",",d));
            writer.newLine();
        }
        writer.close();
    }
}