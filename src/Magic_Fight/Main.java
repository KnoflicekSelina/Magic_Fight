package Magic_Fight;

public class Main {
    public Main() {
    }

    public static void main( String[] args ) {

        // ButtonStart, ButtonStartGuide, ButtonGuide, ButtonExit -->
        // inStartMenu, inStartGuide, inGame, inGameMenu, inGameGuide
        new ActionHandler();

        // Grundgerüst, Buttons --> Richtige Formatierung, Farbe und Position
        new Var();

        // Fenster, Tastatur und Maus Listener
        new Gui();

    }

}
