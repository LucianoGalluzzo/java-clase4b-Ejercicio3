package com.company;

import jdk.jfr.Event;

import java.util.ArrayList;

public class Evento {

    private ArrayList<Invitado> listaDeInvitados;
    private ArrayList<FuegoArtificial> listaDeFuegosArtificiales;

    public Evento(){
        listaDeInvitados = new ArrayList<>();
        listaDeFuegosArtificiales = new ArrayList<>();
    }
    public void apagarVelas(){
        explotarFuegosArtificiales();
        distribuirPorciones();
    }

    public void explotarFuegosArtificiales(){
        for(int i=0; i<listaDeFuegosArtificiales.size(); i++){
            System.out.println("Explotando fuego artificial " + listaDeFuegosArtificiales.get(i).getNombre());
        }
    }

    public void distribuirPorciones(){
        for(int i=0; i<listaDeInvitados.size(); i++){
            listaDeInvitados.get(i).comerPorcion();
        }
    }

    public void agregarInvitadoMeli(String nombre){
        Invitado i = new InvitadoMeli(nombre);
        listaDeInvitados.add(i);
    }
    public void agregarInvitadoStandard(String nombre){
        Invitado i = new InvitadoStandard(nombre);
        listaDeInvitados.add(i);
    }
    public void agregarFuegoArtificial(String nombre){
        FuegoArtificial f = new FuegoArtificial(nombre);
        listaDeFuegosArtificiales.add(f);
    }
}
