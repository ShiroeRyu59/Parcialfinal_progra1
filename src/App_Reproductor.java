public class App_Reproductor {
    //Joaquín Enrique Santizo Sujuy
    //Carne: 0900-21-19128
    // Variante A - reproductor de música
    public static void main(String[] args) throws Exception {
        System.out.println("<Bienvenido al reproductor de música!>");
        System.out.println("Selecciona la opción de tu interés: ");
        System.out.println("1. Crear una playlist");
        System.out.println("2. Agregar canciones a una playlist");
        System.out.println("3. Reproducir una playlist"); 
        System.out.println("4. Buscar una canción dentro de todas las playlists");
        System.out.println("5. Eliminar una canción de una playlist");  
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Ingresa el nombre de la playlist: ");
                    String playlistName = scanner.nextLine();
                    Playlist playlist = new Playlist(playlistName);
                    System.out.println("Playlist '" + playlist.getName() + "' creada exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingresa el nombre de la canción: ");
                    String songName = scanner.nextLine();
                    System.out.print("Ingresa el artista de la canción: ");
                    String artist = scanner.nextLine();
                    System.out.print("Ingresa la duración de la canción (en segundos): ");
                    int duration = scanner.nextInt();
                    Canciones song = new Canciones(songName, artist, duration);
                    playlist.addSong(song);
                    System.out.println("Canción '" + song.getNombre() + "' agregada a la playlist.");
                    break;
                case 3:
                    playlist.play();
                    break;
                case 4:
                    System.out.print("Ingresa el nombre de la canción a buscar: ");
                    String searchSongName = scanner.nextLine();
                    SearchorDelete.searchSong(playlist, searchSongName);
                    break;
                case 5:
                    System.out.print("Ingresa el nombre de la canción a eliminar: ");
                    String deleteSongName = scanner.nextLine();
                    SearchorDelete.deleteSong(playlist, deleteSongName);
                    break;
                case 6:
                    System.out.println("Saliendo del reproductor. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 6.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Gracias por usar el reproductor de música. ¡Hasta luego!");
        }

        
    }
}
