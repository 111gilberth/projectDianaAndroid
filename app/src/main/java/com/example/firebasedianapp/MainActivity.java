package com.example.firebasedianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
/*import com.example.firebasedianapp.materialspinner.MaterialSpinner;*/

public class MainActivity extends AppCompatActivity {

    TextView tvt_m1,tvt_m2,tvt_m3,tvt_m4,tvt_m5,tvt_m6;
    Button btn_m1;
    Spinner spi_m1;

    private static final String[] ANDROID_VERSIONS = {
            /*escribir lo que quieres que lleve el spiner dentro de las comillas dobles("")*/
            "Vivienda",
            "Edificio"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvt_m1 = findViewById(R.id.tvt_m1);
        tvt_m2 = findViewById(R.id.tvt_m2);
        tvt_m3 = findViewById(R.id.tvt_m3);
        tvt_m5 = findViewById(R.id.tvt_m5);
        tvt_m6 = findViewById(R.id.tvt_m6);
        btn_m1 = findViewById(R.id.btn_m1);

        spi_m1 = findViewById(R.id.spi_m1);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
        R.array.spn_m1, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spi_m1.setAdapter(adapter);
        spi_m1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) spi_m1);

    }
}
