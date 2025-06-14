public class Canciones
{
    protected String nombre;
    protected String artista;
    protected int duracion; // Duración en segundos
    protected Canciones siguienteCanciones;

    public Canciones(String nombre, String artista, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.siguienteCanciones = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public Canciones getSiguienteCanciones() {
        return siguienteCanciones;
    }

    public void setSiguienteCanciones(Canciones siguienteCanciones) {
        this.siguienteCanciones = siguienteCanciones;
    } 

}
