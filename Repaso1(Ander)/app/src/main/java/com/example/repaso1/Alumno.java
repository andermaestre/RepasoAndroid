package com.example.repaso1;

import java.util.ArrayList;

public class Alumno {
    private int nExpediente;//representa el número de cuenta.
    private String Nombre;
    private String Apellido;
    private ArrayList<Falta>Faltas;

    public Alumno(int ne,String nom, String ape)
    {   this.Nombre=nom;
        this.Apellido=ape;
        this.nExpediente=ne;
    }

    public int getnExpediente() {
        return nExpediente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void registrarFalta(int dia, int mes)
    {
        for(Falta f: Faltas)
        {
            if(f.getDia()==dia&&f.getMes()==mes){
                return;
            }
        }
        Faltas.add(new Falta(dia,mes));
    }
    public ArrayList<ContadorFalta> getFaltas()
    {
        int[] MesFaltas= new int[12];
        ArrayList<ContadorFalta> cuentaFaltas = new ArrayList<ContadorFalta>();
        for (Falta f: Faltas){
            MesFaltas[f.getMes()-1]++;
        }

        for(int i=0;i<12;i++){
            cuentaFaltas.add(new ContadorFalta(i+1,MesFaltas[i]));
        }
        return cuentaFaltas;
    }

}
