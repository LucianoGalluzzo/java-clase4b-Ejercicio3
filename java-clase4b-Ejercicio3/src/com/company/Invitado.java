package com.company;

public abstract class Invitado {

    private String nombre;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void comerPorcion();
}
