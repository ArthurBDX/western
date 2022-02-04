package com.company;

public class Barman extends Humain{

    private String nomBar;

    public Barman(String nom){
        super(nom, "vin");
        nomBar = "Chez "+nom;
    }

    public Barman(String nom, String nomBar){
        super(nom, "vin");
        this.nomBar = nomBar;
    }

    public void servir(Humain humain){
        System.out.println(this.quelEstTonNom()+" sert un verre de "+humain.getBoisson()+" à "+humain.quelEstTonNom());
    }

    @Override
    public void parler(String texte){
        System.out.println("("+super.quelEstTonNom()+") - "+texte+" Coco");;
    }

    @Override
    public void presente(){
        super.presente();
        parler("Bien venue au bar \""+this.nomBar+"\"");
    }
}
