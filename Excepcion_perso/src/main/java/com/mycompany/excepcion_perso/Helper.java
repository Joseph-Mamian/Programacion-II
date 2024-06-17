
package com.mycompany.excepcion_perso;

public class Helper {

    public Helper() {
    
    }
    
    public void validarPassword(String pass, String repass) throws CustomException{
    
    if(!pass.equals(repass)){
    
        throw new CustomException("Las contraseñas no coinciden");
    }
        
    if (pass.length()< 8 ){
       
        throw new CustomException("La contraseña debe tener mas de 8 caracteres");
    }
    
    }
    
}
