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
        song Song = new song("Paradise City", "Guns N' Roses", 2319032);
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
