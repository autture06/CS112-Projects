package avengers;

import java.util.ArrayList;

public class Graph {
    private int v;
    private Vertex[] vertices;
    private ArrayList<Vertex> neuronList;

    public Graph(int v) {
        this.v = v;
        vertices = new Vertex[v];
    }

    public Vertex getVertex(int i) {
        return vertices[i];
    }

    public void add(Vertex newV, int V) {
        vertices[V] = newV;
    }

    public Graph() {
        neuronList = new ArrayList<Vertex>();
    }

    public void addNeurons(Vertex name) {
        neuronList.add(name);
    }

    public Vertex getNeuron(String name) {
        for (int i = 0; i < neuronList.size(); i++) {
            if (neuronList.get(i).getNeuronname().equals(name)) {
                return neuronList.get(i);
            }
        }
        return null;
    }

    public ArrayList getNeuronList() {
        return neuronList;
    }
}
