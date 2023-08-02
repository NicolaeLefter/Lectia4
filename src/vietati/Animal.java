package vietati;

public class Animal {

    private String nume;
    private int varsta;
    private String alimenatie;
    private int durataViata;

    public String getNume(){
        return  nume;
    }
    private int getDurataViata(){
        return durataViata;
    }
    public int getVarsta(){
        return varsta;
    }
    public String getAlimenatie(){
        return alimenatie;
    }
    private void setDurataViata( int durataViata){
        this.durataViata = durataViata;
    }
    public void setNume( String nume){
        this.nume = nume;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    public void setAlimenatie( String alimenatie){
        this.alimenatie = alimenatie;
    }

}
