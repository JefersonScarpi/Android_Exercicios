package com.example.bancodedadossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            //Criar banco de dados
            SQLiteDatabase bancoDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            //Criar tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas ( id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3) )");

            //Apagar tabela
            //bancoDados.execSQL(" DROP TABLE pessoas ");

            //Atualizando dados
            //bancoDados.execSQL( "UPDATE pessoas SET idade = 19, nome = 'Luiza Silva' WHERE nome = 'Luiza'");
            //bancoDados.execSQL( "UPDATE pessoas SET idade = 19, nome = 'Mariana Silva' WHERE id = 3");

            //Deletar linha da tabela
            //bancoDados.execSQL( "DELETE FROM pessoas WHERE id = 2 " );

            //Inserir dados
            //bancoDados.execSQL( "INSERT INTO pessoas( nome, idade ) VALUES( 'Mariana', 18) " );
            //bancoDados.execSQL( "INSERT INTO pessoas( nome, idade ) VALUES( 'Maria', 35) " );

            //Recuperar pessoas
/*           String consulta =
                    "SELECT nome, idade FROM pessoas " +
                    "WHERE nome = 'Jeferson' ";
            String consulta =
                    "SELECT nome, idade FROM pessoas " +
                    "WHERE idade >= 35 OR idade = 18 ";
            String consulta =
                    "SELECT nome, idade FROM pessoas " +
                    "WHERE idade IN(18,35) ";
            String consulta =
                    "SELECT nome, idade FROM pessoas " +
                    "WHERE nome IN('Jeferson','Maria') ";
            String consulta =
                    "SELECT nome, idade FROM pessoas " +
                    "WHERE idade BETWEEN 30 AND 35 ";

            String consulta =
                    "SELECT nome, idade FROM pessoas " +
                    "WHERE nome LIKE '%mar%' ";

            String consulta =
                    "SELECT id, nome, idade FROM pessoas " +
                    "WHERE 1=1 ";
                    //"WHERE 1=1 ORDER BY nome DESC LIMIT 3 ";
                    //"WHERE 1=1 ORDER BY nome ASC ";

 */

            String consulta =
                    "SELECT * FROM pessoas " +
                            "WHERE 1=1 ";

            Cursor cursor = bancoDados.rawQuery( consulta,null);

            //Indices da tabela
            int indiceId = cursor.getColumnIndex( "id");
            int indiceNome = cursor.getColumnIndex( "nome");
            int indiceIdade = cursor.getColumnIndex( "idade");

            cursor.moveToFirst();

            while (cursor != null ){

                String nome = cursor.getString( indiceNome );
                String idade = cursor.getString( indiceIdade );
                String id = cursor.getString( indiceId );

                Log.i ("RESULTADO - id ", id + " / nome: " + nome +" / idade: " + idade );

                cursor.moveToNext();
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}