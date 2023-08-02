package vietati.terestre;

import vietati.Animal;

public class Terestre extends Animal {

    private int numberOflegs;
    private int durataViata;
    private String habitat;

    public int getNumberOflegs(){
        return numberOflegs;
    }
    public int getDurataViata(){
        return durataViata;
    }
    public String getHabitat(){
        return habitat;
    }

    public void setNumberOflegs( int numberOflegs){
        this.numberOflegs = numberOflegs;
    }
    public void setDurataViata( int durataViata){
        this.durataViata = durataViata;
    }
    public void setHabitat( String habitat){
        this.habitat = habitat;
    }
}
