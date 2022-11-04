package cw1;

public class song 
{
    private int id;

    private String title;

    private String artist;

    private int numberOfPlays;

    public song(String title, String name, int count)
    {
        this.title = title;
        this.artist = name;
        this.numberOfPlays = count;
    }

    public void print()
    {
        System.out.print(title + " by " + artist + " plays:" + numberOfPlays);
    }
}
