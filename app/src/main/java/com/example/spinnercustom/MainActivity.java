package com.example.spinnercustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    String[] countries;
    String[] populations;
    int[] flags={R.drawable.afghanistan,R.drawable.australia,R.drawable.bangladesh,R.drawable.canada,R.drawable.china};
Boolean firstSelect=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countries=getResources().getStringArray(R.array.countries);
        populations=getResources().getStringArray(R.array.population);
        spin=findViewById(R.id.spinId);
        CustomAdapter custom=new CustomAdapter(this,flags,countries,populations);
        spin.setAdapter(custom);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                if(firstSelect==true)
                {
                    firstSelect=false;
                }
                else {
                    Toast.makeText(getApplicationContext(),countries[i]+" is selected",Toast.LENGTH_SHORT).show();

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}