package com.example.repaso1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FaltasAdapter extends ArrayAdapter {
    ArrayList<ContadorFalta> lista;
    Activity activity;
    int id;

    public FaltasAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContadorFalta> objects) {
        super(context, resource, objects);
        activity=(ConsultarActivity)context;
        lista=objects;
        id=resource;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LinearLayout v= (LinearLayout) activity.getLayoutInflater().inflate(id,parent,false);
        TextView txtMes=v.findViewById(R.id.txtMes);
        TextView txtFaltas=v.findViewById(R.id.txtFalta);
        txtMes.setText(String.valueOf(lista.get(position).getMes()));
        txtFaltas.setText(String.valueOf(lista.get(position).getCont()));
        if(position%2==0){
            v.setBackgroundColor(Color.CYAN);

        }else{
            v.setBackgroundColor(Color.GRAY);
        }
        return v;

    }
}
