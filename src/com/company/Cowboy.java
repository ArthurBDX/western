package com.company;

public class Cowboy extends Humain implements VisagePale {

    private int popularite;
    private String adjectif;

    public Cowboy(String nom){
        super(nom,"whisky");
        this.popularite = 0;
        this.adjectif = "vaillant";
    }

    public Cowboy(String nom, String adjectif){
        super(nom,"whisky");
        this.popularite = 0;
        this.adjectif = adjectif;
    }

    public void exclamer(){
        parler("Prends ça, rascal !");
    }

    public void libérerDame(Dame dame){
        popularite++;
        parler("Vous êtes libre "+dame.quelEstTonNom());
        dame.seFaireLiberer(this);
    }

    public void tirer(HorsLaLoi horsLaLoi){
        System.out.println("le "+adjectif+" "+this.quelEstTonNom()+" tire sur "+horsLaLoi.quelEstTonNom()+". PAN !");
    }

    @Override
    public void presente(){
        super.presente();
        parler("Les gens me disent "+adjectif);
        if(popularite>0){
            parler("J'ai sauvé "+popularite+" dames");
        }
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}
