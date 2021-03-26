package com.company;

public class InvitadoMeli extends Invitado{

    public InvitadoMeli(String nombre) {
        super(nombre);
    }

    @Override
    public void comerPorcion() {
        System.out.println("Invitado Meli " + this.getNombre() + " comiendo porcion");
        System.out.println("VIVA LA CHIQUI");
    }
}
