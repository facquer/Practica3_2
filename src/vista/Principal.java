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
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Map<String,Propietario> dato = new HashMap<String,Propietario>();
        Lista<Casa> listCasa = new Lista<Casa>();
        Diccionar mapPropietario = new Diccionar(dato);
        GestionDato gD = new GestionDato(listCasa,mapPropietario);
        
     
      //  Casa c1 = new Casa("Predio",5,"dimension",2,p1);
        
        
        
      
        crearPropietario cP = new crearPropietario(gD);
        cP.crear();
        
        //gD.getListaCasa().ingresar(c1);
      
  
   
       gD.getListaPro().recuperarElements();
  
       
        
        
        
        
        
    }
    
}
