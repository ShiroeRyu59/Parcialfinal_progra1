public class SearchorDelete 
{
    // Método para buscar una canción en la playlist
    public static void searchSong(Playlist playlist, String songName) {
        Canciones song = playlist.findSong(songName);
        if (song != null) {
            System.out.println("Canción encontrada: " + song);
        } else {
            System.out.println("Canción no encontrada.");
        }
    }

    // Método para eliminar una canción de la playlist
    public static void deleteSong(Playlist playlist, String songName) {
        boolean removed = playlist.removeSong(songName);
        if (removed) {
            System.out.println("Canción eliminada exitosamente.");
        } else {
            System.out.println("No se pudo eliminar la canción. Puede que no exista.");
        }
    }
}
