package com.company;

public class Ripoux extends Sherif implements HorsLaLoi{

    private String etat;
    private int nbDameEnlevees;
    private int miseAPrix;

    public Ripoux(String nom){
        super(nom);
        etat = "libre";
        nbDameEnlevees = 0;
        miseAPrix = 200;
    }

    public void seFaireEmprisonnerParUnCowboy(Cowboy cowboy){
        etat = "en prison";
        parler("Damned, je suis fait ! "+cowboy.quelEstTonNom()+", tu m’as eu !");
    }

    public void kidnappe(Dame dame){
        dame.seFaireKidnapper(this);
        nbDameEnlevees++;
        parler("Ah ah ! "+dame.quelEstTonNom()+", tu es mienne désormais");
    }

    public int getMiseAPrix(){
        return miseAPrix;
    }

    @Override
    public void presente(){
        super.presente();
        if(nbDameEnlevees>0){
            parler("(J'ai kidnappé "+nbDameEnlevees+" dames !)");
        }
        parler("(Ma tête est mise à prix à "+miseAPrix+"$ !)");
    }
}
