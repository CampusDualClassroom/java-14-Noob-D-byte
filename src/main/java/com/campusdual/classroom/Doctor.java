package com.campusdual.classroom;

public class Doctor extends Person {

    protected String specialization;

    public Doctor(String name, String surname, String specialization) {
        super(name, surname);
        this.specialization = specialization;
    }

    @Override//Genero mediante o click dereito este metodo, e imprimo por pantalla a mensaxe para cada clase.
    //neste caso specialization para Doctor
    public void getDetails() {
        System.out.println("Este doctor chámase " + name + " " + surname + " e dedicase a " + specialization);
    }
}
