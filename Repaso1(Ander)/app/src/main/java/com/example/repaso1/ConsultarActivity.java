package com.example.repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import static com.example.repaso1.MainActivity.Alumnoactual;

public class ConsultarActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);
        lv=findViewById(R.id.layout_lista);
        FaltasAdapter fa = new FaltasAdapter(this,R.layout.itemfalta,Alumnoactual.getFaltas());
        lv.setAdapter(fa);
    }
}
