public class SearchorDelete 
{
    // Método para buscar una canción en la playlist
    public static void searchSong(Playlist playlist, String songName) {
        Canciones song = playlist.findSong(songName);
        try {
            if (song != null) {
                System.out.println("Canción encontrada: " + song);
            } else {
                System.out.println("Canción no encontrada en la playlist.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al buscar la canción: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para eliminar una canción de la playlist
    public static void deleteSong(Playlist playlist, String songName) {
        boolean removed = playlist.removeSong(songName);
        try {
            if (removed) {
                System.out.println("Canción '" + songName + "' eliminada de la playlist.");
            } else {
                System.out.println("No se encontró la canción '" + songName + "' para eliminar.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al eliminar la canción: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
