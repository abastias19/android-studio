package com.example.alumnos.proyecto1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class
        MainActivity extends AppCompatActivity {
    public Button hacerllamada;
    public Button Finllamada;
    public Intent hacerintenciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hacerllamada = (Button)findViewById(R.id.button);
        Finllamada = (Button)findViewById(R.id.button2);
        hacerllamada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
        Finllamada.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){

        }
        });
    }
    public void call (){
        try{
            hacerintenciones = new Intent(Intent.ACTION_CALL);
            hacerintenciones.setData(Uri.parse("Tel:"+84475937));
            startActivity(hacerintenciones);
        }catch (ActivityNotFoundException activityExcepcion){
            Log.e("ejemplo","llamar",activityExcepcion);
        }
    }
    private void end() {
        try {
            this.finish();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

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
