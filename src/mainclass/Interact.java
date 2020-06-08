/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
import java.util.*;
import static mainclass.MainClass.*;
import static mainclass.Vertex.*;
import static mainclass.ShortestPath.*;
/**
 *
 * @author aadityagadhave
 */

class Draw extends JPanel{
    
    static int flg=0;
    
    Graph searchFrom(String s)
    {
        int i;
        
        for(i=0;i<list.size();i++)
        {
            if(list.get(i).getName().equals(s))
                return list.get(i);
        }
        
        return new Graph(" ",0,0);
    }
    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);
        Graphics2D g2D=(Graphics2D)g;
        
        int i=0;
        int n=list.size();
        g2D.setColor(Color.blue);
        
        for(i=0;i<n;i++)
        {
            Graph gr=list.get(i);
            
            g2D.fillOval((int)gr.getX()-9,(int)gr.getY()-9,18,18);
        }
            
        Graphics2D g2=(Graphics2D)g;
        Graphics2D g3=(Graphics2D)g;
        //int size=Interact.ed.size();
        
        g3.setColor(Color.black);
        g2.setColor(Color.red);
        //g3.setColor(Color.green);
        Iterator it=hm.entrySet().iterator();
        
        while(it.hasNext())
        {
            //displayHm();
            Map.Entry mp = (Map.Entry)it.next(); 
            String s=(String)mp.getKey();
            Graph gr=searchFrom(s);
            
            if(gr==new Graph(" ",0,0))
                continue;
            ArrayList<Graph>al=(ArrayList<Graph>)mp.getValue();
            //JOptionPane.showMessageDialog(null, al.size());
            
            for(i=0;i<al.size();i++)
            {
               
                if(!Interact.gm.isEmpty() && Interact.gm.containsKey(gr))
                {
                    if(Interact.gm.get(gr).getName().equals(al.get(i).getName()))
                    {
                        g2.setColor(Color.green);
                        g2.drawLine((int)gr.getX(),(int)gr.getY(),(int)al.get(i).getX(),(int)al.get(i).getY());
                        g2.setColor(Color.red);
                        
                        g2.setColor(Color.black);
                        int dist1=(int)Math.sqrt(Math.pow(gr.getX()-al.get(i).getX(),2)+Math.pow(gr.getY()-al.get(i).getY(),2));
                        int x=(int)((dist1-30)*al.get(i).getX()+30*gr.getX())/dist1;
                        int y=(int)((dist1-30)*al.get(i).getY()+30*gr.getY())/dist1;

                        g2.drawOval(x-4,y-4,8, 8);
                        g2.setColor(Color.red);
                        continue;
                    }
                        
                }
                if(!Interact.gm1.isEmpty() && Interact.gm1.containsKey(gr))
                {
                    if(Interact.gm1.get(gr).getName().equals(al.get(i).getName()))
                    {
                        g2.setColor(Color.green);
                        g2.drawLine((int)gr.getX(),(int)gr.getY(),(int)al.get(i).getX(),(int)al.get(i).getY());
                        g2.setColor(Color.red);
                        
                        g2.setColor(Color.black);
                        int dist1=(int)Math.sqrt(Math.pow(gr.getX()-al.get(i).getX(),2)+Math.pow(gr.getY()-al.get(i).getY(),2));
                        int x=(int)((dist1-30)*al.get(i).getX()+30*gr.getX())/dist1;
                        int y=(int)((dist1-30)*al.get(i).getY()+30*gr.getY())/dist1;
                        
                        g2.drawOval(x-4,y-4,8, 8);
                        g2.setColor(Color.red);
                        continue;
                    }
                        
                }
                g2.drawLine((int)gr.getX(),(int)gr.getY(),(int)al.get(i).getX(),(int)al.get(i).getY());
                g2.setColor(Color.black);
                int dist1=(int)Math.sqrt(Math.pow(gr.getX()-al.get(i).getX(),2)+Math.pow(gr.getY()-al.get(i).getY(),2));
                
                int x=(int)((dist1-30)*al.get(i).getX()+30*gr.getX())/dist1;
                int y=(int)((dist1-30)*al.get(i).getY()+30*gr.getY())/dist1;
                
                g2.drawOval(x-4,y-4,8, 8);
                
                g2.setColor(Color.red);
                
            }    
            
        }
        
        g2.setColor(Color.black);
        it=hm.entrySet().iterator();
        
        while(it.hasNext())
        {
            //displayHm();
            Map.Entry mp = (Map.Entry)it.next(); 
            String s=(String)mp.getKey();
            Graph gr=searchFrom(s);
            
            if(gr==new Graph(" ",0,0))
                continue;
            ArrayList<Graph>al=(ArrayList<Graph>)mp.getValue();
            //JOptionPane.showMessageDialog(null, al.size());
            
            for(i=0;i<al.size();i++)
            {   
                String s1=String.valueOf(al.get(i).getWeight());
                 
                g2.drawString(s1,(int)(gr.getX()+al.get(i).getX())/2,(int)(gr.getY()+al.get(i).getY())/2);
    
            }    
            
        }
        
        for(i=0;i<list.size();i++)
        {
            Graph gr=list.get(i);
            String s1=gr.getName();
            g2.drawString(s1,(int)gr.getX()-5,(int)gr.getY()-18);
            
        }
        
        int size=Interact.poi.size();
        if(size>1)
        {
            String s=(String)Interact.shape.getSelectedItem();
            
            if(s.equalsIgnoreCase("circle"))
                g2.drawOval(Interact.xcord-5,Interact.ycord-5,10,10); 
            else if(s.equalsIgnoreCase("square"))
            {
                int x[]=new int[4];
                int y[]=new int[4];
                x[0]=Interact.xcord-10;
                x[1]=Interact.xcord-10;
                x[2]=Interact.xcord;
                x[3]=Interact.xcord;
                
                y[0]=Interact.ycord-10;
                y[1]=Interact.ycord;
                y[2]=Interact.ycord;
                y[3]=Interact.ycord-10;
                
                g2.drawPolygon(x, y, 4);
            }
            else if(s.equalsIgnoreCase("triangle"))
            {
                int x[]=new int[3];
                int y[]=new int[3];
                x[0]=Interact.xcord-6+4;
                x[1]=Interact.xcord-12+4;
                x[2]=Interact.xcord+4;
                
                
                y[0]=Interact.ycord-10;
                y[1]=Interact.ycord;
                y[2]=Interact.ycord;
                
                
                g2.drawPolygon(x, y, 3);
            }
            else if(s.equalsIgnoreCase("Plus"))
            {
                g2.drawLine(Interact.xcord+4,Interact.ycord,Interact.xcord-10+4,Interact.ycord);
                g2.drawLine(Interact.xcord-5+4,Interact.ycord-5,Interact.xcord-5+4,Interact.ycord+5);
                
            }
            else
            {
                g2.drawLine(Interact.xcord+6-2,Interact.ycord-4,Interact.xcord-10+6+2,Interact.ycord+4);
                g2.drawLine(Interact.xcord+6-2,Interact.ycord+4,Interact.xcord-10+6+2,Interact.ycord-4);
            }
        }
        
    }
    
}
class Coordinate
{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }    
         
}

public class Interact extends javax.swing.JFrame implements Runnable 
{
    
/**
     * Creates new form Interact
     */
    static int prevX=-1,prevY=-1;
    static int curX=-1,curY=-1;
    static boolean drag=false;
    static int xcord,ycord;
    Thread tr=null;
    
    void initialize()
            
    {
        prevX=-1;
        prevY=-1;
        curX=-1;
        curY=-1;
    }
    private void groupButton()
    {
        ButtonGroup bg=new ButtonGroup();
        bg.add(addVertex);
        bg.add(deleteVertex);
        bg.add(addEdge);
        bg.add(deleteEdge);
        bg.add(modifyVertex);
        bg.add(modifyEdge);
        bg.add(searchC);
        bg.add(animation);
    }
    
    void display()
    {
        String[] str = new String[list.size()];
        
        int i;
        
        for(i=0;i<list.size();i++)
        {
            str[i]=list.get(i).getName();
        }
        
        f.setModel(new javax.swing.DefaultComboBoxModel<>(str));
        
        for(i=0;i<list.size();i++)
        {
            str[i]=list.get(i).getName();
        }
        
        t.setModel(new javax.swing.DefaultComboBoxModel<>(str));
    }
    public Interact() {
        initComponents();
        groupButton();
        //addMouseMotionListener(this);
        //addMouseListener(this);
        //setSize(400,400);
        //setLayout(null);
        setVisible(true);
        display();
        
        
        String[] str = new String[5];
        
        str[0]="Circle";
        str[1]="Square";
        str[2]="Plus";
        str[3]="Cross";
        str[4]="Triangle";
        shape.setModel(new javax.swing.DefaultComboBoxModel<>(str));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Draw inte;
        inte = new Draw();
        jLabel1 = new javax.swing.JLabel();
        addVertex = new javax.swing.JRadioButton();
        deleteVertex = new javax.swing.JRadioButton();
        addEdge = new javax.swing.JRadioButton();
        deleteEdge = new javax.swing.JRadioButton();
        modifyVertex = new javax.swing.JRadioButton();
        modifyEdge = new javax.swing.JRadioButton();
        searchC = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        f = new javax.swing.JComboBox<>();
        t = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        animation = new javax.swing.JRadioButton();
        shape = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Add vertex");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        inte.setBackground(new java.awt.Color(204, 204, 255));
        inte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        inte.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                inteMouseDragged(evt);
            }
        });
        inte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inteMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout inteLayout = new javax.swing.GroupLayout(inte);
        inte.setLayout(inteLayout);
        inteLayout.setHorizontalGroup(
            inteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        inteLayout.setVerticalGroup(
            inteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Interface");

        addVertex.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        addVertex.setText("Add Vertex");

        deleteVertex.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        deleteVertex.setText("Delete Vertex");

        addEdge.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        addEdge.setText("Add Edge");

        deleteEdge.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        deleteEdge.setText("Delete Edge");

        modifyVertex.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        modifyVertex.setText("Modify Vertex");

        modifyEdge.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        modifyEdge.setText("Modify Edge");

        searchC.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        searchC.setText("Search Coordinates");

        jButton1.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jButton1.setText("Path");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jButton2.setText("Original");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        f.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        f.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        t.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        t.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel3.setText("From");

        jLabel4.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel4.setText("To");

        animation.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        animation.setText("Animation");

        shape.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        shape.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Shape");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteVertex)
                                        .addComponent(addEdge)
                                        .addComponent(deleteEdge)
                                        .addComponent(modifyVertex)
                                        .addComponent(searchC)
                                        .addComponent(modifyEdge)
                                        .addComponent(animation)))
                                .addGap(0, 48, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(f, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(shape, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(inte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(modifyVertex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteEdge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifyEdge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(animation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static ArrayList<Coordinate> ver=new ArrayList<Coordinate>();
    
    public void run()
    {
        int size=poi.size();
        if(size>1 && animation.isSelected())
        {
            int i;
            
            while(true)
            {
                for(i=0;i<poi.size();i++)
                {
                    try
                    {
                        xcord=poi.get(i).getX();
                        ycord=poi.get(i).getY();
                    
                        repaint();
                        
                        sleep(5);

                        if(!animation.isSelected())
                            Thread.currentThread().interrupt();
                        
                    }
                    catch(Exception e)
                    {
                        poi.clear();
                        return;
                    }
                }
            }       
        }
    }
    
    int search(String name)
    {
        int i;
        
        for(i=0;i<list.size();i++)
        {
            if(list.get(i).getName().equals(name))
                return 0;
        }
        
        return 1;
    }
    
    
    private void inteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inteMouseClicked
        
        if(addVertex.isSelected())
        {
            double x=evt.getX();
            double y=evt.getY();

            //Coordinate var=new Coordinate();

            int i,flg=0;

            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                if((x-g.getX())*(x-g.getX()) + (y-g.getY())*(y-g.getY())<=400)
                {
                    flg=1;
                    break;
                }
            }

            if(flg==0)
            {
//               var.setX(x);
//               var.setY(y);
//               ver.add(var);

               while(true)
               {
                   String name=JOptionPane.showInputDialog("Enter the name of vertex");

                    if(search(name)==1)
                    {
                        Graph g=new Graph(name,x,y);
                        list.add(g);
                        break;     
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Name Already Added");
               }
               JOptionPane.showMessageDialog(null, x+" "+y);
               repaint(); 
            } 
        }
        else if(deleteVertex.isSelected())
        {
            double x=evt.getX();
            double y=evt.getY();
            
            int i;
            
            for(i=0;i<ver.size();i++)
            {
                Coordinate c=ver.get(i);
                
                if(c.getX()+18>=x && c.getX()-18<=x && c.getY()+18>=y && c.getY()-18<=y)
                    ver.remove(i);
            }
            
            Graph gr=new Graph(" ",0,0);
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if(g.getX()+18>=x && g.getX()-18<=x && g.getY()+18>=y && g.getY()-18<=y)
                {
                    JOptionPane.showMessageDialog(null, g.getName()+" is been deleted");
                    list.remove(i);
                    gr=g;
                }
            }
            
                hm.remove(gr.getName());

                Iterator it=hm.entrySet().iterator();

                while(it.hasNext())
                {
                    //displayHm();
                    Map.Entry mp = (Map.Entry)it.next(); 
                    //String s=(String)mp.getKey();
                    ArrayList<Graph> al=(ArrayList<Graph>)mp.getValue();
                    
                    for(i=0;i<al.size();i++)
                    {
                        if(al.get(i).getName().equals(gr.getName()))
                            al.remove(i);
                    }
                    
                }

                repaint();
            }
        else if(searchC.isSelected())
        {
            double x=evt.getX();
            double y=evt.getY();
            
            int i;
            
            Graph gr=new Graph(" ",0,0);
            
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if(g.getX()+18>=x && g.getX()-18<=x && g.getY()+18>=y && g.getY()-18<=y)
                {
                    JOptionPane.showMessageDialog(null, g.getName()+" "+g.getX()+" "+g.getY());
                    gr=g;
                }
            }
        }
        display();
        // TODO add your handling code here:
    }//GEN-LAST:event_inteMouseClicked
    
    int check(Graph g1, Graph g2)
    {
        if(hm.containsKey(g1.getName()))
        {
            ArrayList<Graph>al=hm.get(g1.getName());
            int i;
            
            for(i=0;i<al.size();i++)
            {
                if(g2.getName().equals(al.get(i).getName()))
                {
                    return 0;
                }
            }
            
            return 1;
        }
        else
            return 1;
    }
    private void inteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inteMouseDragged
        // TODO add your handling code here  
        if(addEdge.isSelected())
        {
           curX=(int)evt.getX();
           curY=(int)evt.getY();
            
        }
        else if(deleteEdge.isSelected())
        {
           curX=(int)evt.getX();
           curY=(int)evt.getY();
        }
        else if(modifyVertex.isSelected())
        {
           curX=(int)evt.getX();
           curY=(int)evt.getY();
        }
        else if(modifyEdge.isSelected())
        {
           curX=(int)evt.getX();
           curY=(int)evt.getY();
        }
    }//GEN-LAST:event_inteMouseDragged

    private void inteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inteMousePressed
        // TODO add your handling code here:
        
        if(addEdge.isSelected())
        {
            prevX=(int)evt.getX();
            prevY=(int)evt.getY();
        
            //drag=true;
        }
        else if(deleteEdge.isSelected())
        {
            prevX=(int)evt.getX();
            prevY=(int)evt.getY();
        }
        else if(modifyVertex.isSelected())
        {
            prevX=(int)evt.getX();
            prevY=(int)evt.getY();
        }
        else if(modifyEdge.isSelected())
        {
            prevX=(int)evt.getX();
            prevY=(int)evt.getY();
        }
        
    }//GEN-LAST:event_inteMousePressed
    
    void listPrint()
    {
        int i;
        
        for(i=0;i<list.size();i++)
        {
            Graph g=list.get(i);
            JOptionPane.showMessageDialog(null,g.getName()+" "+g.getX()+" "+g.getY());
        }
    }
    private void inteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inteMouseReleased
        // TODO add your handling code here:
        
        if(addEdge.isSelected())
        {
            //JOptionPane.showMessageDialog(null, curX+" "+curY);
            
            //drag=false;
            
            int i,flg1=0,flg2=0;
            double x1=0,y1=0,x2=0,y2=0;
            Graph g1=list.get(0),g2=list.get(0);
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((int)g.getX()+18>=prevX && (int)g.getX()-18<=prevX && (int)g.getY()+18>=prevY && (int)g.getY()-18<=prevY)
                {
                    //x1=g.getX();
                    //y1=g.getY();
                    flg1=1;
                    g1=g;
                    break;
                }
            }
            
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((int)g.getX()+18>=curX && (int)g.getX()-18<=curX && (int)g.getY()+18>=curY && (int) g.getY()-18<=curY)
                {
                    //x2=g.getX();
                    //y2=g.getY();
                    flg2=1;
                    g2=g;
                    break;
                }
            }
            
            if(flg1==1 && flg2==1)
            {
                
                int weight=Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));
                                
                int x=check(g1,g2);
                
                if(x==1)
                {
                   if(!hm.containsKey(g1.getName()))
                    {
                        ArrayList<Graph>al=new ArrayList<Graph>();
                        Graph g=new Graph(g2.getName(),g2.getX(),g2.getY());
                        g.setWeight(weight);
                        al.add(g);
                        hm.put(g1.getName(),al);
                    }
                    else
                    {
                        ArrayList<Graph>al=hm.get(g1.getName());
                        Graph g=new Graph(g2.getName(),g2.getX(),g2.getY());
                        g.setWeight(weight);
                        al.add(g);
                    }

//                    if(!hm.containsKey(g2.getName()))
//                    {
//                        ArrayList<Graph>al=new ArrayList<Graph>();
//                        Graph g=new Graph(g1.getName(),g1.getX(),g1.getY());
//                        g.setWeight(weight);
//                        al.add(g);
//                        hm.put(g2.getName(),al);
//                    }
//                    else
//                    {
//                        ArrayList<Graph>al=hm.get(g2.getName());
//                        Graph g=new Graph(g1.getName(),g1.getX(),g1.getY());
//                        g.setWeight(weight);
//                        al.add(g);
//                    }


                    initialize();
                }
                else
                    JOptionPane.showMessageDialog(null, "Edge Already Present");
                
                   
            }
            //else
                //JOptionPane.showMessageDialog(null, prevX+" "+prevY+" "+curX+" "+curY);
            
            //listPrint();
            repaint();   
        }
        else if(deleteEdge.isSelected())
        {
            int i,flg1=0,flg2=0;
            double x1=0,y1=0,x2=0,y2=0;
            Graph g1=list.get(0),g2=list.get(0);
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((int)g.getX()+18>=prevX && (int)g.getX()-18<=prevX && (int)g.getY()+18>=prevY && (int)g.getY()-18<=prevY)
                {
                    //x1=g.getX();
                    //y1=g.getY();
                    flg1=1;
                    g1=g;
                    break;
                }
            }
            
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((int)g.getX()+18>=curX && (int)g.getX()-18<=curX && (int)g.getY()+18>=curY && (int) g.getY()-18<=curY)
                {
                    //x2=g.getX();
                    //y2=g.getY();
                    flg2=1;
                    g2=g;
                    break;
                }
            }
            
            if(flg1==1 && flg2==1)
            {
                
                //int weight=Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));
                                
                int x=check(g1,g2);
                
                if(x==0)
                {
                    if(hm.containsKey(g1.getName()))
                    {
                        ArrayList<Graph>al=hm.get(g1.getName());
                        
                        for(i=0;i<al.size();i++)
                        {
                            if(al.get(i).getName().equals(g2.getName()) && (int)al.get(i).getX()==(int)g2.getX() && (int)al.get(i).getY()==(int)g2.getY())
                            {
                                al.remove(i);
                                break;
                            }
                        }
                    }
                    
//                    if(hm.containsKey(g2.getName()))
//                    {
//                        ArrayList<Graph>al=hm.get(g2.getName());
//                        
//                        for(i=0;i<al.size();i++)
//                        {
//                            if(al.get(i).getName().equals(g1.getName()) && (int)al.get(i).getX()==(int)g1.getX() && (int)al.get(i).getY()==(int)g1.getY())
//                            {
//                                al.remove(i);
//                                break;
//                            }
//                        }
//                    }
                   
                    initialize();
                }
                else
                    JOptionPane.showMessageDialog(null, "Edge Already Present");
                
                   
            }
           
            repaint();   
        }
        else if(modifyVertex.isSelected())
        {
            int flg=0,i,ind=0;
            Graph g1=list.get(0);
            
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((int)g.getX()+18>=prevX && (int)g.getX()-18<=prevX && (int)g.getY()+18>=prevY && (int)g.getY()-18<=prevY)
                {

                    flg=1;
                    g1=g;
                    ind=i;
                    break;
                }
            }
            int flg1=0;
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((curX-g.getX())*(curX-g.getX()) + (curY-g.getY())*(curY-g.getY())<=400)
                {

                    flg1=1;
                    break;
                }
            }
            
            if(flg==1 && flg1==0)
            {
                list.remove(ind);
                Graph g=new Graph(g1.getName(),curX,curY);
                list.add(ind,g);
                
                Iterator it=hm.entrySet().iterator();
                
                while(it.hasNext())
                {
                    Map.Entry mp=(Map.Entry)it.next();
                    ArrayList<Graph>al=(ArrayList<Graph>)mp.getValue();
                    
                    for(i=0;i<al.size();i++)
                    {
                        if(al.get(i).getName().equals(g1.getName()))
                        {
                            int weight=al.get(i).getWeight();
                            al.remove(i);
                            Graph gNew=new Graph(g1.getName(),curX,curY);
                            gNew.setWeight(weight);
                            al.add(i,gNew);
                        }
                    }
                }
            }
            else
            {
                if(flg1==1)
                    JOptionPane.showMessageDialog(null, "Vertex Cannot be added");
            }
            
            
            repaint(); 
        }
        else if(modifyEdge.isSelected())
        {
            int i,flg1=0,flg2=0;
            double x1=0,y1=0,x2=0,y2=0;
            Graph g1=list.get(0),g2=list.get(0);
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((int)g.getX()+18>=prevX && (int)g.getX()-18<=prevX && (int)g.getY()+18>=prevY && (int)g.getY()-18<=prevY)
                {
                   
                    flg1=1;
                    g1=g;
                    break;
                }
            }
            
            for(i=0;i<list.size();i++)
            {
                Graph g=list.get(i);
                
                if((int)g.getX()+18>=curX && (int)g.getX()-18<=curX && (int)g.getY()+18>=curY && (int) g.getY()-18<=curY)
                {
                    
                    flg2=1;
                    g2=g;
                    break;
                }
            }
            
            if(flg1==1 && flg2==1)
            {
                
                //int weight=Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));
                                
                int x=check(g1,g2);
                
                if(x==0)
                {
                    int weight=Integer.parseInt(JOptionPane.showInputDialog("Enter new weight"));
                    
                    if(hm.containsKey(g1.getName()))
                    {
                        ArrayList<Graph>al=hm.get(g1.getName());
                        
                        for(i=0;i<al.size();i++)
                        {
                            if(al.get(i).getName().equals(g2.getName()) && (int)al.get(i).getX()==(int)g2.getX() && (int)al.get(i).getY()==(int)g2.getY())
                            {
                                al.remove(i);
                                Graph g=new Graph(g2.getName(),g2.getX(),g2.getY());
                                g.setWeight(weight);
                                al.add(i,g);
                                break;
                            }
                        }
                    }
                    
//                    if(hm.containsKey(g2.getName()))
//                    {
//                        ArrayList<Graph>al=hm.get(g2.getName());
//                        
//                        for(i=0;i<al.size();i++)
//                        {
//                            if(al.get(i).getName().equals(g1.getName()) && (int)al.get(i).getX()==(int)g1.getX() && (int)al.get(i).getY()==(int)g1.getY())
//                            {
//                                al.remove(i);
//                                Graph g=new Graph(g1.getName(),g1.getX(),g1.getY());
//                                g.setWeight(weight);
//                                al.add(i,g);
//                                break;
//                            }
//                        }
//                    }
                    JOptionPane.showMessageDialog(null, "Weight Updated");
                    initialize();
                }
                else
                    JOptionPane.showMessageDialog(null, "Edge Already Present");
                
                   
            }
           
            repaint();   
        }
        
        display();
    }//GEN-LAST:event_inteMouseReleased
    
    static String from;
    static String to;
    static ArrayList<Graph>ali=new ArrayList<Graph>();
    static HashMap<Graph,Graph>gm=new HashMap<Graph,Graph>();
    static HashMap<Graph,Graph>gm1=new HashMap<Graph,Graph>();
    static ArrayList<Coordinate>poi=new ArrayList<Coordinate>();
    
    Graph searchGraph(String s)
    {
        int i;
        
        for(i=0;i<list.size();i++)
        {
            if(list.get(i).getName().equals(s))
                return list.get(i);
        }
        
        return new Graph(" ",0,0);
    }
    
    void gmPrint()
    {
        Iterator it=gm.entrySet().iterator();
        
        while(it.hasNext())
        {
            Map.Entry mp =(Map.Entry)it.next();
            Graph g1,g2;
            g1=(Graph)mp.getKey();
            g2=(Graph)mp.getValue();
            
            JOptionPane.showMessageDialog(null, g1.getName()+" "+g2.getName());
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //new Path().setVisible(true);
        result();
        
        from=(String)f.getSelectedItem();
        to=(String)t.getSelectedItem();
        
        int i;
        
        String start=from;
        String end=to;

        int[] dist;
        dist=new int[list.size()+1];
        int[] set;
        set=new int[list.size()+1];
        int[] parent;
        parent=new int[list.size()+1];
        int j;
        for(j=0;j<=list.size();j++)
        {
            dist[j]=Integer.MAX_VALUE;
            set[j]=0;
            parent[j]=-1;
        }
        
        int key=ind.get(start);
        
        dist[key]=0;
        parent[key]=-1;
        //displayInd();
        
        ShortestPath.dijkstra(list.size()+1,dist,parent,set);
        //JOptionPane.showMessageDialog(null, "Successfully Processed");
        
        int flg=0;
        int key1=ind.get(end);

        while(parent[key1]!=-1)
            key1=parent[key1];

        if(key1==key)
            flg=1;
        //String str="";
        if(flg==1)
        { 
            key1=ind.get(end);
            ArrayList<String>path=new ArrayList<String>();
            while(parent[key1]!=-1)
            {
                String var=revInd.get(key1);
                path.add(var);
                key1=parent[key1];
            }
            
            path.add(start);
            
            
            for(j=path.size()-1;j>=0;j--)
            {
                Graph g=searchGraph(path.get(j));
                ali.add(g);
            }
            
            key1=ind.get(end);
            int cost=dist[key1];
            
            for(i=0;i<ali.size()-1;i++)
            {
                gm.put(ali.get(i),ali.get(i+1));
                gm1.put(ali.get(i+1), ali.get(i));
            }
            repaint();
            //gmPrint();
            JOptionPane.showMessageDialog(null, "Cost: "+cost);
            
//            for(i=0;i<ali.size();i++)
//                JOptionPane.showMessageDialog(null, ali.get(i).getName());
            
            for(i=0;i<ali.size()-1;i++)
            {
                Graph g1=ali.get(i);
                Graph g2=ali.get(i+1);
                
                int dist1=(int)Math.sqrt(Math.pow(g1.getX()-g2.getX(),2)+Math.pow(g1.getY()-g2.getY(),2));
                
                for(j=0;j<=dist1;j++)
                {
                    int xcoord=(int)(j*g2.getX()+(dist1-j)*g1.getX())/(dist1);
                    int ycoord=(int)(j*g2.getY()+(dist1-j)*g1.getY())/(dist1);
                    
                    Coordinate c= new Coordinate(xcoord,ycoord);
                    
                    poi.add(c);
                }
                    
            }
            
            if(poi.size()>1 && animation.isSelected())
            {
                tr=new Thread(this);
                tr.start();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Path doesn't exists");
        }

                //JOptionPane.showMessageDialog(null, i);
          
          display();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ali.clear();
        gm.clear();
        gm1.clear();
        repaint();
        display();
        Thread.currentThread().interrupt();
        poi.clear();
    }//GEN-LAST:event_jButton2ActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interact().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton addEdge;
    private javax.swing.JRadioButton addVertex;
    private javax.swing.JRadioButton animation;
    private javax.swing.JRadioButton deleteEdge;
    private javax.swing.JRadioButton deleteVertex;
    private javax.swing.JComboBox<String> f;
    private javax.swing.JPanel inte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton modifyEdge;
    private javax.swing.JRadioButton modifyVertex;
    private javax.swing.JRadioButton searchC;
    public static javax.swing.JComboBox<String> shape;
    private javax.swing.JComboBox<String> t;
    // End of variables declaration//GEN-END:variables
}
