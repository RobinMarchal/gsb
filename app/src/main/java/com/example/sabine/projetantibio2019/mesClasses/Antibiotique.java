package com.example.sabine.projetantibio2019.mesClasses;

public abstract class Antibiotique {
    private String libelle;
    private String libelleG;
    private String unite;
    private int nombreParJour;
    private Categorie laCategorie;
    public Antibiotique(String pLibelle, String pUnite,Categorie pCategorie, int pNombreParJour, String plibelleG)    {
        this.libelle = pLibelle;
        this.unite = pUnite;
        this.nombreParJour = pNombreParJour;
        this.laCategorie = pCategorie;
        this.libelleG = plibelleG;
    }
    public String getLibelle()    {
        return this.libelle;
    }
    public String getUnite()    {
        return this.unite;
    }
    public int getNombreParJour() {
        return this.nombreParJour;
    }
    public Categorie getCategorie()    {

        return this.laCategorie;
    }
}
