
package Servicio;

import Entidades.Jugador;
import java.util.Scanner;



public class ServicioJugador {
//    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    Jugador jugador = new Jugador();
    Scanner leer =new Scanner(System.in).useDelimiter("/n");
    
    public void cargar(int i)
    {
        
        System.out.println("INGRESE EL NOMBRE DEL JUGADOR");
        jugador.setNombre(leer.nextLine());
        jugador.setId(i);
        jugador.setMuerto(false);    
        
    }
    public boolean disparo(ServicioRevolver revolver)
    {
        if(revolver.matar())
        {
           jugador.setMuerto(true);
           
           return true;
        }
        else
        {
            revolver.siguienteBala();
            return false;
            
        }        
    }

    @Override
    public String toString() {
        return "Jugador" + jugador ;
    }

   
    
}
