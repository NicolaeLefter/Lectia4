package vietati;


import vietati.acvatice.Acvatice;
import vietati.aeriene.Zburatoare;
import vietati.terestre.Carnivore;
import vietati.terestre.Erbivore;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Acvatice acvatice1 = new Acvatice();
        acvatice1.setNume("Rechin");
        acvatice1.setVarsta(2);
        acvatice1.setAdincimeaMaxima(100);
        acvatice1.setScheletul("Vertebrate");
        acvatice1.setAlimenatie("carnivor");
        acvatice1.setDurataViata(20);
        acvatice1.setReproducere("Depundere icre");
        System.out.println("Numele este: " + acvatice1.getNume());
        System.out.println("Varsta este: " + acvatice1.getVarsta() + " ani");
        System.out.println("Adancimea maxima este: " + acvatice1.getAdincimeaMaxima());
        System.out.println("Scheletul este: " + acvatice1.getScheletul());
        System.out.println();

        Zburatoare pasare1 = new Zburatoare();
        pasare1.setNume("Vrabie");
        pasare1.setVarsta(1);
        pasare1.setAlimenatie("omnivor");
        pasare1.setMigrare("Nu migreaza");
        pasare1.setInaltimeZbor(50);
        pasare1.setDurataViata(23);
        pasare1.setReproducere("Depunere oua");
        System.out.println("Numele este: " + pasare1.getNume());
        System.out.println("Varsta este: " + pasare1.getVarsta() + " ani");
        System.out.println("Tipul de alimentatie este: " + pasare1.getAlimenatie());
        System.out.println("Este migratoare: " + pasare1.getMigrare());
        System.out.println("Inaltimea perfecta de zbor este: " + pasare1.getInaltimeZbor() + " m ");


        Carnivore carnivor1 = new Carnivore();
        carnivor1.setNume("Lup");
        carnivor1.setAlimenatie("animala");
        carnivor1.setVarsta(3);
        carnivor1.setHabitat("Paduri");
        carnivor1.setNivelAgresiv("Foarte Agresiv");
        carnivor1.setNumberOflegs(4);
        carnivor1.setRasa("Salbatice");
        carnivor1.setDurataViata(15);
        carnivor1.setReproducere("Imperechere traditionala");

        Erbivore erbivor1 = new Erbivore();
        erbivor1.setNume("Cal");
        erbivor1.setVarsta(4);
        erbivor1.setAlimenatie("Iarba");
        erbivor1.setHabitat("pasuni");
        erbivor1.setRasa("Domestice");
        erbivor1.setSistemDigestiv("Rumegator");
        erbivor1.setDurataViata(20);
        erbivor1.setReproducere("Imperechere traditionala");


    }
}