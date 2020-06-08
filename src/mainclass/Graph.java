/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author aadityagadhave
 */
public class Graph {
    
    private String name;
    private double x,y;
    private int weight;
   
    public Graph(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
    public boolean equals(Graph graph)
    {
        return (this.name.equals(graph.name) && this.x==graph.x && this.y==graph.y);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
