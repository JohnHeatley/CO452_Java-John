package cw1;
import java.util.ArrayList;
import helpers.*;

//this creates the public class used for the whole program
public class musicApp
{
    private ArrayList<song> songs;

    public musicApp()
    {
        songs = new ArrayList<song>();
        populateSongs();
        doMainMenu();
    }

    public void doMainMenu()
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
                case 3: printAllSongs(0);break;
                case 4: printTopSongs();break;
                case 5: wantToExit = true; break;
                default: System.out.println("\nNot valid!\n");
            }
        }
    }

    //this is the initial menu of options that comes up upon launching the program
    public static void displayMenu()
    {
        System.out.println("\n1. Add Song");
        System.out.println("2. Delete Song");
        System.out.println("3. Pring All Songs");
        System.out.println("4. Print Top Songs");
        System.out.println("5. Exit\n");
    }

    //this is a list of pre added songs to populate the initial list
    private   void populateSongs()
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
    
    //this is the method for adding songs to the list, requiring user input for the title, artist and play count
    private void addSong()
    {
        System.out.println("\nAdding a Song\n");
        String title = InputReader.getString("Please enter the title for the new song >");
        String name = InputReader.getString("Please enter the artist's name for the new song >");
        int count = InputReader.getInt("Please enter the number of plays for the new song >");

        song Song = new song(title, name, count);
        songs.add(Song);
    }

    //this is the method for deleting a song currently in the list, this requires the user to input the name of the song
    private void deleteSong()
    {
        printAllSongs(0);
        song Song = searchSong();
        if(Song != null)
            {
            songs.remove(Song);
            }
        else System.out.println("Unable to find song.");
        printAllSongs(0);
    }

    //this is the method used to actually locate the song the user inputs to be able to remove it from the list
    private song searchSong()
    {
        String removeConfirm = InputReader.getString("Enter the title of the song you wish to remove >");
        for(song Song : songs)
        {
            if(Song.getTitle().contains(removeConfirm))
                return Song;
        }
        return null;
    }

    //this method prints all the songs that are currently in the list of songs
    private void printAllSongs(int count)
    {
        System.out.println("\nPrinting All Songs\n");

        for(song Song : songs)
        {
            if(Song.getNumberOfPlays()>count)
                Song.print();
        }

        System.out.println();
    }

    //this method asks the user to input a number for the amount of plays a song has and displays all songs above that count
    private void printTopSongs()
    {
        int countTotal = InputReader.getInt("Enter a number of plays to see all songs above that playcount >");
        printAllSongs(countTotal);
    }

    
}
