public class SearchorDelete 
{
    public static void searchSong(Playlistv2 playlist, String songName) 
    {
        Canciones current = playlist.inicio;
        boolean found = false;

        while (current != null) 
        {
            if (current.nombre.equalsIgnoreCase(songName)) 
            {
                System.out.println("Canción encontrada: " + current.nombre + " de " + current.artista);
                found = true;
                break;
            }
            current = current.siguienteCanciones;
        }

        if (!found) 
        {
            System.out.println("Canción no encontrada en la playlist.");
        }
    }

    public static void deleteSong(Playlistv2 playlist, String songName) 
    {
        Canciones current = playlist.inicio;
        Canciones previous = null;

        while (current != null) 
        {
            if (current.nombre.equalsIgnoreCase(songName)) 
            {
                if (previous == null) 
                {
                    // Eliminar la primera canción
                    playlist.inicio = current.siguienteCanciones;
                } else 
                {
                    // Eliminar una canción intermedia o final
                    previous.siguienteCanciones = current.siguienteCanciones;
                }
                playlist.numCanciones--;
                System.out.println("Canción eliminada: " + current.nombre);
                return;
            }
            previous = current;
            current = current.siguienteCanciones;
        }

        System.out.println("Canción no encontrada para eliminar.");
    }
}
