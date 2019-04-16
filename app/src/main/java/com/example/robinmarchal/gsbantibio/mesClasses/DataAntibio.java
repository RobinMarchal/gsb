package com.example.robinmarchal.gsbantibio.mesClasses;


import java.util.ArrayList;
import java.util.HashMap;
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
        unAntibioParKilo = new AntibioParKilo("Amiklin","AmiKacine","mg",uneCategorie1,15,10);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Garamycine","Gentamicine", "mg",uneCategorie1,6,10);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Netromycine","Netilmicine", "mg",uneCategorie1,6,10);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Obracine","Tobramycine", "mg",uneCategorie1,6,10);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Fungizon","Amphotérine", "mg",uneCategorie2,10,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Diflucan","Fluconazole", "mg",uneCategorie2,4,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Sporanox","Itraconazole", "mg",uneCategorie2,6,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Vtend","Voriconazole", "mg",uneCategorie2,6,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Zovirax i.v","Aciclovir", "mg",uneCategorie3,10,3);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Zovirax","Aciclovir p.o", "mg",uneCategorie3,5,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Valtrex","Valaciclovir", "mg",uneCategorie3,3,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Invanz ","Ertapénem", "g",uneCategorie4,10,1);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Tienam","Imipénem", "mg",uneCategorie4,4,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Meronem","Méropénem", "g",uneCategorie4,3,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Ceclor","Céfaclor", "mg",uneCategorie5,4,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Kefzol ","Céfazoline ", "g",uneCategorie5,1,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Maxipime ","Céfépime ", "g",uneCategorie5,5,3);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Céphoral ","Céféxime ", "mg",uneCategorie5,200,7);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Claforan ","Céfotaxime", "g",uneCategorie5,6,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Podomexef ","Celpodoxime ", "mg",uneCategorie5,1,1);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Fortam ","Ceftazidime", "g",uneCategorie5,7,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Zinacef ","Cefuroxime ", "g",uneCategorie5,2,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Klacid","Clarithromycine ", "mg",uneCategorie6,3,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Erythrocin","Erythromycine ", "mg",uneCategorie6,2,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Clamoxyl ","Amoxilline", "mg",uneCategorie7,3,200);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Augmentin ","Amoxilline/clavulanate ", "mg",uneCategorie7,2,200);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Pénicilline G ","Benzylpénicilline", "millions d'UI",uneCategorie7,3,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Tazobac","Pipéracilline/tazobactam", "g",uneCategorie7,2,4);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Ciproxine","Ciprofloxacine ", "mg",uneCategorie8,3,500);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Tavanic","Lévofloxacine", "mg",uneCategorie8,2,500);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Noroxin","Norfloxacine ", "mg",uneCategorie8,3,400);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Tarivid ","Ofloxacine ", "mg",uneCategorie8,2,300);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Bactrim i.v","Sulfaméthoxazole i.v ", "mg/kg",uneCategorie9,3,5);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Bactrim p.0","Sulfaméthoxazole p.o ", "mg",uneCategorie9,2,300);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Azactam ","Aztréonam", "g",uneCategorie10,3,2);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Flagyl","Métronidazole", "mg",uneCategorie1,2,500);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Furadantime","Nitrofurantoïne", "mg",uneCategorie10,3,75);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Targocid","Teicoplanine", "mg/kg",uneCategorie10,2,6);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
        unAntibioParKilo = new AntibioParKilo("Vancocine","Vancomycine ", "g",uneCategorie10,2,1);
        DataAntibio.lesAntibiotiques.add(unAntibioParKilo);
    }

    static public List<Categorie> getLesCategories()
    {
        return DataAntibio.lesCategories;
    }

    static public List<Antibiotique> getAntibiotiquesUneCateg(Categorie c) {
        List<Antibiotique> lesAntibiotiques = new ArrayList<>();
        for (Antibiotique a : DataAntibio.lesAntibiotiques)
        {
            if (a.getCategorie().equals(c))
            {
                lesAntibiotiques.add(a);
            }
        }
            return lesAntibiotiques;
    }

    static public double getMoyNombreParJour(Categorie c) {
        List<Antibiotique> lesAntibiotiques = new ArrayList<>();
        double total = 0;
        int size = lesAntibiotiques.size();

        for (Antibiotique a : DataAntibio.lesAntibiotiques)
        {
            if (a.getCategorie().equals(c))
            {
                total += getMoyNombreParJour(c);
            }
        }

        double moyenne = total / size;

        return moyenne;
    }


}
