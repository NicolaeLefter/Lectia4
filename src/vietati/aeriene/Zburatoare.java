package vietati.aeriene;

import vietati.Animal;

public class Zburatoare extends Animal {
    private int inaltimeZbor;
    private String migrare;

    public int getInaltimeZbor(){
        return inaltimeZbor;
    }
    public String getMigrare(){
        return migrare;
    }
    public void setInaltimeZbor( int inaltimeZbor){
        this.inaltimeZbor = inaltimeZbor;
    }
    public void setMigrare(String migrare){
        this.migrare = migrare;
    }
}
