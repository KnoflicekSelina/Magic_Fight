package Magic_Fight;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static Magic_Fight.Var.attackOne;
import static Magic_Fight.Var.attackThree;

public class KeyHandler implements KeyListener {
    static int tempKeyhandler = 0 ;


    public void keyTyped( KeyEvent e ) {
    }



    public void keyPressed( KeyEvent e ) {
        // Player Attacken 1, 2, 3 fuer zusaetzliche Tastaturauswahl
        if ( e.getKeyCode() == KeyEvent.VK_1 ) {
            if ( Var.attackOne.isEnabled() ){
                Var.attackOne.setSelected( true );
            }
        }

        if ( e.getKeyCode() == KeyEvent.VK_2 ) {
            if ( Var.attackTwo.isEnabled() ){
                Var.attackTwo.setSelected( true );
            }
        }

        if ( e.getKeyCode() == KeyEvent.VK_3 ) {
            if ( Var.attackThree.isEnabled() ){
                Var.attackThree.setSelected( true );
            }
        }

    }

    public void keyReleased( KeyEvent e ) {

    }
}