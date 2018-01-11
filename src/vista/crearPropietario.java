/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.util.Scanner;
import modelo.Propietario;

/**
 *
 * @author Jose Aller
 */
public class crearPropietario {
    private GestionDato gD;
   
   
    public crearPropietario(GestionDato gD) {
        this.gD = gD;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    public void crear(){
        Scanner teclado = new Scanner (System.in);    

        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el apellido del propietario: ");
        String apellido = teclado.nextLine();
        System.out.print("Ingrese la cedula del propietario: ");
        String cedula = teclado.nextLine();
        System.out.print("Ingrese la fecha de nacimiento del propietario: ");
        String fechaNac = teclado.nextLine();
        
        Propietario p1 = new Propietario(nombre,apellido,cedula,fechaNac);
        gD.getListaPro().addElemento(p1.getCedula(), p1);
        
        System.out.println("");
        System.out.println("Desea agregar a otro propietario");
        System.out.println("Pulse 1 para agregar otro");
        System.out.println("Pulse 2 para seguir");
        int x = teclado.nextInt();
        if(x<=1){
            crear();
        }else{
           return;
        }
    }
    
}
