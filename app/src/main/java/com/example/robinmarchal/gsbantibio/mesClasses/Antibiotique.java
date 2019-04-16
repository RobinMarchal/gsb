package com.example.robinmarchal.gsbantibio.mesClasses;

public abstract class Antibiotique
{
    private String libelle;
    private String libelleG;
    private String unite;
    private Categorie laCategorie;
    private int nombreParJour;

    public Antibiotique(String pLibelle, String pLibelleG, String pUnite,Categorie pCategorie,int pNombre)
    {
        this.libelle = pLibelle;
        this.libelleG = pLibelleG;
        this.unite = pUnite;
        this.laCategorie = pCategorie;
        this.nombreParJour = pNombre;
    }
    public String getLibelle()
    {
        return this.libelle;
    }
    public String getLibelleG()
    {
        return this.libelleG;
    }
    public String getUnite()
    {
        return this.unite;
    }
    public Categorie getCategorie()
    {
        return this.laCategorie;
    }
    public int getNombreParJour()
    {
        return this.nombreParJour;
    }
}
