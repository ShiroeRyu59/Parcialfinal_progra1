public class Playlistv2 
{
    protected Canciones inicio, fin;
    protected int numCanciones;
    protected String nombre;    
    public Playlistv2(String nombre) 
    {
        this.nombre = nombre;
        this.inicio = null;
        this.fin = null;
        this.numCanciones = 0;
    }
}
