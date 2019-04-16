package com.example.robinmarchal.gsbantibio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.robinmarchal.gsbantibio.mesClasses.Antibiotique;
import com.example.robinmarchal.gsbantibio.mesClasses.Categorie;
import com.example.robinmarchal.gsbantibio.mesClasses.DataAntibio;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity
{
    TextView libelle;
    TextView libelleG;
    TextView nbrJour;

    List<Antibiotique> lesAntibiotiques;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        libelle = (TextView)findViewById(R.id.txtLibelle);
        libelleG = (TextView)findViewById(R.id.txtLibelleG);
        nbrJour = (TextView)findViewById(R.id.txtNbr);

        DataAntibio.initialiser();
        Bundle b = getIntent().getExtras();

        String valLib = b.getString("AntibioLibelle");
        String valLibG = b.getString("AntibioLibelleG");
        String valNbr = b.getString("AntibioLNbr");

        libelle.setText(valLib);
        libelleG.setText(valLibG);
        nbrJour.setText(valNbr);

    }
}