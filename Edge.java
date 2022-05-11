package Problem;

import Problem.Vertex;
public class Edge<T>
{
    private Vertex from;
    private Vertex to;
    private int weight;
    private T data;
	private T type;
    
    public Edge()
    {
        this.from = null;
        this.to = null;
        this.weight = 0;
        this.data = null;
    }
    public Edge(Vertex start, Vertex end, T data)
    {
        this.from = start;
        this.to = end;
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
	public String getToVertex() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Vertex getFromVertex() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFromVertex(String toVertex) {
		// TODO Auto-generated method stub
		
	}
}
