
package com.mycompany.excepciones;

public class Excepciones {

    public static void main(String[] args) {
        
        try{
        int total = 3/0;
        }
        catch (Exception e){ //excepcion generica//
            System.out.println("No se puede dividir entre 0");
        }
        
        int edades []={12,54,13,65};
        try{
        System.out.println("La edad de la poscicion 4 es " + edades[4]);
        }
        catch(Exception e){
            System.out.println("Ingrese una poscicion valida");
        }
    }
}
