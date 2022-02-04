package com.company;

public class Humain{
    private String nom;
    private String boisson;

    protected Humain(String nom, String boisson) {
        this.nom = nom;
        this.boisson = boisson;
    }

    public Humain(String nom) {
        this.nom = nom;
        this.boisson = "eau";
    }

    public void parler(String texte){
        System.out.println("("+nom+") - "+texte);
    }

    public void presente(){

        if ("aeiou".contains(boisson.substring(0,1))){
            parler("Bonjour, "+quelEstTonNom()+", ma boisson favorite est l'"+boisson);
        }
        else{
            parler("Bonjour, "+quelEstTonNom()+", ma boisson favorite est le "+boisson);
        }
    }

    public void boire(){
        if ("aeiou".contains(boisson.substring(0,1))){
            parler("Ah ! un bon verre d'"+boisson+" ! GLOUPS !");
        }
        else{
            parler("Ah ! un bon verre de "+boisson+" ! GLOUPS !");
        }
    }

    public String quelEstTonNom(){
        return nom;
    }

    public String getBoisson(){
        return boisson;
    }

}