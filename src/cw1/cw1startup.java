package cw1;

//this is where the program is ran from and provides the startup message below
public class cw1startup {
    public static void main(String[] args)
    {
        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" CW1 Music App ");
        System.out.println();
        System.out.println(" by John Heatley");
        System.out.println();

        musicApp app = new musicApp();
        app.doMainMenu();
    }
}
