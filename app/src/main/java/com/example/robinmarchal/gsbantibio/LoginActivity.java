package com.example.robinmarchal.gsbantibio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.robinmarchal.gsbantibio.mesClasses.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    static public User user;
    private EditText edtLogin, edtPassword;
    private Button btnConnecter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtLogin = (EditText)findViewById(R.id.edtLogin);
        edtPassword  = (EditText)findViewById(R.id.edtPassWord);
        btnConnecter  = (Button)findViewById(R.id.btnConnecter);
        btnConnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verification(edtLogin.getText().toString(), edtPassword.getText().toString());
            }
        });
    }
    // les argument sont en final obligatoirement
    private void verification(final String login, final String password){
        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setCancelable(false); // set cancelable to false
        progressDialog.setMessage("Vérification de la connection"); // set message
        progressDialog.show(); // show progress dialog
        Api.getAPI().getLogin(login, password).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                progressDialog.dismiss(); //dismiss progress dialog
                user = response.body();
                if ( user != null) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Recommencer vos saisies", Toast.LENGTH_LONG).show();
                }
            };
            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(LoginActivity.this, t.toString(), Toast.LENGTH_LONG).show();
                progressDialog.dismiss(); //dismiss progress dialog
            }
        });
    }
}
