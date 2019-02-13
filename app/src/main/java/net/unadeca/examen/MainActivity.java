package net.unadeca.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int aleatorio;
    int num;
    String mostrar;
    String respuesta;
    int puntosusuario;
    int puntosconsola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button piedra = findViewById(R.id.Piedra);
        final Button papel = findViewById(R.id.Papel);
        final Button tijera = findViewById(R.id.Tijera);
        final Button jugar = findViewById(R.id.Jugar);

        final TextView usuario = findViewById(R.id.usuario);
        final TextView comsola = findViewById(R.id.consola);
        final TextView puntos = findViewById(R.id.puntos);
        TextView numero =  findViewById(R.id.Marcador);
        final TextView puntoU = findViewById(R.id.usu);
        final TextView puntoC = findViewById(R.id.conso);


        piedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = "1";
                usuario.setText("Piedra");
                aletorio();
            }
        });
        papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = "2";
                usuario.setText("Papel");
                aletorio();
            }
        });
        tijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = "3";
                usuario.setText("Tijera");
                aletorio();
            }
        });
        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                comsola.setText(respuesta);

                if (num == 1 && mostrar.equals("1")){

                    puntos.setText("Empate");
                }
                if (num == 1 && mostrar.equals("2")){

                    puntos.setText("Haz ganado");
                    puntosusuario++;
                    puntoU.setText(String.valueOf(puntosusuario));

                }
                if (num == 1 && mostrar.equals("3")){

                    puntos.setText("Haz perdido");
                    puntosconsola++;
                    puntoC.setText(String.valueOf(puntosconsola));
                }
                if (num ==2 && mostrar.equals("1")){

                    puntos.setText("Haz perdido");
                    puntosconsola++;
                    puntoC.setText(String.valueOf(puntosconsola));
                }
                if (num ==2 && mostrar.equals("2")){

                    puntos.setText("Empate");
                }
                if (num ==2 && mostrar.equals("3")){

                    puntos.setText("Haz ganado");
                    puntosusuario++;
                    puntoU.setText(String.valueOf(puntosusuario));
                }
                if (num ==3 && mostrar.equals("1")){

                    puntos.setText("Haz ganado");
                    puntosusuario++;
                    puntoU.setText(String.valueOf(puntosusuario));
                }
                if (num ==3 && mostrar.equals("2")){

                    puntos.setText("Haz perdido");
                    puntosconsola++;
                    puntoC.setText(String.valueOf(puntosconsola));
                }
                if (num ==3 && mostrar.equals("3")){

                    puntos.setText("Empate");
                }
            }
        });

    };
    private int aletorio(){

        aleatorio = (int)(Math.random()*3+1);
        num = aleatorio;

        if (num == 1) {
            respuesta = "Piedra";
        } else if (num == 2) {
            respuesta = "Papel";
        } else {
            respuesta = "Tijera";
        }

        return 0;
    }
    }

