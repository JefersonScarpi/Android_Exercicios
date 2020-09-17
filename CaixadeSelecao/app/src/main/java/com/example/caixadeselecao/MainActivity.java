package com.example.caixadeselecao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    //CheckBox
    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;

    //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //CheckBox
        checkVerde    = findViewById(R.id.checkVerde);
        checkBranco   = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino  = findViewById(R.id.radioButtonFeminino);
        sexoMasculino = findViewById(R.id.radioButtonMasculino);
        opcaoSexo     = findViewById(R.id.radioGroupSexo);

        radioButton();
    }

    public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if ( i == R.id.radioButtonMasculino ){
                    textoResultado.setText("Masculino");
                }else if(){
                    textoResultado.setText("Feminino");
                }
            }
        });

        /*
        if ( sexoMasculino.isChecked() ){
            textoResultado.setText("Masculino");
        }else if ( sexoFeminino.isChecked() ){
            textoResultado.setText("Feminino");
        }
         */


    }

    public void enviar(View view){

        radioButton();
    }





/*    public void checkbox(){

        String texto = "" ;
        if( checkVerde.isChecked() ){
            texto = "Verde selecionado - ";
        }
        if( checkBranco.isChecked() ){
            texto = texto +"Branco selecionado - ";
        }
        if( checkVermelho.isChecked() ){
            texto = texto +"Vermelho selecionado - ";
        }


        textoResultado.setText( texto );

    }

    public void enviar(View view){

        checkbox();

    }
*/
}