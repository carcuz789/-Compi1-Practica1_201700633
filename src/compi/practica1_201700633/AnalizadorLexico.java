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
public  class AnalizadorLexico {
  
    public static  void Analizar(String cadena){
        char[] carac = cadena.toCharArray();
        int contador=0;
        String conca="";
        int i = 0;
        do {   
            if (Character.isWhitespace(carac[i])) {
                i++;
            }else if (Character.isDigit(carac[i])) {
                boolean salir = true;
                do {
                    if (Character.isDigit(carac[i])) {
                        conca+=carac[i];
                        i++;
                    }else{
                        salir=false;
                    }
                    
                } while (salir == true);
                 contador++;
                Token(conca,1,contador);
                conca="";
               
                
            }  else  if (Character.isLetter(carac[i])) {
                boolean salir = true;
                do {                    
                    if (Character.isLetter(carac[i])) {
                        conca+=carac[i];
                        i++;
                    }else if (Character.isDigit(carac[i])) {
                        conca+= carac[i];
                        i++;
                    }else{
                        salir=false;
                    }                    
                } while (salir!=false); 
                contador++;
                Token(conca,2,contador);
                conca="";
            }else  if ((int)carac[i]>=33 && (int)carac[i]<=126) {
               
                boolean var = true;
                do {
                      
                if ((int)carac[i]>=33 && (int)carac[i]<48) {
                    if ((int)carac[i]== 45) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,4,contador);
                         conca="";
                       
                    }else if ((int)carac[i]==46) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,5,contador);
                         conca="";
                        
                    }else if((int)carac[i]==47){
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,6,contador);
                         conca="";
                       
                    }else if ((int)carac[i]==37) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,7,contador);
                         conca="";
                         
                    }else if ((int)carac[i]==34) {
                        boolean sal=true;
                        do {
                            conca+=carac[i];
                            i++;
                            if ((int)carac[i]==34) {
                                sal=false;
                                conca+=carac[i];
                                i++;
                            }
                            
                        } while (sal==true);
                         contador++;
                         Token(conca,8,contador);
                        conca="";
                      
                    }else if ((int)carac[i]==33) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,9,contador);
                         conca="";
                        
                    }else{
                         contador++;
                         conca+=carac[i];
                         i++;
                         Token(conca,10,contador);
                         conca="";
                         
                    }
                    
                   
                }else if ((int)carac[i]>= 48 && (int)carac[i]< 57) {
                    
                    var=false;
                       
                }else if ((int)carac[i]>=58 && (int)carac[i]<65) {
                    
                    if ((int)carac[i]==62) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,11,contador);
                         conca="";
                        
                    }else if((int)carac[i]==63){
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,12,contador);
                         conca="";
                        
                    }else if((int)carac[i]==60){
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,13,contador);
                         conca="";
                        
                    }else if((int)carac[i]==58){
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,14,contador);
                         conca="";
                        
                    }else if((int)carac[i]==59){
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,15,contador);
                         conca="";
                        
                    }else{
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,16,contador);
                         conca="";
                         
                    }
                    
                }else if ((int)carac[i]>=65 && (int)carac[i]<90) {
                    
                    var = false;
                      
                }else if ((int)carac[i]>90 && (int) carac[i]<97 ) {
                    
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,17,contador);
                         conca="";
                     
                    
                }else if ((int)carac[i]>=97 && (int)carac[i]<122) {
                       
                      var=false;
                    
                }else if ((int)carac[i]>=123 && (int)carac[i]<=126) {
                      
                    if ((int)carac[i]==123) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,18,contador);
                         conca="";
                       
                    }else if ((int)carac[i]==125) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,19,contador);
                         conca="";
                        
                    }else if ((int)carac[i]==124) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,20,contador);
                         conca="";
                         
                    }else if ((int)carac[i]==126) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,21,contador);
                         conca="";
                         
                    }
                     
                }else{
                    
                      var=false;
                }
                if (i>carac.length) {
                        break;
                    }
                } while (var==true);
              
            }else if ((int)carac[i]==42) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,22,contador);
                         conca="";
                      
            }else if ((int)carac[i]==43) {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,23,contador);
                         conca="";
                         
            }else  {
                         conca+=carac[i];
                         i++;
                          contador++;
                         Token(conca,24,contador);
                         conca="";
                         
            }
        } while (i<carac.length);
        
    }
    public  static void Token(String conca,int id,int numero){
         Principal.ListaGen.push(numero, conca, id);
         
    }
}
