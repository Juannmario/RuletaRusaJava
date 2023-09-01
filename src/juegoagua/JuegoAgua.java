
package juegoagua;


import Servicio.ServicioJuego;
import Servicio.ServicioJugador;
import Servicio.ServicioRevolver;
import java.util.ArrayList;


public class JuegoAgua {

   
    public static void main(String[] args) {
        
        ServicioJuego juego = new ServicioJuego();
        ServicioRevolver revolver = new ServicioRevolver();
        
        ArrayList <ServicioJugador> jugadores = new ArrayList<>();
        
       revolver.cargarRevolver();
       
     
        for (int i=0;i<6;i++)
        {        
          ServicioJugador jugador = new ServicioJugador();
          jugador.cargar(i);
            jugadores.add(jugador);
        }
       
        
       juego.cargarJuego(revolver,jugadores);
       
       juego.ronda();
        

       
               
               
    }
    
}
