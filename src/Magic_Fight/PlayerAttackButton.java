package Magic_Fight;

import javax.swing.*;

public class PlayerAttackButton extends JToggleButton {

    // Groesse der Buttons
    int width = 50;
    int height = 50;

    // Grundeinstellung der Buttons
    public int cooldown = 5000;
    int playerDamage = 10;


    protected static int count = 0;

    // Groesse und Position der Player Attacks und das Icon Bild
    public PlayerAttackButton(String filename, int cooldown, int playerDamage ) {
        super();
        this.cooldown = cooldown;
        this.playerDamage = playerDamage;
        ImageIcon playerAttackIcon = new ImageIcon ( filename );
        this.setBounds(Var.screenwidth / 2 - ( 3 * width / 2 )  + count * width, 704, width, height );
        this.setVisible( true );
        this.setIcon( playerAttackIcon );
        count++;
        this.addKeyListener( new KeyHandler() );
    }

    int getCooldown() {
        return this.cooldown;
    }
}
