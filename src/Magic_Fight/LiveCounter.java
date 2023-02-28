package Magic_Fight;

import javax.swing.*;

public class LiveCounter extends JLabel {

    public LiveCounter( int live ){ // --> Konstruktor
        super();
        this.initialLive = live;
        this.setLive( live );
    }

    public int getLive() {
        return live;
    }

    public void setLive( int live ) {
        this.live = live;
        this.setText( "Leben: " + String.valueOf( live ) + "/" + String.valueOf( initialLive ) );
    }

    private int live;
    private int initialLive;
}
