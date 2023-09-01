
package Servicio;

import Entidades.Revolver;
import java.util.Scanner;


public class ServicioRevolver {
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
    Scanner leer = new Scanner(System.in).useDelimiter("/n");
    Revolver revolver;
    
    public void cargarRevolver()
    {
      
       int posB = (int) (Math.random()*6);
        revolver=new Revolver();
        revolver.setPosActual(0);
        revolver.setPosBala(posB);
        System.out.println(revolver);
    }
    public boolean matar()
    {
        return revolver.getPosActual()==revolver.getPosBala();
    }
   
    public void siguienteBala()
   {
       revolver.setPosActual(revolver.getPosActual()+1);
   }

    @Override
    public String toString() {
        return "Posicion Acutal: " + revolver.getPosActual() +" Posicion de la bala: " + revolver.getPosBala();
    }
    
}
