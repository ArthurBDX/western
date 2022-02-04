package com.company;

public class Brigand extends Humain implements HorsLaLoi, VisagePale{

    private String look = "méchant";
    private int nbDameEnlevees;
    private int miseAPrix;
    private String etat; // "libre" ou "en prison"

    public Brigand(String nom){
        super(nom,"tord-boyaux");
        this.nbDameEnlevees = 0;
        this.miseAPrix = 100;
        this.etat = "libre";
    }

    public void kidnappe(Dame dame){
        dame.seFaireKidnapper(this);
        nbDameEnlevees++;
        parler("Ah ah ! "+dame.quelEstTonNom()+", tu es mienne désormais");
    }

    public int getMiseAPrix(){
        return miseAPrix;
    }

    public void seFaireEmprisonnerParUnCowboy(Cowboy cowboy){
        etat = "en prison";
        parler("Damned, je suis fait ! "+cowboy.quelEstTonNom()+", tu m’as eu !");
    }

    @Override
    public String quelEstTonNom(){
        return super.quelEstTonNom()+" le "+look;
    }

    @Override
    public void presente(){
        super.presente();
        if(nbDameEnlevees>0){
            parler("J'ai l'air "+look+" et j'ai déjà kidnappé "+nbDameEnlevees+" dames !");
        }
        parler("Ma tête est mise à prix à "+miseAPrix+"$ !");
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}
