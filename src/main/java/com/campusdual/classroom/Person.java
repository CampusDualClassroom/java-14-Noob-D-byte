package com.campusdual.classroom;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void getDetails() { //creo un metodo en ela chamado getDetails()
        // que muestre por pantalla información da persona instanciada en cada objeto.
        System.out.println("Esta persoa chámase " + name + " " + surname);
    }
}

