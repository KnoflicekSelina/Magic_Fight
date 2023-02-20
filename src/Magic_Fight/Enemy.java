package Magic_Fight;

import javax.swing.*;
import java.awt.*;


public class Enemy extends JLabel {

    public Enemy() {
        super();
        ImageIcon eIcon = new ImageIcon ("png/DO-IT_Gegner_Klein_1.png" );
        this.setBounds( 525, 295, 216, 300 );

        this.setVisible( true );

        eIcon.setImage( eIcon.getImage().getScaledInstance(216,300, Image.SCALE_DEFAULT) );
        this.setIcon( eIcon );
    }

}
