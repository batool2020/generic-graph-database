package Problem;

import java.io.*;
import java.util.*;

public class Driver {
	  public static void main(String[] args) throws IOException 
	  {
	String line = null;
    Scanner scan = new Scanner(System.in);

	 System.out.print("File name > ");
	  String fn = scan.next();

	    Scanner reader = new Scanner(new FileReader(fn));
	ArrayList<ArrayList<String>> lines = new ArrayList<>();
	 //   BufferedReader reader = new BufferedReader(new FileReader(fn));
	    
	    while ((line = reader.nextLine()) != null) {
	        ArrayList<String> tokens = new ArrayList<>();
	        StringTokenizer st = new StringTokenizer(line, ",");
	        while (st != null) {
	            tokens.add((String) st.nextToken());
	        }
	        lines.add(tokens);
	    }
	    
	    System.out.println(lines.toString());

	  }
}
