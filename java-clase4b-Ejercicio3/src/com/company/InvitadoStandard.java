package com.company;

public class InvitadoStandard extends Invitado{

    public InvitadoStandard(String nombre) {
        super(nombre);
    }

    @Override
    public void comerPorcion() {
        System.out.println("Invitado Standard " + this.getNombre() + " comiendo porcion");
    }
}
