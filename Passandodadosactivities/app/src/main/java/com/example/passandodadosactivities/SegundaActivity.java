package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textIdade =  findViewById(R.id.textIdade);
        textNome = findViewById(R.id.textNome);

        //Recuperar os dados enviados
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        //Configurar os valores recuperados
/*      textNome.setText( nome );
        textIdade.setText( String.valueOf( idade ) );
 */
        textNome.setText( usuario.getEmail() );

    }
}