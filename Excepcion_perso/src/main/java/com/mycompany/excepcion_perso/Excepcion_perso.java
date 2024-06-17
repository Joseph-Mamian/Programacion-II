
package com.mycompany.excepcion_perso;

public class Excepcion_perso {

    public static void main(String[] args) {
        String user,pass,repass;
        
        user = "Ete serch";
        pass = "1";
        repass = "1";
        
        Helper h = new Helper();
        
        try{
        
          h.validarPassword(pass, repass);
        }catch(CustomException e){
            System.out.println("No se puede regitrar al usuario porque " + e.getMessage());
        } 
        
        
        
    }
}
