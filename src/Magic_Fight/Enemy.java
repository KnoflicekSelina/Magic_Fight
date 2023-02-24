package Magic_Fight;

import javax.swing.*;
import java.awt.*;


public class Enemy extends JLabel {

    // Gegner Icon Bild, Groesse und Possition
    public Enemy() {
        super();
        ImageIcon enemyIcon = new ImageIcon ("png/DO-IT_Gegner_Klein_1.png" );
        this.setBounds( 510, 270, 220, 348 );

        this.setVisible( true );

        enemyIcon.setImage( enemyIcon.getImage().getScaledInstance(216,300, Image.SCALE_DEFAULT) );
        this.setIcon( enemyIcon );


        this.addMouseListener( new MouseHandler() );


    }

}
