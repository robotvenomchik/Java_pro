package Homeworks.Homework20;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("Вершина 1 існує: " + graph.hasVertex(1));
        System.out.println("Ребро між 1 і 2 існує: " + graph.hasEdge(1, 2));

        graph.removeEdge(1, 2);
        System.out.println("Ребро між 1 і 2 існує: " + graph.hasEdge(1, 2));

        graph.removeVertex(3);
        System.out.println("Вершина 3 існує: " + graph.hasVertex(3));

        System.out.println("Ребро між 2 і 3 існує: " +graph.hasEdge(2,3));
    }
}
