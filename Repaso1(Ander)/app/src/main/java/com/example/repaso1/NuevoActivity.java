package com.example.repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.repaso1.MainActivity.Alumnoactual;

public class NuevoActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtNombre, txtApellido, txtNexp, txtDia, txtMes;
    Button btnAdd, btnFalta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);

        txtNombre=findViewById(R.id.txtNombre);
        txtApellido=findViewById(R.id.txtApellido);
        txtNexp=findViewById(R.id.txtNexp);
        txtDia=findViewById(R.id.txtDia);
        txtMes=findViewById(R.id.txtMes);

        btnAdd=findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        btnFalta=findViewById(R.id.btnFalta);
        btnFalta.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v==btnAdd){
            Alumnoactual= new Alumno(Integer.getInteger(txtNexp.getText().toString()),txtNombre.getText().toString(),txtApellido.getText().toString());
        }else{
            Alumnoactual.registrarFalta(Integer.getInteger(txtDia.getText().toString()),Integer.getInteger(txtMes.getText().toString()));
        }
    }
}
