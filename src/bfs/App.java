
package bfs;

public class App {

    public static void main(String[] args) {
        
       Vertex vertexA = new Vertex("A");
       Vertex vertexB = new Vertex("B");
       Vertex vertexC = new Vertex("C");
       Vertex vertexD = new Vertex("D");
       Vertex vertexE = new Vertex("E");
       Vertex vertexF = new Vertex("F");
       Vertex vertexG = new Vertex("G");
       Vertex vertexH = new Vertex("H");
       Vertex vertexI = new Vertex("I");

       
       vertexA.addNebh(vertexC);
       vertexA.addNebh(vertexD);
       vertexC.addNebh(vertexI);
       vertexD.addNebh(vertexE);
       vertexE.addNebh(vertexF);
       vertexE.addNebh(vertexG);
       
       BFS bfs = new BFS();
       bfs.bfs(vertexA,vertexF);
       
       

       
       
       
    }
    
}
