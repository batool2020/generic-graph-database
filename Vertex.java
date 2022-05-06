
package problem;

public class Vertex<T>
{

  private int vertexId;
  private T vertexType;
  private int id = 0;
  
  
  
    public Vertex(T vertextType)
  // Instantiates a Vertex.
  {
	vertexId = id;
	id++;
  }
  
  
  //setters and getters for vertex datatypes
  
   public T getvertexType()
    {
        return this.vertexType;
    }
    public int getvertexId()
    {
        return this.vertexId;
    }

}
