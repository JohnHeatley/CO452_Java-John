package cw1;
import java.util.ArrayList;
import helpers.*;

public class musicApp
{
    private ArrayList<song> songs;

    public musicApp()
    {
        songs = new ArrayList<song>();
        addSomeSongs();
        doMainMenu();
    }

    private void addSomeSongs()
    {
        song Song = new song("Paradise City", "Guns N' Roses", 807387102);
        songs.add(Song);

        Song = new song("Black Betty", "Ram Jam", 314338990);
        songs.add(Song);

        Song = new song("Thunderstruck", "AC/DC", 1033664769);
        songs.add(Song);

        Song = new song("Kickstart My Heart", "Motley Crue", 429618926);
        songs.add(Song);

        Song = new song("Rebel Yell", "Billy Idol", 273831464);
        songs.add(Song);

        Song = new song("No More Mr. Nice Guy", "Alice Cooper", 51735318);
        songs.add(Song);

        Song = new song("All Along The Watchtower", "Jimi Hendrix", 562958134);
        songs.add(Song);

        Song = new song("The Spirit Of Radio", "Rush", 86743531);
        songs.add(Song);

        Song = new song("Living After Midnight", "Judas Priest", 84360212);
        songs.add(Song);

        Song = new song("Detroit Rock City", "KISS", 179302761);
        songs.add(Song);
    }

    private void doMainMenu()
    {
        boolean wantToExit = false;

        while(!wantToExit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter song choice >");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs();break;
                case 4: wantToExit = true; break;
            }
        }
    }

    private void displayMenu()
    {
        System.out.println("\n 1. Add Song");
        System.out.println("2. Delete Song");
        System.out.println("3. Pring All Songs");
        System.out.println("4. Exit\n");
    }

    private void addSong()
    {
        System.out.println("\nAdding a Song\n");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name >");
        int count = InputReader.getInt("Please enter the play count >");

        song Song = new song(title, name, count);
        songs.add(Song);
    }

    private void deleteSong()
    {

    }

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        int count = 0;

        for(song Song : songs)
        {
            count++;
            System.out.print("Song " + count + ": ");
            Song.print();
        }

        System.out.println();
    }
}
