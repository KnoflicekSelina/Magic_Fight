package Magic_Fight;

import javax.swing.*;

public class PointCounter extends JLabel {
    public PointCounter( int points ){ // --> Konstruktor
        super();
        this.setPoints( points );
    }

    public int getPoints() {
        return points;
    }

    public void setPoints( int points ) {
        this.points = points;
        this.setText(  "Punkte: " + String.valueOf( points )  );
    }

    private int points;

}
