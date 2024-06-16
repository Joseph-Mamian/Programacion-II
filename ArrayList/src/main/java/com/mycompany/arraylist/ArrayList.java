
package com.mycompany.arraylist;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        
        List<Person> lista = new ArrayList<Person> ();
        lista.add(new Person ("Juan",2,54));
        lista.add(new Person ("Pepe",2,54));
        lista.add(new Person ("Daniel",2,54));
        lista.add(new Person ("Juana",2,54));
        
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getName() );
        }
    }
}
