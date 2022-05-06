package problem;
import problem.Vertex;
public class Edge<T>
{
    private Vertex from;
    private Vertex to;
    private int weight;
    private T data;
    
    public Edge()
    {
        this.from = null;
        this.to = null;
        this.weight = 0;
        this.data = null;
    }
    public Edge(Vertex start, Vertex end, int weight, T data)
    {
        this.from = start;
        this.to = end;
        this.weight = weight;
        this.data = data;
    }
    public Vertex getStart()
    {
        return this.from;
    }
    public Vertex getEnd()
    {
        return this.to;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public T getData()
    {
        return this.data;
    }
}