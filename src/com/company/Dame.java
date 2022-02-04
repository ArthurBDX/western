package com.company;

public class Dame extends Humain implements VisagePale{

    private String couleur;
    private String etat; // "libre" ou "captive"

    public Dame(String nom){
        super(nom,"lait");
        this.etat = "libre";
        this.couleur = "rouge";
    }

    public void seFaireKidnapper(HorsLaLoi horsLaLoi){
        etat = "captive";
        parler("AH ! je me suis faite capturée !");
    }

    public void seFaireLiberer(Cowboy cowboy){
        etat = "libre";
        parler("Merci "+cowboy.quelEstTonNom());
    }

    public void changerRobe(String couleur){
        this.couleur = couleur;
        parler("Regardez ma nouvelle robe "+this.couleur);
    }

    @Override
    public String quelEstTonNom(){
        return "Miss "+super.quelEstTonNom();
    }

    @Override
    public void presente(){
        super.presente();
        parler("J'adore ma robe "+couleur);
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}
