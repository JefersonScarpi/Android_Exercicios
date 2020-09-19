package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Passa de uma activity para outra
                Intent intent = new Intent( getApplicationContext(), SegundaActivity.class );

                //Intaciar o objeto
                Usuario usuario = new Usuario("Jeferson Scarpi", "jefersonscarpi@gmail.com");

                //Passar dados de uma activity para outra
                intent.putExtra("nome", "Jeferson Scarpi");
                intent.putExtra("idade", 32);
                intent.putExtra("objeto", usuario);
                startActivity( intent );

            }
        });

    }
}