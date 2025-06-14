public class Playlist 
{
    private String name;
    private java.util.List<Canciones> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new java.util.ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSong(Canciones song) {
        songs.add(song);
    }

    public boolean removeSong(String songName) {
        return songs.removeIf(song -> song.getNombre().equalsIgnoreCase(songName));
    }

    public Canciones findSong(String songName) {
        for (Canciones song : songs) {
            if (song.getNombre().equalsIgnoreCase(songName)) {
                return song;
            }
        }
        return null;
    }

    public void play() {
        System.out.println("Reproduciendo playlist: " + name);
        for (Canciones song : songs) {
            System.out.println(song);
        }
    }  
}
