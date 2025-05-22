/* used for iterating a collecton of objects without exposing underlying implementation */
package BehaviouralDesignPattern;

import java.util.ArrayList;

/* traditional approach for iteration */
class Song {
    public String name;
    public String id;
    public String artist;

    Song(String name, String id, String artist) {
        this.name = name;
        this.id = id;
        this.artist = artist;
    }
}

class Playlist implements PlaylistIterator {

    public ArrayList<Song> songs = new ArrayList<Song>();
    public String name;
    public Integer index;

    Playlist(String name) {
        this.name = name;
        this.index=0;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public boolean hasNext(int index) {
        if (index + 1 >= songs.size()) {
            return false;
        }
        return true;
    }

    public void next(int index) {
        System.out.println(songs.get(index).name);
        index++;
    }

    public void displayList() {
        for (int i = 0; i < songs.size(); i++) {

            if (i + 1 == 1) {
                System.out.println("name of " + (i + 1) + "st song: " + songs.get(i).name);

            } else if (i + 1 == 2) {
                System.out.println("name of " + (i + 1) + "nd song: " + songs.get(i).name);

            } else if (i + 1 == 3) {

                System.out.println("name of " + (i + 1) + "rd song: " + songs.get(i).name);
            } else {
                System.out.println("name of " + (i + 1) + "th song: " + songs.get(i).name);

            }
        }
    }
}

interface PlaylistIterator {
    public boolean hasNext(int index);

    public void next(int index);
}

public class iteratorDesignPattern {
    public static void main(String[] args) {

        Playlist partymix = new Playlist("partymix ");
        Song song1 = new Song("party to banti hai", "123", "arijit singh");
        Song song2 = new Song("baarishein", "234", "anuv jain");
        partymix.addSong(song1);
        partymix.addSong(song2);
        partymix.displayList();

    }
}
