package com.example.repaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        txtDia=findViewById(R.id.txtFalta);
        txtMes=findViewById(R.id.txtMes);

        btnAdd=findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        btnFalta=findViewById(R.id.btnFalta);
        btnFalta.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v==btnAdd){
            Alumnoactual= new Alumno(Integer.parseInt(txtNexp.getText().toString()),txtNombre.getText().toString(),txtApellido.getText().toString());
            Toast.makeText(this,"Señor añadido",Toast.LENGTH_SHORT).show();
        }else{
            Alumnoactual.registrarFalta(Integer.parseInt(txtDia.getText().toString()),Integer.parseInt(txtMes.getText().toString()));
            Toast.makeText(this,"Falta añadida",Toast.LENGTH_SHORT).show();
        }
    }
}
