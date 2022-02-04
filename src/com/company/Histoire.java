package com.company;

public class Histoire {

    public static void main(String[] args) {

        Humain arthur = new Humain("arthur");
        arthur.presente();
        arthur.boire();
        //System.out.println(arthur.quelEstTonNom());
        //System.out.println(arthur.getBoisson());

        System.out.println("");
        Cowboy personne = new Cowboy("Personne");
        Dame lydia = new Dame("Lydia");
        Brigand brynjolf = new Brigand("Brynjolf");

        System.out.println("");
        personne.presente();
        lydia.presente();
        brynjolf.presente();

        System.out.println("");
        lydia.changerRobe("jaune");

        brynjolf.kidnappe(lydia);

        personne.tirer(brynjolf);
        personne.exclamer();

        personne.libérerDame(lydia);

        brynjolf.seFaireEmprisonnerParUnCowboy(personne);
        //System.out.println("mise à prix : "+brynjolf.getMiseAPrix()+"$");

        System.out.println("");
        personne.presente();
        lydia.presente();
        brynjolf.presente();

        System.out.println("");
        Barman agil = new Barman("Agil", "Dicey club");
        agil.presente();
        agil.servir(personne);

        System.out.println("");
        Sherif luke = new Sherif("Luke");
        luke.presente();
        luke.chercher(brynjolf);
        luke.coffrer(brynjolf);

        System.out.println("");
        Cowboy Clint = new Sherif("Clint");
        Clint.presente();
        //Clint.coffrer(brynjolf); //impossible coffrer() appartient à la classe Cowboy

        System.out.println("");
        Ripoux heathcliff = new Ripoux("Heathcliff");
        heathcliff.tirer(brynjolf);
        heathcliff.presente();
        personne.tirer(heathcliff);

        System.out.println("");
        FemmeBrigand jane = new FemmeBrigand("Jane");
        jane.presente();
        jane.changerRobe("noire");
        luke.coffrer(jane);

        System.out.println("");
        Indien pigeon = new Indien("Pigeon fâché");
        pigeon.presente();
        pigeon.scalper(jane);


    }
}
