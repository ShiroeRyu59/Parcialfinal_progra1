public class App_Reproductor {
    //Joaquín Enrique Santizo Sujuy
    //Carne: 0900-21-19128
    // Variante A - reproductor de música
    public static void main(String[] args) throws Exception 
    {
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
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre de la nueva playlist: ");
                    String nombrePlaylist = scanner.nextLine();
                    Playlistv2 nuevaPlaylist = new Playlistv2(nombrePlaylist);
                    System.out.println("Playlist '" + nombrePlaylist + "' creada exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingresa el nombre de la playlist a la que deseas agregar canciones: ");
                    String nombrePlaylistAgregar = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Ingresa el nombre de la playlist que deseas reproducir: ");
                    String nombrePlaylistReproducir = scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Ingresa el nombre de la canción que deseas buscar: ");
                    String nombreCancionBuscar = scanner.nextLine();
                    break;
                case 5:
                    System.out.print("Ingresa el nombre de la canción que deseas eliminar: ");
                    String nombreCancionEliminar = scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Saliendo del reproductor. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Por favor, ingresa un número válido.");
        }
    }
}
