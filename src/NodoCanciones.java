public class NodoCanciones {
    public Canciones cancion;
    public NodoCanciones siguiente;

    public NodoCanciones(Canciones cancion) {
        this.cancion = cancion;
        this.siguiente = null;
    }

    public Canciones getCancion() {
        return cancion;
    }

    public void setCancion(Canciones cancion) {
        this.cancion = cancion;
    }

    public NodoCanciones getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCanciones siguiente) {
        this.siguiente = siguiente;
    }
}
