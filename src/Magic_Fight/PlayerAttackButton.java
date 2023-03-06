package Magic_Fight;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerAttackButton extends JToggleButton {

    // Groesse der Buttons
    int width = 50;
    int height = 50;

    // Grundeinstellung der Buttons
    public int cooldown = 5000;
    int playerDamage = 10;

    Timer cooldownTimer;


    protected static int count = 0;

    // Groesse und Position der Player Attacks und das Icon Bild
    public PlayerAttackButton(String filename, int cooldown, int playerDamage ) {
        super();
        ImageIcon playerAttackIcon = new ImageIcon ( filename );
        this.setIcon( playerAttackIcon );

        this.cooldown = cooldown;
        this.playerDamage = playerDamage;

        this.setBounds(Var.screenwidth / 2 - ( 3 * width / 2 )  + count * width, 704, width, height );

        count++;

        this.setVisible( true );
        this.addKeyListener( new KeyHandler() );

    }

    int getCooldown() {
        return this.cooldown;
    }
}
