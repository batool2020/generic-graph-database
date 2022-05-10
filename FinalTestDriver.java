import problem.Graph;
public class FinalTestDriver
{
    public static void main(String[] args)
    {
        Graph gr = new Graph(true, false);
        gr.addVertex(0,0);
        gr.addVertex(0,1);
        gr.addVertex(0,2);
        gr.addEdge(0,1,0);
        gr.addEdge(1,2,0);
        gr.printGraph();
    }
}