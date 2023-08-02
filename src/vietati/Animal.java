package vietati;

public class Animal {

    private String nume;
    private int varsta;
    private String alimenatie;
    private int durataViata;
    private String reproducere:

    public String getNume() {
        return nume;
    }
    public String getReproducere(){
        return reproducere;
    }

    private int getDurataViata() {
        return durataViata;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getAlimenatie() {
        return alimenatie;
    }
    public void setReproducere(String reproducere){
        this.reproducere = reproducere;
    }

    public void setDurataViata(int durataViata) {
        this.durataViata = durataViata;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAlimenatie(String alimenatie) {
        this.alimenatie = alimenatie;
    }

}
