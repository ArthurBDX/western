package com.company;

public class Indien extends Humain{

    private int nbPlumes;
    private String totem;

    public Indien(String nom){
        super(nom,"jus de racine");
        totem = "Coyote";
    }


    public void scalper(VisagePale visagePale){
        visagePale.scalp();
    }


    @Override
    public void parler(String texte){
        System.out.println("("+super.quelEstTonNom()+") - "+texte+" Ugh !");;
    }

    @Override
    public void presente(){
        super.presente();
        parler("J'ai "+nbPlumes+" plumes.");
    }
}
