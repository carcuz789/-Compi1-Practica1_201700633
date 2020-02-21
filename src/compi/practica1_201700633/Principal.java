package compi.practica1_201700633;


import compi.practica1_201700633.AnalizadorLexico;
import compi.practica1_201700633.DLL;
import java.awt.Image;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo
 */
public class Principal extends javax.swing.JFrame {
String cadena="";
public static DLL ListaGen= new DLL();
public static ListaConjuntos ListaConjuntos = new ListaConjuntos();
public static ListaEntradas ListaEntradas = new ListaEntradas();
public static ListaExpresiones ListaExpresiones = new ListaExpresiones();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAbrir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnguardarcomo = new javax.swing.JButton();
        btnXml = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        btnGenAutomata = new javax.swing.JButton();
        btnAnalizarEntrada = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAbrir.setText("Abrir");
        BtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");

        btnguardarcomo.setText("Guardar Como");

        btnXml.setText("XML");

        jLabel1.setText("Archivo de entrada");

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        btnGenAutomata.setText("Generar Automata");
        btnGenAutomata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenAutomataActionPerformed(evt);
            }
        });

        btnAnalizarEntrada.setText("Analizar Entrada");
        btnAnalizarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarEntradaActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Componentes");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenAutomata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAnalizarEntrada))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnAbrir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnguardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnguardarcomo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnXml))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAbrir)
                            .addComponent(btnguardar)
                            .addComponent(btnguardarcomo)
                            .addComponent(btnXml))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenAutomata)
                    .addComponent(btnAnalizarEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenAutomataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenAutomataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenAutomataActionPerformed

    private void BtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirActionPerformed
        // TODO add your handling code here:
        String aux="";   
        String   texto="";
         try  {
               /**llamamos el metodo que permite cargar la ventana*/
              JFileChooser file=new JFileChooser();
              file.showOpenDialog(this);
              /**abrimos el archivo seleccionado*/
              File abre=file.getSelectedFile(); 
                if(abre!=null)  {     
                  FileReader archivos=new FileReader(abre);
                  BufferedReader lee=new BufferedReader(archivos);
                  while((aux=lee.readLine())!=null)
                     {
                        texto+= aux+"\n";
                     }
                  lee.close();
                    }     
                }  catch(IOException ex)   {
                  JOptionPane.showMessageDialog(null,ex+ "\nNo se ha encontrado el archivo",   "ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
                           }
         this.txtEntrada.setText(texto);
         this.cadena = texto;
                
    }//GEN-LAST:event_BtnAbrirActionPerformed

    private void btnAnalizarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarEntradaActionPerformed
        // TODO add your handling code here:
        //mandamos al analisis lexico
        try{
            AnalizadorLexico.Analizar(cadena);
            JOptionPane.showMessageDialog(null, "Analisis lexico exitoso");
            Principal.ListaGen.printlist(Principal.ListaGen.head);
            ListaGen.MandarAliststas(ListaGen.head);
             System.out.println("T---------n"); 
            this.lis(ListaExpresiones.head);
            for (int i = 0; i < 10; i++) {
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no se realizo el analisis lexico");
        }
        
        
        
    }//GEN-LAST:event_btnAnalizarEntradaActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        // TODO add your handling code here:
        try{
         DefaultMutableTreeNode node = (DefaultMutableTreeNode)
        this.jTree1.getLastSelectedPathComponent();
        node=(DefaultMutableTreeNode) this.jTree1.getLastSelectedPathComponent();
        String seleccion =  node.getUserObject().toString();
        JOptionPane.showMessageDialog(null, seleccion);
         ArrayList<String> listamandar = RetornarLisArb(ListaExpresiones.head, seleccion);
         tree et = new tree();                
	Noder root = et.constructTree(listamandar); 		
        et.ImprimirArbolin(root);
        ImageIcon arbl =new ImageIcon("/home/rodrigo/NetBeansProjects/[Compi]Practica1_201700633/AVL.jpg");
        ImageIcon ico =new ImageIcon(arbl.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        this.jLabel2.setIcon(ico);
        
        }catch(Exception ex){}
       
    }//GEN-LAST:event_jTree1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAbrir;
    private javax.swing.JButton btnAnalizarEntrada;
    private javax.swing.JButton btnGenAutomata;
    private javax.swing.JButton btnXml;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarcomo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextArea txtEntrada;
    // End of variables declaration//GEN-END:variables
//private TreePath getTreePath(TreeNode node) {
//    DefaultTreeModel model = (DefaultTreeModel) this.jTree1.getModel();
//    TreeNode[] nodes = model.getPathToRoot(node); 
//    TreePath path = new TreePath(nodes); 
//    return path; 
//} 
 public void lis(ListaExpresiones.NodExp node) 
    { 
        
        ListaExpresiones.NodExp last = null; 
        System.out.println("Traversal in forward Direction"); 
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) jTree1.getModel().getRoot();
           DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Arboles");
        while (node != null) { 
            System.out.print(node.x + " --- "+node.texto+" ---- "+node.tipo+"\n"); 
            
            DefaultMutableTreeNode newnode = new DefaultMutableTreeNode(node.texto);
            c1.add(newnode);
           
            last = node; 
            node = node.next; 
        } 
        root.add(c1);
         DefaultTreeModel model = (DefaultTreeModel) this.jTree1.getModel();
            model.reload();
//        System.out.println(); 
//        System.out.println("Traversal in reverse direction"); 
//        while (last != null) { 
//            System.out.print(last.nombredir + " "+node.usuario+" ->"); 
//            last = last.prev; 
//        } 
    } 
 public  ArrayList<String>  RetornarLisArb(ListaExpresiones.NodExp node,String nod) 
    { 
        
        ListaExpresiones.NodExp last = null; 
      boolean entcontrado = false;
       ArrayList<String> lista=null;
        while (node != null) { 
            if (nod.equals(node.texto)) {
                entcontrado =true;
                lista = node.carac;
            }           
          
           
            last = node; 
            node = node.next; 
        }
        if (entcontrado==true) {
            return lista;
        }else{
            return null;
        }
//        System.out.println(); 
//        System.out.println("Traversal in reverse direction"); 
//        while (last != null) { 
//            System.out.print(last.nombredir + " "+node.usuario+" ->"); 
//            last = last.prev; 
     
    } 
}
