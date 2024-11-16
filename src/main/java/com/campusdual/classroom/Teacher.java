package com.campusdual.classroom;

public class Teacher extends Person {

    protected String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }

    @Override
    public void getDetails() {//Genero mediante o click dereito este metodo, e imprimo por pantalla a mensaxe para cada clase.
        //neste caso area para o Teacher
        System.out.println("Esta persoa chámase " + name + " " + surname + " e dedicase a " + area);

    }
}
