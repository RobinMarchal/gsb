package com.example.sabine.projetantibio2019.mesClasses;

import java.util.ArrayList;
import java.util.List;

public class DataAntibio {
    static private List<Antibiotique> lesAntibiotiques;
    static private List<Categorie> lesCategories;

    static public void initialiser()    {
        DataAntibio.lesCategories = new ArrayList<Categorie>();
        Categorie uneCategorie1 = new Categorie("Aminoglycosides");
        DataAntibio.lesCategories.add(uneCategorie1);
        Categorie uneCategorie2 = new Categorie("AntiFongiques");
        DataAntibio.lesCategories.add(uneCategorie2);
        Categorie uneCategorie3 = new Categorie("Antiviraux");
        DataAntibio.lesCategories.add(uneCategorie3);
        Categorie uneCategorie4 = new Categorie("Carbapénèmes");
        DataAntibio.lesCategories.add(uneCategorie4);
        Categorie uneCategorie5 = new Categorie("Céphalosporines");
        DataAntibio.lesCategories.add(uneCategorie5);
        Categorie uneCategorie6 = new Categorie("Macrolides");
        DataAntibio.lesCategories.add(uneCategorie6);
        Categorie uneCategorie7 = new Categorie("Pénicillines");
        DataAntibio.lesCategories.add(uneCategorie7);
        Categorie uneCategorie8 = new Categorie("Quinolones");
        DataAntibio.lesCategories.add(uneCategorie8);
        Categorie uneCategorie9 = new Categorie("Sulfamidés");
        DataAntibio.lesCategories.add(uneCategorie9);
        Categorie uneCategorie10 = new Categorie("Autres");
        DataAntibio.lesCategories.add(uneCategorie10);

        DataAntibio.lesAntibiotiques = new ArrayList<Antibiotique>();
        AntibioParKilo unAntibioParKilo;
        AntibioParPrise unAntibioParPrise;
        unAntibioParKilo = new AntibioParKilo("Amiklin","mg",uneCategorie1,15,1,"AmiKacine");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Garamycine","mg", uneCategorie1, 6,1,"Gentamicine");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Netromycine","mg",uneCategorie1, 6,1,"Netilmicine");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Obracine","mg", uneCategorie1, 6,1,"Tobramycine");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Fungizon","mg", uneCategorie2,0.7,1,"Amphotérine B");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParPrise = new AntibioParPrise("Diflucan","mg", uneCategorie2,300,1,"Fluconazole");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Sporanox", "mg",uneCategorie2,200, 1 ,"Itraconazole");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParKilo = new AntibioParKilo("Vtend","mg", uneCategorie2, 5,2,"Voriconazole");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Zovirax i.v", "mg",uneCategorie3,7,3 ,"Aciclovir");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParPrise = new AntibioParPrise("Zovirax", "mg",uneCategorie3,200,3, "Aciclovir p.o");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Valtrex", "mg",uneCategorie3,700,2, "Valaciclovir");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Invanz ", "g",uneCategorie4,1,1,"Ertapénem");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Tienam", "mg", uneCategorie4,0.75,4, "Imipénem");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Meronem", "g",uneCategorie4,1,3, "Méropénem");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Ceclor", "mg",uneCategorie5,400,3, "Céfaclor");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Kefzol", "g",uneCategorie5,1.5,3, "Céfazoline");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Maxipime ", "g",uneCategorie5,2,2,"Céfépime ");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Céphoral ", "mg",uneCategorie5,200,2,"Céféxime ");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Claforan ", "g",uneCategorie5,1.5,3,"Céfotaxime");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Podomexef ", "mg",uneCategorie5,200,2,"Celpodoxime ");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Fortam ","g", uneCategorie5,1.5,2, "Ceftazidime");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Zinacef ","g", uneCategorie5,1.2,3, "Cefuroxime" );
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Klacid","mg", uneCategorie6,500,2, "Clarithromycine ");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Erythrocin","mg", uneCategorie6,400,3, "Erythromycine");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Clamoxyl ","mg", uneCategorie7,500,3, "Amoxilline");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Augmentin ","mg", uneCategorie7,300,3,"Amoxilline/clavulanate" );
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Pénicilline G ","milions d'UI",uneCategorie7,2,4,"Benzylpénicilline");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Tazobac","g", uneCategorie7,4.5,3,"Pipéracilline/tazobactam");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Ciproxine","mg", uneCategorie8,500,2,"Ciprofloxacine");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Tavanic","mg", uneCategorie8,500,1,"Lévofloxacine");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Noroxin","mg", uneCategorie8,400,2,"Norfloxacine ");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Tarivid ","mg", uneCategorie8,300,2, "Ofloxacine ");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParKilo = new AntibioParKilo("Bactrim i.v","mg", uneCategorie9,5,3,"Sulfaméthoxazole i.v ");
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParPrise = new AntibioParPrise("Bactrim p.0","mg", uneCategorie9,500,2,"Sulfaméthoxazole p.o ");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
        unAntibioParPrise = new AntibioParPrise("Azactam ","g", uneCategorie10,1.5,3,"Aztréonam");
        DataAntibio.lesAntibiotiques.add(unAntibioParPrise);
    }
    static public List<Categorie> getLesCategories()    {
        return DataAntibio.lesCategories;
    }
    static public List<Antibiotique> getAntibiotiquesUneCateg(String c) {
        List<Antibiotique> lesAntibiotiquesParCateg = new ArrayList<Antibiotique>();

        for (Antibiotique a : lesAntibiotiques)
        {
            if (a.getCategorie().getLibelle() == c)
            {
                lesAntibiotiquesParCateg.add(a);
            }
        }

        return lesAntibiotiquesParCateg;
    }

    static public boolean isInstanceAntiBioPasKilo(String antibio)
    {
        boolean ret = false;
        for (Antibiotique a : lesAntibiotiques)
        {
            if (a.getLibelle() == antibio)
            {
                if (a instanceof AntibioParKilo)
                {
                    ret = true;
                }
            }
        }
        return ret;
    }

    static public double recupDoseParKilo(String antibio)
    {
        double ret = 0;
        for (Antibiotique a : lesAntibiotiques)
        {
            if (a.getLibelle() == antibio)
            {
                if (a instanceof AntibioParKilo)
                {
                    ret = ((AntibioParKilo) a).getDoseKilo();
                }
            }
        }
        return ret;
    }

    static public double recupPrise(String antibio)
    {
        double ret = 0;
        for (Antibiotique a : lesAntibiotiques)
        {
            if (a.getLibelle() == antibio)
            {
                if (a instanceof AntibioParPrise)
                {
                    ret = ((AntibioParPrise) a).getDosePrise();
                }
            }
        }
        return ret;
    }

    static public int recupNombreParJour(String antibio)
    {
        int ret = 0;
        for (Antibiotique a : lesAntibiotiques)
        {
            if (a.getLibelle() == antibio)
            {
                if (a instanceof AntibioParPrise)
                {
                    ret = ((AntibioParPrise) a).getNombre();
                }
            }
        }
        return ret;
    }


static public double getMaxDoseKilo(String unite){
    double ret = 0;
    for(Antibiotique a : lesAntibiotiques){
        if (a.getLibelle()==unite){
            if (a instanceof AntibioParKilo){
                ret = ((AntibioParKilo)a).getDoseKilo();
            }
        }
    }
    return ret;
}

}