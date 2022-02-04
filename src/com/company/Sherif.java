package com.company;

public class Sherif extends Cowboy{

    private int nbBrigandCoffre;

    public Sherif(String nom){
        super(nom, "honnête");
        nbBrigandCoffre = 0;
    }

    public void chercher(HorsLaLoi horsLaLoi){
        parler("OYEZ OYEZ BRAVE GENS !! "+horsLaLoi.getMiseAPrix()+" $ a qui arrêtera "+horsLaLoi.quelEstTonNom()+", mort ou vif !!");
    }

    public void coffrer(HorsLaLoi horsLaLoi){
        nbBrigandCoffre++;
        parler("Au nom de la loi, je vous arrête "+horsLaLoi.quelEstTonNom()+" !");
        horsLaLoi.seFaireEmprisonnerParUnCowboy(this);
    }

    @Override
    public String quelEstTonNom(){
        return "Shérif "+super.quelEstTonNom();
    }


}
