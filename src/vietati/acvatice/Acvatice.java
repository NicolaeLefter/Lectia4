package vietati.acvatice;

import vietati.Animal;

public class Acvatice extends Animal{
    private int adincimeaMaxima;
    private String scheletul;

    public int getAdincimeaMaxima(){
        return adincimeaMaxima;
    }
    public String getScheletul(){
        return scheletul;
    }
    public void setAdincimeaMaxima( int adincimeaMaxima){
        this.adincimeaMaxima = adincimeaMaxima;
    }
    public void setScheletul(String scheletul){
        this.scheletul = scheletul;
    }

}
