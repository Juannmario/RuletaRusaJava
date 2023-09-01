
package Entidades;

import Servicio.ServicioJugador;
import Servicio.ServicioRevolver;
import java.util.ArrayList;

public class Juego {
    private ServicioRevolver revolver;
    private ArrayList<ServicioJugador> jugadores;

    public Juego() {
    }

    public Juego(ServicioRevolver revolver, ArrayList<ServicioJugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }



    public ServicioRevolver getRevolver() {
        return revolver;
    }

    public void setRevolver(ServicioRevolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<ServicioJugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<ServicioJugador> jugadores) {
        this.jugadores = jugadores;
    }

    
    
}
