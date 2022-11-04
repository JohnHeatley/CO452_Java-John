package cw1;

//This makes the class for the songs and provides the way to hold thne variables needed in the array
public class song 
{

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
        System.out.print(title + " by " + artist + " plays:" + numberOfPlays + "\n");
    }

    public String getTitle()
    {
        return title;
    }

    public int getNumberOfPlays()
    {
        return numberOfPlays;
    }
}
