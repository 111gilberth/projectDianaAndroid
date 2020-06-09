package com.example.firebasedianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvt_m1,tvt_m2,tvt_m3,tvt_m4,tvt_m5,tvt_m6;
    private Button btn_m1;
    private Spinner spi_m1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvt_m1 = findViewById(R.id.tvt_m1);
        tvt_m2 = findViewById(R.id.tvt_m2);
        tvt_m3 = findViewById(R.id.tvt_m3);
        spi_m1 = findViewById(R.id.spi_m1);
        tvt_m5 = findViewById(R.id.tvt_m5);
        tvt_m6 = findViewById(R.id.tvt_m6);
        btn_m1 = findViewById(R.id.btn_m1);

        // Spinner click listener
        spi_m1.setOnItemSelectedListener(this);


        /*
        *  // Spinner Drop down elements
          List<String> categories = new ArrayList<String>();
          categories.add("Automobile");
          categories.add("Business Services");
          categories.add("Computers");
          categories.add("Education");
          categories.add("Personal");
          categories.add("Travel");
        * */
    }
    /*metodo para enviar data a firebase*/
    private void firebaseSendData(){

    }
}
