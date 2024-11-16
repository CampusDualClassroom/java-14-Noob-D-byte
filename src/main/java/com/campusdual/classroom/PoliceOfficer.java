package com.campusdual.classroom;

public class PoliceOfficer extends Person {

    protected String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    @Override
    public void getDetails() {//Genero mediante o click dereito este metodo, e imprimo por pantalla a mensaxe para cada clase.
        //neste caso squad para o PoliceOfficer
        System.out.println("Este polisia chámase " + name + " " + surname + " e a sua dilixencia é " + squad);
    }
}
