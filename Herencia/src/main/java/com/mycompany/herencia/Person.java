
package com.mycompany.herencia;

public class Person {
    String name;
    String lastName;
    String id;
    String direction;
    String phoneNumber;

    public Person(String name, String lastName, String id, String direction, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
