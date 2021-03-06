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
// Java program to construct an expression tree 

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Stack; 

// Java program for expression tree 
class Noder { 

	String value; 
        int num;
	Noder left, right; 

	Noder(String item,int num) { 
		this.num =num;
                value = item; 
		left = right = null; 
	} 
} 

class tree { 

String concatenar="",con="";
	// A utility function to check if 'c' 
	// is an operator 

	boolean isUno(String c) { 
		if (c.equals("+")  || c.equals("?")|| c.equals("*") ) { 
			return true; 
		} 
		return false; 
	} 
        boolean isDoris(String c) { 
		if (c.equals("|") || c.equals(".")) { 
			return true; 
		} 
		return false; 
	} 

	// Utility function to do inorder traversal 
	
	// Returns root of constructed tree for given 
	// postfix expression 
	Noder constructTree( ArrayList<String> list) { 
		Stack<Noder> st = new Stack(); 
		Noder t, t1, t2,op1,op2; 

		//de reversa mami
               
		for (int i = list.size()-1; i >=0 ; i--) { 

			// If operand, simply push into stack 
                       
			if (isUno(list.get(i))) { 
				t = new Noder(list.get(i),i); 
                                op1 = st.peek(); st.pop(); 
                                t.left=op1; 
				st.push(t); 
                                
			} else if(isDoris(list.get(i))){
                                t = new Noder(list.get(i),i); 
                                op1 = st.peek(); st.pop(); 
                                op2 = st.peek(); st.pop(); 
                                t.left=op1;
                                t.right=op2;
                                       
				st.push(t);
                                
                        }else{
                           
                                t = new Noder(list.get(i),i);                               
				
				st.push(t); 
                            
				
			} 
		} 

		// only element will be root of expression 
		// tree 
		t = st.peek(); 
		st.pop(); 

		return t; 
	} 
        public void preOrder(Noder root) {
            
        if (root != null) {
            if (root.left!=null) {
              
                con+=root.num+" -> "+root.left.num+";\n";
            }
            if (root.right!=null) {
                con+= root.num+"->"+root.right.num+";\n";
            }
            preOrder(root.left);
            // System.out.printf("%d ", root.value);            
            concatenar+=root.num+"[label= \" "+root.value.replace("\"", "")+"\"];\n";
            
            preOrder(root.right);
        }
    }
    public void ImprimirArbolin(Noder root){
       
        preOrder(root);
        String conexion="";
        int estado=0;
        
          try {
            String ruta = "Avl.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("digraph g {");
            bw.write(concatenar);
            bw.write(con);
            bw.write("}");          
           
            bw.close();
            try {
    // Execute a command without arguments
                    String command = "dot -Tjpg Avl.txt -o AVL.jpg";
                     Process child = Runtime.getRuntime().exec(command);
                     child = Runtime.getRuntime().exec(command);
                } catch (Exception e) {
                }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

} 

// This code has been contributed by Mayank Jaiswal 
