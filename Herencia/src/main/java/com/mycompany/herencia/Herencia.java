
package com.mycompany.herencia;

public class Herencia {

    public static void main(String[] args) {
        Worker empleado = new Worker (12,"repartidor",12.0,"juan","Perez","1234","kdx 365-345", "3134756786");
        empleado.getNum();
        empleado.getName();
        
        System.out.println("Nombre del empleado: " + empleado.getName() + " su numero de telefono es " + empleado.getPhoneNumber());
    }
}
