package com.example.alumnos.vistazo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    private RadioButton radiouno;
    private RadioButton radiodos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = (RadioGroup) findViewById(R.id.GrbGrupo1);
        rg.clearCheck();

        radiouno = (RadioButton) findViewById(R.id.radioButton);
        radiodos = (RadioButton) findViewById(R.id.radioButton);
        View.OnClickListener list = new View.OnClickListener() {

            @Override

            public void onClick(View View) {
                switch (View.getId()) {
                    case R.id.radioButton:
                        Intent i = new Intent(MainActivity.this, Main2Activity.class);

                        startActivity(i);
                        break;


                    case R.id.radioButton2:
                        Intent j = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(j);

                }
            }

        };


        radiouno.setOnClickListener(list);
        radiodos.setOnClickListener(list);
        findViewById(R.id.radioButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
        findViewById(R.id.radioButton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main22Activity.class));
            }
        });
        findViewById(R.id.radioButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main23Activity.class));
            }
        });
    }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
