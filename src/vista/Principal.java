/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import arraylist.Lista;
import LibDiccionario.Diccionar;
import controlador.GestionDato;
import java.util.HashMap;
import java.util.Map;
import modelo.Casa;
import modelo.Propietario;
/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,Propietario> dato = new HashMap<String,Propietario>();
        Lista<Casa> listCasa = new Lista<Casa>();
        Diccionar mapPropietario = new Diccionar(dato);
        GestionDato gD = new GestionDato(listCasa,mapPropietario);
        
        Propietario p1 = new Propietario("Angel","Ruiz","5259","1998");
        Propietario p2 = new Propietario("Angell","Ruizl","52599","19988");
        Casa c1 = new Casa("55",5,"3x3",2,p1);
        Casa c2 = new Casa("555",8,"35x35",2,p1);
        Casa c3 = new Casa("5655",68,"365x365",2,p2);
        
        gD.getListaCasa().ingresar(c1);
        gD.getListaCasa().ingresar(c2);
        gD.getListaCasa().ingresar(c3);
        
        gD.getListaPro().addElemento(p1.getCedula(), p1);
        gD.getListaPro().addElemento(p2.getCedula(), p2);
        
        listCasa.ingresar(c1);
        listCasa.ingresar(c2);
        listCasa.ingresar(c3);
        
       gD.getListaPro().recuperarElement("5259");
       gD.getListaPro().eliminarElement("5259");
       
        
        
        
        
        
    }
    
}
