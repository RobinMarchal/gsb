package com.example.robinmarchal.gsbantibio;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.Toast;

        import com.example.robinmarchal.gsbantibio.mesClasses.Categorie;
        import com.example.robinmarchal.gsbantibio.mesClasses.DataAntibio;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int MYSECONDACTIVITY_REQUESTCODE = 1;
    ListView lstCategorie;
    List<Categorie> lesCategories;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstCategorie = (ListView) findViewById(R.id.lstAntibio);
        DataAntibio.initialiser();
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

        // gestion sélection sur la ListView
        lstCategorie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String categorie = lesCategories.get(position).getLibelle();
                Intent it = new Intent (MainActivity.this, Main2Activity.class);
                it.putExtra("Categ",categorie);
                //startActivity(new Intent (MainActivity.this, Main2Activity.class));
                Toast.makeText(getApplicationContext(), categorie, Toast.LENGTH_SHORT).show();
                startActivityForResult(it, MYSECONDACTIVITY_REQUESTCODE);
            }
        });
    }

}

