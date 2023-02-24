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
            Var.attackOne.setSelected( true );
        }

        if ( e.getKeyCode() == KeyEvent.VK_2  ) {
            Var.attackTwo.setSelected( true );
        }

        if ( e.getKeyCode() == KeyEvent.VK_3  ) {
            Var.attackThree.setSelected( true );
        }



        // ESC Tastatur eingabe für Pausemenue
        if ( tempKeyhandler == 0 ){
            // Pause Menue
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                Var.inStartMenu = false;
                Var.inGame = false;
                Var.inGameGuide = false;
                Var.inStartGuide = false;
                Var.inGameMenu = true;
                Var.buttonStart.setVisible( false );
                Var.buttonStartGuide.setVisible( false );
                Var.buttonGuide.setVisible( true );
                Var.buttonExit.setVisible( true );
                tempKeyhandler ++;

            }
        }
        else if (tempKeyhandler == 1) {
            if( e.getKeyCode() == KeyEvent.VK_ESCAPE ) {
                Var.inStartMenu = false;
                Var.inGame = true;
                Var.inGameGuide = false;
                Var.inGameMenu = false;
                Var.inStartGuide = false;
                Var.buttonStart.setVisible( false );
                Var.buttonStartGuide.setVisible( false );
                Var.buttonGuide.setVisible( false );
                Var.buttonExit.setVisible( false );
                tempKeyhandler --;
                // pauseMenuT.tempPauseMenu = 0;
            }
        }
    }

    public void keyReleased( KeyEvent e ) {

    }
}