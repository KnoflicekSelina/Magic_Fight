package Magic_Fight;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    static int tempKeyhandler = 0 ;

    public void keyTyped( KeyEvent e ) {

    }


    public void keyPressed( KeyEvent e ) {
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


        // Attacken 1, 2, 3
        if ( e.getKeyCode() == KeyEvent.VK_1 ) {

            //10 p Schaden, 5 Sec Abklingzeit

        }

        if ( e.getKeyCode() == KeyEvent.VK_2 ) {

            //20 p Schaden, 10 Sec Abklingzeit
        }

        if ( e.getKeyCode() == KeyEvent.VK_3 ) {

            //30 p Schaden, 15 Sec Abklingzeit
        }
    }

    public void keyReleased( KeyEvent e ) {
        // Attacken 1, 2, 3
        if ( e.getKeyCode() == KeyEvent.VK_1 ) {

        }

        if ( e.getKeyCode() == KeyEvent.VK_2 ) {

        }

        if ( e.getKeyCode() == KeyEvent.VK_3 ) {

        }
    }
}