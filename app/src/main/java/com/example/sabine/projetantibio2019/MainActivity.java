package com.example.sabine.projetantibio2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sabine.projetantibio2019.mesClasses.Categorie;
import com.example.sabine.projetantibio2019.mesClasses.DataAntibio;
import com.example.sabine.projetantibio2019.mesClasses.Antibiotique;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String Antibiotique;
    ListView lstCategorie;
    ListView lstAntibiotique;
    TextView leText;
    TextView nomAntibio;
    TextView doseAntibio;
    TextView resultCalc;
    EditText entrerKilo;
    Button lancerCalc;
    Button retAntibio;
    Button leButton;
    List<Categorie> lesCategories;
    ArrayList<Categorie> lesCategs;
    List<Antibiotique> lesAntibiotiques;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstCategorie = (ListView) findViewById(R.id.lstAntibio);
        lstAntibiotique = (ListView) findViewById(R.id.lstAntibiotique);
        leText = (TextView) findViewById(R.id.titre);
        nomAntibio = (TextView) findViewById(R.id.nomAntibio);
        doseAntibio = (TextView) findViewById(R.id.doseAntibio);
        resultCalc = (TextView) findViewById(R.id.resultatCalcul);
        leButton = (Button) findViewById(R.id.btnRetour);
        lancerCalc = (Button) findViewById(R.id.calculer);
        retAntibio = (Button) findViewById(R.id.retourAntibio);
        entrerKilo = (EditText) findViewById(R.id.nbKilo);
        DataAntibio.initialiser();
        Main_menu();
    }
    public void Main_menu()
    {

        lesCategories = DataAntibio.getLesCategories();

// alimentation de la ListView
        ArrayList<String> categ = new ArrayList<String>();
        for(Categorie c : lesCategories){
            categ.add(c.getLibelle().toUpperCase());
        }

        //Adaptateur pour faire le lien entre la list du programme et la liste de l'interface
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, categ);
        lstCategorie.setAdapter(adapter);

//selection d'un antibiotique
        lstCategorie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String categorie = lesCategories.get(position).getLibelle();
                leText.setText("Sélectionner un antibiotique :");
                leButton.setVisibility(view.VISIBLE);
                lstAntibiotique.setVisibility(view.VISIBLE);
                lstCategorie.setVisibility(view.GONE);
                lesAntibiotiques = DataAntibio.getAntibiotiquesUneCateg(categorie);
                ArrayList<String> antibios = new ArrayList();
                for (Antibiotique a : lesAntibiotiques) {
                    antibios.add(a.getLibelle().toUpperCase());
                }
                ArrayAdapter<String> adapter =
                        new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, antibios);
                lstAntibiotique.setAdapter(adapter);
            }
        });
//retour sur la selection de categorie
        leButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                leText.setText("Sélectionner une catégorie :");
                leButton.setVisibility(view.INVISIBLE);
                lstCategorie.setVisibility(view.VISIBLE);
                lstAntibiotique.setVisibility(view.GONE);
                Main_menu();
            }
        });
//Apres avoir selectionner un antibiotique
        lstAntibiotique.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Antibiotique = lesAntibiotiques.get(position).getLibelle();
                lstAntibiotique.setVisibility(view.GONE);
                leButton.setVisibility(view.GONE);
                leText.setVisibility(view.GONE);
                nomAntibio.setVisibility(view.VISIBLE);
                retAntibio.setVisibility(view.VISIBLE);
                nomAntibio.setText(Antibiotique);

                if (DataAntibio.isInstanceAntiBioPasKilo(Antibiotique))
                {
                    resultCalc.setVisibility(view.VISIBLE);
                    entrerKilo.setVisibility(view.VISIBLE);
                    lancerCalc.setVisibility(view.VISIBLE);
                }

                else
                {
                    doseAntibio.setVisibility(view.VISIBLE);
                    double dosePrise = DataAntibio.recupPrise(Antibiotique);
                    int nbParJour = DataAntibio.recupNombreParJour(Antibiotique);
                    doseAntibio.setText(dosePrise+" doses par prises "+nbParJour+" fois par jour");
                }
            }
        });
        lancerCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String kiloS = entrerKilo.getText().toString();
                if (!kiloS.equals("")) {
                    int kilo = Integer.parseInt(kiloS);
                    double doseParKilo = DataAntibio.recupDoseParKilo(Antibiotique) * kilo;
                    resultCalc.setText("Il faut " + doseParKilo + " mg de l'antibiotique");
                }
            }
        });

        //retour sur les antibiotiques
        retAntibio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                lstAntibiotique.setVisibility(view.VISIBLE);
                leButton.setVisibility(view.VISIBLE);
                leText.setVisibility(view.VISIBLE);
                nomAntibio.setVisibility(view.GONE);
                doseAntibio.setVisibility(view.GONE);
                retAntibio.setVisibility(view.GONE);
                resultCalc.setVisibility(view.GONE);
                resultCalc.setText("");
                entrerKilo.setVisibility(view.GONE);
                entrerKilo.setText("");
                lancerCalc.setVisibility(view.GONE);
            }
        });
    }
}