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
public class AnalizadorLexico {
  
    public static void Analizar(String cadena){
        char[] carac = cadena.toCharArray();
        String conca="";
        int i = 0;
        do {   
            if (Character.isWhitespace(carac[i])) {
                i++;
            }
            if (Character.isDigit(carac[i])) {
                boolean salir = true;
                do {
                    if (Character.isDigit(carac[i])) {
                        conca+=carac[i];
                        i++;
                    }else{
                        salir=false;
                    }
                    
                } while (salir == true);
                Token(conca,1);
                conca="";
                
            }  
         
            if (Character.isLetter(carac[i])) {
                boolean salir = true;
                do {                    
                    if (Character.isLetter(i)) {
                        conca+=carac[i];
                        i++;
                    }else if (Character.isDigit(i)) {
                        conca+= carac[i];
                        i++;
                    }else{
                        salir=false;
                    }                    
                } while (salir =true);                
            }
            if ((int)carac[i]>=32 || (int)carac[i]<=125) {
                
            }
        } while (i<=carac.length);
        
    }
    public static void Token(String conca,int numero){
        switch(numero){
            case 1:
                
                break;
        }
    }
}
