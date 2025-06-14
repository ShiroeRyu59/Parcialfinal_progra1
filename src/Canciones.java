public class Canciones 
{
    private String nombre;
    private String artista;
    private int duracion; // en segundos

    public Canciones(String nombre, String artista, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
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

    @Override
    public String toString() {
        return "Canción: " + nombre + ", Artista: " + artista + ", Duración: " + duracion + " segundos";
    }    
}
