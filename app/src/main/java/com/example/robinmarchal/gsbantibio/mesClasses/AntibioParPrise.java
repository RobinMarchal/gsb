package com.example.robinmarchal.gsbantibio.mesClasses;

public class AntibioParPrise extends Antibiotique
{
    private double dosePrise;
    private int nombreParJour;

    public AntibioParPrise(String pLibelle, String pLibelleG, String pUnite, Categorie pCategorie, double pDosePrise,int pNombre)
    {
        super(pLibelle, pLibelleG, pUnite, pCategorie, pNombre);
        this.dosePrise = pDosePrise;
    }
    public double getDosePrise()
    {
        return this.dosePrise;
    }
}