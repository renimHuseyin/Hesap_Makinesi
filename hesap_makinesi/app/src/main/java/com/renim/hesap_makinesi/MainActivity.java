package com.renim.hesap_makinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_pi,button_e,button_c,button_delete;
    Button button_sol,button_sag,button_kare,button_bolme;
    Button button_seven,button_eight,button_nine,button_carpma;
    Button button_four,button_five,button_six,button_eksi;
    Button button_one,button_two,button_three,button_plus;
    Button button_kok,button_sifir,button_virgul,button_esit;

    TextView result,solution;

    boolean arti,eksi,carpma,bolme;

    float deger1,deger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        solution = findViewById(R.id.solution);

        button_pi = (Button) findViewById(R.id.button_pi);
        button_e = (Button) findViewById(R.id.button_e);
        button_c = (Button) findViewById(R.id.button_c);
        button_delete = (Button) findViewById(R.id.button_delete);
        button_sol = (Button) findViewById(R.id.button_sol);
        button_sag = (Button) findViewById(R.id.button_sag);
        button_kare = (Button) findViewById(R.id.button_kare);
        button_bolme = (Button) findViewById(R.id.button_bolme);
        button_seven = (Button) findViewById(R.id.button_seven);
        button_eight = (Button) findViewById(R.id.button_eigth);
        button_nine = (Button) findViewById(R.id.button_nine);
        button_carpma = (Button) findViewById(R.id.button_carpma);
        button_four = (Button) findViewById(R.id.button_four);
        button_five = (Button) findViewById(R.id.button_five);
        button_six = (Button) findViewById(R.id.button_six);
        button_eksi = (Button) findViewById(R.id.button_eksi);
        button_one = (Button) findViewById(R.id.button_one);
        button_two = (Button) findViewById(R.id.button_two);
        button_three = (Button) findViewById(R.id.button_three);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_kok = (Button) findViewById(R.id.button_kok);
        button_sifir = (Button) findViewById(R.id.button_sifir);
        button_virgul = (Button) findViewById(R.id.button_virgul);
        button_esit = (Button) findViewById(R.id.button_esit);

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
                solution.setText(result.getText());
            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
                solution.setText(result.getText());
            }
        });

        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
                solution.setText(result.getText());
            }
        });

        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
                solution.setText(result.getText());
            }
        });

        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
                solution.setText(result.getText());
            }
        });

        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
                solution.setText(result.getText());
            }
        });

        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
                solution.setText(result.getText());
            }
        });

        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
                solution.setText(result.getText());
            }
        });

        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
                solution.setText(result.getText());
            }
        });

        button_sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
                solution.setText(result.getText());
            }
        });

        button_virgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
                solution.setText(result.getText());
            }
        });

        button_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3.14");
                solution.setText("π");
            }
        });

        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2.71");
                solution.setText("e");
            }
        });

        button_kare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(deger1*deger1+"");
                solution.setText(deger1+"^2");
            }
        });

        button_kok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = solution.getText().toString();

                if(!input.isEmpty()){
                    double sayi = Double.parseDouble(input);
                    double kok = Math.sqrt(sayi);

                        result.setText(kok + "");
                }
                else {
                    result.setText("Hata");
                }
            }
        });

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                solution.setText("");
            }
        });

        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = solution.getText().toString();
                String sonuc = result.getText().toString();

                if(sonuc.length() > 0)
                {
                    String yeni = sonuc.substring(0, sonuc.length() - 1);
                    result.setText(yeni);
                }

                if(currentText.length() > 0){
                    String newText = currentText.substring(0, currentText.length() - 1);
                    solution.setText(newText);
                }
            }
        });

        button_sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"(");
                solution.setText(result.getText());
            }
        });

        button_sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+")");
                solution.setText(result.getText());
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null)
                {
                    result.setText("");
                }
                else
                {
                    deger1=Float.parseFloat(result.getText()+"");
                    arti=true;
                    result.setText(null);
                }
            }
        });

        button_eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger1=Float.parseFloat(result.getText()+"");
                eksi=true;
                result.setText(null);
            }
        });

        button_bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+"");
                bolme=true;
                result.setText(null);
            }
        });

        button_carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+"");
                carpma=true;
                result.setText(null);
            }
        });

        button_esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger2=Float.parseFloat(result.getText()+"");

                if(arti==true)
                {
                    result.setText(deger1+deger2+"");
                    solution.setText(deger1+"+"+deger2);
                    arti=false;
                }

                if(eksi==true)
                {
                    result.setText(deger1-deger2+"");
                    solution.setText(deger1+"-"+deger2);
                    eksi=false;
                }

                if(bolme==true)
                {
                    result.setText(deger1/deger2+"");
                    solution.setText(deger1+"÷"+deger2);
                    bolme=false;
                }

                if(carpma==true)
                {
                    result.setText(deger1*deger2+"");
                    solution.setText(deger1+"X"+deger2);
                    carpma=false;
                }
            }
        });

    }
}