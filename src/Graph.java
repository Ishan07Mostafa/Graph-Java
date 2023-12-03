import java.util.ArrayList;
import java.util.LinkedList;

public class Graph{
    private int[][] matrix;
    public ArrayList<Vertices> array;
    public ArrayList<LinkedList<Vertices>> list;

    /*
      Initializes the graph as an adjacency matrix
     */
    public Graph(int size){
        this.array = new ArrayList<>();
        this.matrix = new int[size][size];
    }

    /*
      Adds vertices to the graph
     */
    public void addVertex(Vertices vertex){
        this.array.add(vertex);
    }

    /*
      Adds an edge between two given vertices
     */
    public void addEdge(int source, int destination){
        this.matrix[source][destination] = 1;
    }

    /*
      Checks whether two vertices are connected
     */
    public boolean checkEdge(int source, int destination){
        if(this.matrix[source][destination]==1) return true;
        else return false;
    }

    /*
      Prints the adjacency matrix for the graph
     */
    public void printMatrix(){
        System.out.print("  ");
        for(Vertices point: this.array){
            System.out.print(point.vertex+" ");
        }
        System.out.println();
        for(int i = 0; i<this.matrix.length; i++){
            System.out.print(array.get(i).vertex+" ");
            for(int j = 0; j<this.matrix[i].length; j++) System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }


    /*
      Initializes the graph as an adjacency list
     */
    public Graph(){
        this.list = new ArrayList<>();
    }

    /*
      Adds node to the graph
     */
    public void addNode(Vertices node){
        LinkedList<Vertices> linked = new LinkedList<>();
        linked.add(node);
        this.list.add(linked);
    }

    /*
      Connects two nodes to one another
     */
    public void addLink(int source, int destination){
        Vertices node = this.list.get(destination).get(0);
        this.list.get(source).add(node);
    }

    /*
      Checks whether two nodes have any connection
     */
    public boolean checkLink(int source, int destination){
        LinkedList<Vertices> list = this.list.get(source);
        Vertices node = this.list.get(destination).get(0);
        for(Vertices vertex: list){
            if(vertex==node) return true;
        }
        return false;
    }

    /*
      Prints the adjacency list for the graph
     */
    public void printList(){
        for(LinkedList<Vertices> list: this.list){
            for(Vertices node: list){
                System.out.print(node.vertex+" -> ");
            }
            System.out.println();
        }
    }
}
