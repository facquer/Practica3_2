/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Casa {
    private String predioUrb;
    private int numeroHab;
    private String dimension;
    private int pisos;
    private Propietario duenio;

    public Casa(String predioUrb, int numeroHab, String dimension, int pisos, Propietario duenio) {
        this.predioUrb = predioUrb;
        this.numeroHab = numeroHab;
        this.dimension = dimension;
        this.pisos = pisos;
        this.duenio = duenio;
    }

    public String getPredioUrb() {
        return predioUrb;
    }

    public void setPredioUrb(String predioUrb) {
        this.predioUrb = predioUrb;
    }

    public int getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(int numeroHab) {
        this.numeroHab = numeroHab;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public Propietario getDuenio() {
        return duenio;
    }

    public void setDuenio(Propietario duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Casa{" + "predioUrb=" + predioUrb + ", numeroHab=" + numeroHab + ", dimension=" + dimension + ", pisos=" + pisos + ", duenio=" + duenio + '}';
    }

    
    
}
