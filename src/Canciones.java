public class Canciones 
{
    private String nombre;
    private String artista;
    private int duracion; // en segundos
    public Canciones siguienteCanciones;
    public Canciones(String nombre, String artista, int duracion) 
    {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.siguienteCanciones = null;
    }    

}
