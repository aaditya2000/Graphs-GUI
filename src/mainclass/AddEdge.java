package mainclass;

import javax.swing.JOptionPane;
import static mainclass.MainClass.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aadityagadhave
 */
public class AddEdge extends javax.swing.JFrame {

    /**
     * Creates new form AddEdge
     */
    public AddEdge() {
        initComponents();
        
        String[] str = new String[list.size()];
        
        int i;
        
        for(i=0;i<list.size();i++)
        {
            str[i]=list.get(i).getName();
        }
        
        from.setModel(new javax.swing.DefaultComboBoxModel<>(str));
        
        for(i=0;i<list.size();i++)
        {
            str[i]=list.get(i).getName();
        }
        
        to.setModel(new javax.swing.DefaultComboBoxModel<>(str));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        from = new javax.swing.JComboBox<>();
        to = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Edge");

        jLabel2.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("From Vertex Name");

        jLabel3.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("To Vertex Name");

        from.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        to.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Apple Braille", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Weight");

        weight.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N

        jButton1.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jButton1.setText("Add Edge");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(to, javax.swing.GroupLayout.Alignment.LEADING, 0, 241, Short.MAX_VALUE)
                            .addComponent(from, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weight)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(to)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void validateEdge() throws Invalid
    {
        if(weight.getText().isEmpty())
            throw new Invalid("Fill all the fields");
        
       try
       {
           int d1=Integer.parseInt(weight.getText());   
       }
       catch(Exception e){
           throw new Invalid("No String accepted");
       }
       
       if(from.getSelectedIndex()==to.getSelectedIndex())
           throw new Invalid("No same vertices allowed");
    }
    
    Graph searchTo(String s)
    {
        int i;
        
        for(i=0;i<list.size();i++)
        {
            Graph g=list.get(i);
            
            if(g.getName().equals(s))
                return g;
        }
        
        Graph g =new Graph(" ",0,0);
        
        return g;
    }
    void createEdge(String from ,String to, int w)
    {
        if(!hm.containsKey(from))
        {
            ArrayList<Graph>al = new ArrayList<Graph>();
            
            Graph g=searchTo(to);
            Graph g1=new Graph(g.getName(),g.getX(),g.getY());
            g1.setWeight(w);
            al.add(g1);
            
            hm.put(from, al);
        }
        else
        {
            ArrayList<Graph>al = hm.get(from);
            
            Graph g=searchTo(to);
            Graph g1=new Graph(g.getName(),g.getX(),g.getY());
            g1.setWeight(w);
            al.add(g1);
            
            hm.put(from, al);
        }
        
//        if(!hm.containsKey(to))
//        {
//            ArrayList<Graph>al = new ArrayList<Graph>();
//            
//            Graph g=searchTo(from);
//            Graph g1=new Graph(g.getName(),g.getX(),g.getY());
//            g1.setWeight(w);
//            al.add(g1);
//            
//            hm.put(to, al);
//        }
//        else
//        {
//            ArrayList<Graph>al = hm.get(to);
//            
//            Graph g=searchTo(from);
//            Graph g1=new Graph(g.getName(),g.getX(),g.getY());
//            g1.setWeight(w);
//            al.add(g1);
//            
//            hm.put(to, al);
//        }
        
    }
    
    boolean searchEdge(String from ,String to)
    {
        if(hm.containsKey(from))
        {
            ArrayList<Graph>al=hm.get(from);
            
            int i;
            
            for(i=0;i<al.size();i++)
            {
                Graph g=al.get(i);
                
                if(g.getName().equals(to))
                    return true;
            }
            
            return false;
        }
        
        return false;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            validateEdge();
            int index1=from.getSelectedIndex();
            int index2=to.getSelectedIndex();
            int w=Integer.parseInt(weight.getText());
            String from=list.get(index1).getName();
            String to=list.get(index2).getName();
             
            if(!searchEdge(from,to))
            {
                JOptionPane.showMessageDialog(null,"Successfully Added");
                createEdge(from,to,w);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Edge Already Present");
                
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
            java.util.logging.Logger.getLogger(AddEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEdge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEdge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> from;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> to;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
