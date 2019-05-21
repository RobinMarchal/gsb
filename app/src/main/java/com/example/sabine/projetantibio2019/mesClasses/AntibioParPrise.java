package com.example.sabine.projetantibio2019.mesClasses;

public class AntibioParPrise extends Antibiotique{
    private double dosePrise;
    private int nombreParJour;
    public AntibioParPrise(String pLibelle,  String pUnite, Categorie pCategorie, double pDosePrise, int pNombreParJour, String plibelleG)    {
        super(pLibelle, pUnite, pCategorie, pNombreParJour, plibelleG );
        this.dosePrise = pDosePrise;
    }
    public double getDosePrise()    {
        return this.dosePrise;
    }

    public int getNombre(){
        return this.nombreParJour;
    }
}
