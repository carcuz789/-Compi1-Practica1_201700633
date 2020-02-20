/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi.practica1_201700633;

/**
 *
 * @author rodrigo
 */

import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Rodrigo Carcuz
 */
public class DLL { 
    Node head; // head of list 
 
  
    /* Doubly Linked list Node*/
    class Node { 
        
    public Integer x;    
    public String texto; 
    public int tipo;
    

        Node prev; 
        Node next; 
  
        // Constructor to create a new node 
        // next and prev is by default initialized as null 
        Node(int x,String texto ,int tipo){
        this.x = x;
        this.texto=texto;        
        this.tipo = tipo;
       
        }
    } 
  
    // Adding a node at the front of the list 
//    public void push(int x,String tex,int tipo)    { 
//        /* 1. allocate node  
//        * 2. put in the data */
//        Node new_Node = new Node(x,tex,tipo); 
//  
//        /* 3. Make next of new node as head and previous as NULL */
//        new_Node.next = head; 
//        new_Node.prev = null; 
//  
//        /* 4. change prev of head node to new node */
//        if (head != null) 
//            head.prev = new_Node; 
//  
//        /* 5. move the head to point to the new node */
//        head = new_Node; 
//    } 
//  
    /* Given a node as prev_node, insert a new node after the given node */
   
  
    // Add a node at the end of the list 
    void append(int x,String tex,int tipo) 
    { 
        /* 1. allocate node  
        * 2. put in the data */
        Node new_node = new Node(x,tex,tipo); 
        Node last = head; /* used in step 5*/
  
        /* 3. This new node is going to be the last node, so 
        * make next of it as NULL*/
        new_node.next = null; 
  
        /* 4. If the Linked List is empty, then make the new 
        * node as head */
        if (head == null) { 
            new_node.prev = null; 
            head = new_node; 
            return; 
        } 
  
        /* 5. Else traverse till the last node */
        while (last.next != null) 
            last = last.next; 
  
        /* 6. Change the next of last node */
        last.next = new_node; 
  
        /* 7. Make last node as previous of new node */
        new_node.prev = last; 
    } 
//  
    // This function prints contents of linked list starting from the given node 
    public void MandarAliststas(Node node) 
    { 
        Node last = null; 
        Node sig = null;
        Node ids = null; 
        String conca = "";
        
        while (node != null) { 
            System.out.print(node.x + " --- "+node.texto+" ---- "+node.tipo+"\n"); 
            if (node.texto.toLowerCase().trim().equals("conj")) {
                sig = node.next;
                sig = sig.next;
                ids=sig;
                ids = ids.next;
                ids = ids.next;
                do {
                    conca+=ids.texto;
                    ids = ids.next;
                } while (!ids.texto.equals(";"));             
                Principal.ListaConjuntos.push(0, sig.texto,conca);
                 conca = "";
                 last = node; 
                 node = ids.next; 
                
            }else if (node.texto.equals("-")) {
                last= node.prev;
                sig =node.next;
                
                if (sig.texto.equals(">")) {
                    sig =sig.next;
                    if (sig.tipo ==8) {
                         last= sig.prev;
                         sig =sig.next;
                         Principal.ListaEntradas.push(0, last.texto, sig.texto);
                        last = node; 
                        node = sig.next; 
                    }else{
                         
                        ids = sig;
                    do {
                         conca+=ids.texto;
                         ids = ids.next;
                    } while (!ids.texto.equals(";"));
                    
                   
                     Principal.ListaExpresiones.push(0,last.texto,conca);
                        conca = "";
                        last = node; 
                      node = ids.next; 
                    }
                    
                     
                    
                }
            }else{
                  last = node; 
                  node = node.next; 
            }
            
           
        } 

    } 
    public void printlist(Node node) 
    { 
        Node last = null; 
        Node sig = null;
        System.out.println("Traversal in forward Direction"); 
        while (node != null) { 
            System.out.print(node.x + " --- "+node.texto+" ---- "+node.tipo+"\n"); 
            if (node.texto.toLowerCase().equals("conj")) {
                sig = node.next;
                sig = sig.next;
            }            
            last = node; 
            node = node.next; 
        } 

    } 
//    public  boolean Existe(Node node,String usuario,String nombrearch){
//         Node last = null;
//         int estado=0;
//          while (node != null) { 
//              if (node.usuario.equals(usuario)) {
//                  if (node.nombredir.equals(nombrearch)) {
//                      estado=1;
//                  }
//              }
//            last = node; 
//            node = node.next; 
//        }
//          if (estado==0) {
//            return false;
//        }else{
//              return true;
//          }
//    }
    
//    public Node RetornaNodo(Node node,String usuario,String nombreCarpeta){
//        Node last = null;
//         int estado=0;
//         Node aux=null;
//          while (node != null) { 
//     
//              if (node.usuario.equals(usuario)) {
//                  if (node.nombredir.equals(nombreCarpeta)) {
//                      estado=1;
//                      aux=node;
//                  }
//              }
//            last = node; 
//            node = node.next; 
//        }
//          return aux;
//    }
//    public String Contenido(Node node,String usuario,String nombrearch){
//         Node last = null;
//         int estado=0;
//         String contenido="";
//          while (node != null) { 
//     
//              if (node.usuario.equals(usuario)) {
//                  if (node.nombredir.equals(nombrearch)) {
//                      estado=1;
//                      contenido=node.tipo;
//                  }
//              }
//            last = node; 
//            node = node.next; 
//        }
//          if (estado==0) {
//            return "false";
//        }else{
//              return contenido;
//          }
//    }
//    public Node RetornarNodos(Node node,int numero){
//         Node last = null;
//         int estado=0;
//         String conca="";
//          while (node != null) { 
//     
//              if (node.x.equals(numero)) {
//                  if (node.tipo.equals("C")) {
//                      estado=1; 
//                      if (!node.nombredir.equals("\\")) {
//                       
//                           conca+=node.nombredir+"[label=\" "+node.rutay+"\\\\"+node.nombredir+"\"];\n";
//                        
//                      }
//                      
//                  }
//              }
//            last = node; 
//            node = node.next; 
//        }
//          if (estado==0) {
//            return null;
//        }else{
//              return node ;
//          }
//    }
//    public String RetornarConexionNodoscony(Node node,String usuario,String rutay){
//         Node last = null;
//          String lista[]  = new String[100];
//          int numero=0;
//         int estado=0;
//         String conca="";
//         if (rutay.equals("\\")) {
//            conca+="y ->";
//        }else{
//             conca+="y"+rutay+"->";
//         }
//         
//          while (node != null) { 
//     
//              if (node.usuario.equals(usuario)) {
//                  if (node.tipo.equals("C")) {
//                       
//                      if (!node.nombredir.equals("\\")) {                        
//  
//                     // conca+="x"+node.nombredir+"->"+node.nombredir+"[constraint=false];\n";
//                          if (node.rutay.equals(rutay)) {
//                              estado=1;
//                              lista[numero]=node.nombredir;
//                              numero++;
//                             // conca+=node.nombredir+"->";
//                           }                     
//                         
//                      }
//                      
//                  }
//              }
//            last = node; 
//            node = node.next; 
//        }
//          if (estado==0) {
//            return "false";
//        }else{
//              for (int i = lista.length-1; i >=0 ; i--) {
//                  if (lista[i]!=null) {
//                      conca+=lista[i]+"->";
//                  }
//              }
//              return conca ;
//          }
//    }
//     public void modificarCAR(Node node,String usuario,String nombrearch,String modificacion){
//         Node last = null;
//         int estado=0;
//          while (node != null) { 
//              if (node.usuario.equals(usuario)) {
//                  if (node.nombredir.equals(nombrearch)) {
//                      node.nombredir=modificacion;
//                      estado=1;                      
//                  }
//                  if (node.rutay.equals(nombrearch)) {
//                      node.rutay=modificacion;
//                  }
//                  if (node.rutax.equals(nombrearch)) {
//                      node.rutax=modificacion;
//                  }
//              }
//            last = node; 
//            node = node.next; 
//        }
//          if (estado!=1) {
//             JOptionPane.showMessageDialog(null," MODIFICAION ERRONEA " );
//         }else{
//               JOptionPane.showMessageDialog(null," MODIFICACION EXITOSA " );
//          }
//        
//    }
//     public  void descargar(Node node,String usuario,String nombrearch) throws IOException{
//         Node last = null;
//         int estado=0;
//          while (node != null) { 
//              if (node.usuario.equals(usuario)) {
//                  if (node.nombredir.equals(nombrearch)) {
//                      estado=1;
//                      //AQUI CREO EL ARCHIVO
//                       String ruta = node.nombredir;
//                       File archivo = new File(ruta);
//                       BufferedWriter bw;
//                       if(archivo.exists()) {
//                                   bw = new BufferedWriter(new FileWriter(archivo));
//                                   bw.write(node.tipo);
//                           } else {
//                                      bw = new BufferedWriter(new FileWriter(archivo));
//                                       bw.write(node.tipo);
//                            }
//                        bw.close();
//                  }
//              }
//            last = node; 
//            node = node.next; 
//        }
//          if (estado==0) {
//            JOptionPane.showMessageDialog(null," DESCARGA ERRONEA ARCHIVO  NOT FOUND" );
//        }else{
//              JOptionPane.showMessageDialog(null,"DESCARGA EXITOSA " );
//          }
//    }
}
  
