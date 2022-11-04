package cw1;
import java.util.ArrayList;
import helpers.*;

public class musicApp
{
    private static ArrayList<song> songs = new ArrayList<>();

    public static void main(String[] args) throws Exception 
    {
        //System.out.println(ConsoleColours.ANSI_BRIGHT_BG_BLUE);
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("\n\n==================================");
        System.out.println("CO452 CW1 Music App");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by John Heatley");
        System.out.println();
        run();
    }

    //private  static void addSomeSongs()
    //{
        //song Song = new song("Paradise City", "Guns N' Roses", 807387102);
       // songs.add(Song);

        //Song = new song("Black Betty", "Ram Jam", 314338990);
        //songs.add(Song);

        //Song = new song("Thunderstruck", "AC/DC", 1033664769);
        //songs.add(Song);

        //Song = new song("Kickstart My Heart", "Motley Crue", 429618926);
        //songs.add(Song);

        //Song = new song("Rebel Yell", "Billy Idol", 273831464);
        //songs.add(Song);

        //Song = new song("No More Mr. Nice Guy", "Alice Cooper", 51735318);
        //songs.add(Song);

       //Song = new song("All Along The Watchtower", "Jimi Hendrix", 562958134);
        //songs.add(Song);

        //Song = new song("The Spirit Of Radio", "Rush", 86743531);
       // songs.add(Song);

        //Song = new song("Living After Midnight", "Judas Priest", 84360212);
       // songs.add(Song);

       // Song = new song("Detroit Rock City", "KISS", 179302761);
       // songs.add(Song);
    //}

    private static void run() 
    {
        doMainMenu();
    }   

    public static void doMainMenu()
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
                case 3: printAllSongs();break;
                case 4: printTopSongs();break;
                case 5: wantToExit = true; break;
                default: System.out.println("\nNow valid!\n");
            }
        }
    }

    private static void addSong()
    {
        System.out.println("\nAdding a Song\n");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name >");
        int count = InputReader.getInt("Please enter the play count >");

        song Song = new song(title, name, count);
        songs.add(Song);
    }

    private static void deleteSong()
    {

    }

    private static void printTopSongs()
    {

    }

    private static void printAllSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        int count = 0;

        for(song Song : songs)
        {
            count++;
            System.out.print("\nSong " + count + ": ");
            Song.print();
        }

        System.out.println();
    }

    public static void displayMenu()
    {
        System.out.println("\n 1. Add Song");
        System.out.println("2. Delete Song");
        System.out.println("3. Pring All Songs");
        System.out.println("4. Prinr Top Songs");
        System.out.println("5. Exit\n");
    }
}
