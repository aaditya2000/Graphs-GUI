/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import javax.swing.JOptionPane;
import static mainclass.MainClass.*;
import java.util.*;
/**
 *
 * @author aadityagadhave
 */

//class Invalid extends Exception
//{
//    Invalid(String s)
//    {
//        super(s);
//    }
//}

public class ModifyVertex extends javax.swing.JFrame {

    /**
     * Creates new form ModifyVertex
     */
    public ModifyVertex() {
        initComponents();
        
        String[] str = new String[list.size()];
        
        int i;
        
        for(i=0;i<list.size();i++)
        {
            str[i]=list.get(i).getName();
        }
        
        name.setModel(new javax.swing.DefaultComboBoxModel<>(str));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        nameVertex = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nameNewVertex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameNewX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameNewY = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JComboBox<>();

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("New Vertex Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Modify Vertex");

        jLabel2.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vertex Name");

        jLabel3.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New X-Coordinate");

        jLabel4.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New Y-Coordinate");

        jButton1.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, 0, 231, Short.MAX_VALUE)
                                    .addComponent(nameNewY, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameNewX)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(1, 1, 1)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameNewX, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameNewY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    boolean search(String s)
    {
        int i,ind=-1;
        
        for(i=0;i<list.size();i++)
        {
            Graph g=list.get(i);
            
            if(g.getName().equals(s))
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
            return false;
         
        
        return true;
    }
    
    void modify(String name, String newX, String newY)
    {
        int i,ind=-1;
        
        for(i=0;i<list.size();i++)
        {
            Graph g=list.get(i);
            
            if(g.getName().equals(name))
            {
                ind=i;
                break;
            }
        }
       
        Graph g=list.get(ind);
//        list.remove(ind);
//        list.add(g);
        //g.setName(newName);
        g.setX(Double.parseDouble(newX));
        g.setY(Double.parseDouble(newY));
    }
    
    void modifyEdge(String name, String newX, String newY)
    {
        Iterator it=hm.entrySet().iterator();
        
        while(it.hasNext()) 
        { 
            Map.Entry mp = (Map.Entry)it.next(); 
            ArrayList<Graph> al=(ArrayList<Graph>)mp.getValue();
           
            int i;
            
            for(i=0;i<al.size();i++)
            {
                Graph g=al.get(i);
                
                if(g.getName().equals(name))
                {
                    g.setX(Double.parseDouble(newX));
                    g.setY(Double.parseDouble(newY));
                }
            }
        } 
    }
    void validateVertex() throws Invalid
    {
        if(list.get(name.getSelectedIndex()).getName().isEmpty() || nameNewX.getText().isEmpty() || nameNewY.getText().isEmpty())
            throw new Invalid("Enter all the fields");
        
        try
       {
           double d1=Double.parseDouble(nameNewX.getText());
           double d2=Double.parseDouble(nameNewY.getText());
       }
       catch(Exception e){
           throw new Invalid("No String accepted");
       }
       
    }
    
    boolean search(double x, double y)
    {
        int i;
        
        for(i=0;i<list.size();i++)
        {
            Graph g=list.get(i);
                        
            if((g.getX()-x)*(g.getX()-x)+(g.getY()-y)*(g.getY()-y)<=400)
                return true;
        }
        
        return false;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        
        try
        {    
            this.validateVertex();
            int ind = name.getSelectedIndex();
            String name = list.get(ind).getName();
            //String newName = nameNewVertex.getText();
            String newX = nameNewX.getText();
            String newY = nameNewY.getText();
            
            boolean b=search(name);
            //boolean b1=search(newName);
            
            if(b==false)
            {   
                if(b==false)
                    JOptionPane.showMessageDialog(null, "Vertex Not Present");
//                else
//                    JOptionPane.showMessageDialog(null, "Vertex Name is same");
            }
            else
            {   
                
                boolean c=search(Double.parseDouble(newX),Double.parseDouble(newY));
                
                if(!c)
                {
                   JOptionPane.showMessageDialog(null, "Successfully Modified");
                   modify(name,newX,newY);
                
                   modifyEdge(name,newX,newY); 
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Vertex already present");
                }
                
                //JOptionPane.showMessageDialog(null, "Successfully Modified"); 
            }
        }
        catch(Invalid e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyVertex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyVertex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> name;
    private javax.swing.JTextField nameNewVertex;
    private javax.swing.JTextField nameNewX;
    private javax.swing.JTextField nameNewY;
    private javax.swing.JTextField nameVertex;
    // End of variables declaration//GEN-END:variables
}
