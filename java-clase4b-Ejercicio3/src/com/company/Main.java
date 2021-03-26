package com.company;

public class Main {

    public static void main(String[] args) {

        Evento e = new Evento();
        e.agregarFuegoArtificial("Cañita voladora");
        e.agregarFuegoArtificial("Cien tiros");
        e.agregarFuegoArtificial("Cebolla");
        e.agregarInvitadoMeli("Galperin");
        e.agregarInvitadoStandard("Gomez");
        e.agregarInvitadoStandard("Lopez");
        e.agregarInvitadoMeli("Rabinovich");
        e.explotarFuegosArtificiales();
        e.distribuirPorciones();
    }
}
