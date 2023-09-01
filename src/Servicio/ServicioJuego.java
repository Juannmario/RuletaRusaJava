
package Servicio;

import Entidades.Juego;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJuego {
//    llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//
//10
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    Juego juego;

  Scanner leer = new Scanner(System.in).useDelimiter("/n");
    
    public void cargarJuego(ServicioRevolver revolver, ArrayList <ServicioJugador> jugadores)
    {
       juego = new Juego(revolver,jugadores);
    }

    public void ronda()
    {
       for (ServicioJugador jugador : juego.getJugadores())
       {
           if(jugador.disparo(juego.getRevolver()))
           {
               System.out.println( "PERDISTE: " + jugador);
               break;
           }
           else
           {
              
               System.out.println("TE HAS SALVADO," + jugador +" GIRANDO EL TAMBOR");
           }
       }
    }

  
    
    
}
