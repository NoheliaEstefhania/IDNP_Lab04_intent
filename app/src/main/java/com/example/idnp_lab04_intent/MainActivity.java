package com.example.idnp_lab04_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtUsuario = findViewById(R.id.editTextUsuario);
        EditText edtPassword = findViewById(R.id.editTextPassword);
        TextView txtMensaje = findViewById(R.id.textViewConfirmation);
        Button btnLogin = findViewById(R.id.buttonIngresar);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String usuario = edtUsuario.getText().toString();
                String password = edtPassword.getText().toString();

                if (usuario.equals("test") && password.equals("1234")){
                    Log.d(TAG, "valido, " + usuario + "," + password);
                    txtMensaje.setText("Autenticacion valida");
                } else{
                    txtMensaje.setText("Autenticacion no valida");
                    Log.d(TAG, "invalido, " + usuario + "," + password);
                }
            }
        });
    }
}