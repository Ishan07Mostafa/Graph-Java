public class Tester{
    public static void main(String[] args){
        Graph graph1 = new Graph(6);

        graph1.addVertex(new Vertices("A"));
        graph1.addVertex(new Vertices("B"));
        graph1.addVertex(new Vertices("C"));
        graph1.addVertex(new Vertices("D"));
        graph1.addVertex(new Vertices("E"));
        graph1.addVertex(new Vertices("F"));

        graph1.addEdge(0,1);
        graph1.addEdge(0,3);
        graph1.addEdge(1,2);
        graph1.addEdge(1,3);
        graph1.addEdge(2,0);
        graph1.addEdge(3,4);
        graph1.addEdge(4,1);
        graph1.addEdge(4,5);

        graph1.printMatrix();
        String source = graph1.array.get(0).vertex;
        String destination = graph1.array.get(2).vertex;
        System.out.println("Is there an edge between " + source + " and " + destination + " : " +graph1.checkEdge(0,2));
        System.out.println();


        Graph graph2 = new Graph();

        graph2.addNode(new Vertices("U"));
        graph2.addNode(new Vertices("V"));
        graph2.addNode(new Vertices("W"));
        graph2.addNode(new Vertices("X"));
        graph2.addNode(new Vertices("Y"));
        graph2.addNode(new Vertices("Z"));

        graph2.addLink(0,1);
        graph2.addLink(0,2);
        graph2.addLink(1,4);
        graph2.addLink(1,5);
        graph2.addLink(2,0);
        graph2.addLink(2,3);
        graph2.addLink(3,5);
        graph2.addLink(4,0);
        graph2.addLink(5,4);

        graph2.printList();
        System.out.println("Is there a link: "+graph2.checkLink(3,5));
    }
}
