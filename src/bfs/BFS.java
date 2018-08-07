
package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    
 public void bfs(Vertex vertex,Vertex goal)
 {
   Queue<Vertex> queue = new LinkedList<>();
   queue.add(vertex);
   vertex.setVisited(true);
   
   while(!queue.isEmpty())
   {
       Vertex acVertex = queue.remove();
       System.out.println("Actual Vertex : "+acVertex);
       for(Vertex v:acVertex.getAdjacenciesList())
       {
       if(!v.isVisited())
       {
           v.setVisited(true);
           v.setPredecessor(acVertex);
           queue.add(v);
       }if(goal.isVisited())
                {
                    queue.add(goal);
                    goal.setVisited(true);
                    System.out.println("Found : " + goal + " Is Final Goal");
                    System.out.println("Successfull");
                    System.exit(0);
                }
       }
   }
 
 }
    
    
    
}
