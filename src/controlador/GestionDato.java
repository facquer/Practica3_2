/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import LibDiccionario.Diccionar;
import arraylist.Lista;

import modelo.Casa;
import modelo.Propietario;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private Lista<Casa> listaCasa;
    private Diccionar<String ,Propietario> listaPro;

    public GestionDato(Lista<Casa> listaCasa, Diccionar<String, Propietario> listaPro) {
        this.listaCasa = listaCasa;
        this.listaPro = listaPro;
    }

    public Lista<Casa> getListaCasa() {
        return listaCasa;
    }

    public void setListaCasa(Lista<Casa> listaCasa) {
        this.listaCasa = listaCasa;
    }

    public Diccionar<String, Propietario> getListaPro() {
        return listaPro;
    }

    public void setListaPro(Diccionar<String, Propietario> listaPro) {
        this.listaPro = listaPro;
    }
    
    
}
