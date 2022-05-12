package Problem;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Driver {
	  public static void main(String[] args) throws IOException 
	  {

		  /*    //Reading in vertices
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
		    */
	/*	  
		  City c1 = new City("NY", "USA");
		  City c2 = new City("Jerusalem", "Palestine");
		  City c3 = new City("Paris", "France");

		  Vertex<City> v = new Vertex<City>(c1);
		  Vertex<City> v1 = new Vertex<City>(c2);
		  Vertex<City> v2 = new Vertex<City>(c3);

*/
	     // System.out.println(c1.getcity().toString());


		  Vertex<String> v = new Vertex<String>("Hello");
		  Vertex<String> v1 = new Vertex<String>("BYY");
		  Vertex<String> v2 = new Vertex<String>("Good");
		  
		  Edge<String> e1 = new Edge<String>(v,v1,"link");
		  
		  ArrayList<Vertex> dataVertex = new ArrayList<Vertex>();
		  dataVertex.add(v);
		  dataVertex.add(v1);
		  dataVertex.add(v2);

	      System.out.println(v.getvertexType() + " "+ v.getvertexId());
		  System.out.println(v1.getvertexType() + " "+ v1.getvertexId()); 
		  System.out.println(v2.getvertexType() + " "+ v2.getvertexId()); 

		  
	       output(dataVertex);
		
			  ArrayList<Edge> dataEdge = new ArrayList<Edge>();
			  
			  outputEdge(dataEdge);

		  
	  }
		    public static void output(ArrayList<Vertex> data) throws IOException
		    {
		      // ArrayList<String> data = new ArrayList<>();
		     //  data.add(v.getvertexType().toString());
		     //  data.add(v.getvertexType().toString());
		        BufferedWriter writer = Files.newBufferedWriter(Paths.get("vertices.csv"));
		      
		        for (int i=0; i<data.size(); i++)
		        {
		        	writer.write(data.get(i).getvertexId() + ","+ data.get(i).getvertexType());
				    writer.newLine();
				   
		        }
		        writer.close();
		    }
		    
		    public static void outputEdge(ArrayList<Edge> data) throws IOException
		    {
	
		        BufferedWriter writer = Files.newBufferedWriter(Paths.get("edges.csv"));
		      
		        for (int i=0; i<data.size(); i++)
		        {
		        	writer.write(data.get(i).getFromVertex().getvertexId() + "," + data.get(i).getWeight());
				    writer.newLine();
				   
		        }
		        writer.close();
		    }
	
	  }

	 
