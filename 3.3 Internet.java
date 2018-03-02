

	import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
	import java.util.Scanner;

	public class Internet {

	    public static void main(String[] args) throws IOException {
	        
	    
	        Scanner s = new Scanner(System.in);
	        
	        int search;
	        int N =s.nextInt();
	        int M = s.nextInt();
	        //System.out.println(M);
	        boolean check =false;
	        boolean hasInternet[]= new boolean[N+1];
	        LinkedList <Integer> queue= new LinkedList<Integer>(); 
	        queue.add(1);
	        hasInternet[1]=true;
	        
	        ArrayList<ArrayList<Integer>> connections = new ArrayList<ArrayList<Integer>>();
	        for (int i=0; i<N+1; i++) {
	        	connections.add(new ArrayList<Integer>());
	        }
	        
	               
	        for (int i=0; i<M; i++)
	        {
	        
	        	int x = s.nextInt();
	        	int y = s.nextInt();
	           connections.get(x).add(y);
	           connections.get(y).add(x);
	          
	        }
	        s.close();
	        while(!queue.isEmpty()) //queue is list of connections starting at 1... moves to 2, 3 ,4... n.
	        {   
	        	int tempint = queue.removeFirst();
	        	
	            ArrayList<Integer> temp = connections.get(tempint);
	            
	        	for(int j =0; j<temp.size(); j++)

	        	{
	        		if(hasInternet[temp.get(j)]==true)
	        		{
	 
	        			if(hasInternet[tempint]==false) {
	        				hasInternet[tempint]=true;
	        			}
	        		}
	        		else {
	        			queue.addLast(temp.get(j));
	        			hasInternet[temp.get(j)]=true;
	        		}
	        	}

	        }
	        
	        for(int i=1; i<N+1; i++)
	        {
	        	
	            if(hasInternet[i] == false)
	            {
	            System.out.println(i);
	            check=true;
	            }
	        }
	        if (check==false)
	        {
	            System.out.println("Connected");
	        }
 
	        
	       // System.out.println(connections.get(2));
	        
	    }
	    
	       

	}

