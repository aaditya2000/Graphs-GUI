/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;
import java.util.*;
/**
 *
 * @author aadityagadhave
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Graph> list=new ArrayList<Graph>();
    //static ArrayList<ArrayList<Graph>> edge=new ArrayList<ArrayList<Graph>>();
    static HashMap<String,ArrayList<Graph>> hm = new HashMap<String,ArrayList<Graph>>();
    //static int l=0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Vertex().setVisible(true);
    }
    
}
