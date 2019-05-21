package com.example.sabine.projetantibio2019.mesClasses;

public class AntibioParKilo extends Antibiotique{
    private double doseKilo;
    public AntibioParKilo(String pLibelle,  String pUnite, Categorie pCategorie, double pDoseKilo, int pNombreParJour, String plibelleG)    {
        super(pLibelle, pUnite, pCategorie, pNombreParJour, plibelleG );
        this.doseKilo = pDoseKilo;
    }
    public double getDoseKilo()    {
        return this.doseKilo;
    }
}
