package avengers;

import java.util.ArrayList;

public class Vertex {
    private int genNum;
    private int eventNum;
    private double funVal;
    private int valueEU;
    private int peopleNode;
    private boolean visted = false;
    private String neuronName;
    private ArrayList<Integer> edges;
    private ArrayList<String> synapses;

    public Vertex() {
        genNum = 0;
        funVal = 0;
        edges = new ArrayList<Integer>();
    }

    public Vertex(int genNum, double funVal) {
        this.genNum = genNum;
        this.funVal = funVal;
        edges = new ArrayList<Integer>();
    }

    public Vertex(int eventNum, int valueEU) {
        this.eventNum = eventNum;
        this.valueEU = valueEU;
        edges = new ArrayList<Integer>();
    }

    public int getValueEU() {
        return valueEU;
    }

    public Vertex(int peopleNode) {
        this.peopleNode = peopleNode;
        edges = new ArrayList<>();
    }

    public Vertex(String neuronName) {
        this.neuronName = neuronName;
        synapses = new ArrayList<String>();
    }

    public boolean getVisted() {
        return visted;
    }

    public boolean setVisted()

    {
        return visted = true;
    }

    public String getNeuronname() {
        return neuronName;
    }

    public int getGenNum() {
        return genNum;
    }

    public int getEventNum() {
        return eventNum;
    }

    public double getFunVal() {
        return funVal;
    }

    public int getPeopleNode() {
        return peopleNode;
    }

    public int setGenNum(int n) {
        return genNum = n;
    }

    public double setFunVal(int m) {
        return funVal = m;
    }

    public void addToEdges(int edgeWeight, double vFunVal) {
        edges.add((int) (edgeWeight / (funVal * vFunVal)));
    }

    public void addToTimelineEdges(int edge) {
        edges.add(edge);
    }

    public int getTimeLineEdge(int timeEdge) {
        return edges.get(timeEdge);
    }

    public void addToPeopleEdge(int edge) {
        edges.add(edge);
    }

    public int getPeopleEdge(int peopleEdge) {
        return edges.get(peopleEdge);
    }

    public void setPeopleEdge(int x) {
        edges.remove(x);
    }

    public int getEdge(int otherVertex) {
        return edges.get(otherVertex);
    }

    public String toString() {
        return edges.toString();
    }

    public int findVertex(String name) {
        return edges.indexOf(name);
    }

    public void addToSynapses(String neuron) {
        synapses.add(neuron);
    }

    public int getSynapsesSize() {
        return synapses.size();
    }

    public ArrayList getSynapsesList() {
        return synapses;
    }

    public int getEdgesSize() {
        return edges.size();
    }

    public void snap() {
        edges.clear();
    }
}
