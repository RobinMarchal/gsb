package com.example.robinmarchal.gsbantibio.mesClasses;

public class AntibioParKilo extends Antibiotique
{
    private double doseKilo;

    public AntibioParKilo(String pLibelle, String pLibelleG, String pUnite, Categorie pCategorie,int pNombre, double pDoseKilo)
    {
        super(pLibelle, pLibelleG, pUnite, pCategorie, pNombre);
        this.doseKilo = pDoseKilo;
    }
    public double getDoseKilo()
    {
        return this.doseKilo;
    }
}