
package Entidades;


public class Jugador {
//    esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
    private int id;
    private String nombre;
    private boolean muerto;

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
