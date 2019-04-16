package com.example.robinmarchal.gsbantibio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.robinmarchal.gsbantibio.mesClasses.Antibiotique;
import com.example.robinmarchal.gsbantibio.mesClasses.Categorie;
import com.example.robinmarchal.gsbantibio.mesClasses.DataAntibio;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private static final int MYSECONDACTIVITY_REQUESTCODE = 1;
    private EditText edtText;
    ListView lstAntibiotiques;
    List<Antibiotique> lesAntibiotiques;
    double lesAntibio;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lstAntibiotiques = (ListView) findViewById(R.id.lstAntibio);
        DataAntibio.initialiser();
        Bundle b = getIntent().getExtras();
        String val = b.getString("Categ");
        Categorie c = new Categorie(val);
        lesAntibiotiques = DataAntibio.getAntibiotiquesUneCateg(c);

        // alimentation de la ListVie   w
        ArrayList<String> antibio = new ArrayList<String>();
        for(Antibiotique a  : lesAntibiotiques)
        {
            antibio.add(a.getLibelle().toUpperCase());
        }



        edtText = (EditText) findViewById(R.id.editText);
        DataAntibio.initialiser();
        Bundle bu = getIntent().getExtras();
        String valu = bu.getString("Categ");
        Categorie ca = new Categorie(valu);
        lesAntibio = DataAntibio.getMoyNombreParJour(ca);




        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(Main2Activity.this, android.R.layout.simple_list_item_1, antibio);
        lstAntibiotiques.setAdapter(adapter);

        // gestion sélection sur la ListView
        lstAntibiotiques.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Antibiotique a = lesAntibiotiques.get(position);
                String antibiotique = lesAntibiotiques.get(position).getLibelle();

                Intent it = new Intent (Main2Activity.this, Main3Activity.class);
                it.putExtra("AntibioLibelle", a.getLibelle());
                it.putExtra("AntibioLibelleG", a.getLibelleG());
                it.putExtra("AntibioNbr", String.valueOf(a.getNombreParJour()));

                //Toast.makeText(getApplicationContext(), antibiotique, Toast.LENGTH_SHORT).show();
                startActivityForResult(it, MYSECONDACTIVITY_REQUESTCODE);
            }
        });
    }
}

