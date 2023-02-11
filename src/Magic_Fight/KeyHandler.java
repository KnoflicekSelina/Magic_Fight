package Magic_Fight;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    static int tempKeyhandler = 0 ;
    public KeyHandler() {
    }

    public void keyTyped( KeyEvent e ) {
        if ( e.getKeyCode() == KeyEvent.VK_1 ) {
            Var.attackOne = true;
        }

        if ( e.getKeyCode() == KeyEvent.VK_2 ) {
            Var.attackTwo = true;
        }

        if ( e.getKeyCode() == KeyEvent.VK_3 ) {
            Var.attackThree = true;
        }

    }


    public void keyPressed( KeyEvent e ) {
        if ( tempKeyhandler == 0 ){
            //Menü
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                Var.inGame = false;
                Var.inMenu = true;
                Var.buttonStart.setVisible( true );
                Var.buttonGuide.setVisible( true );
                Var.buttonExit.setVisible( true );
                tempKeyhandler ++;
            }
        }

        else if (tempKeyhandler == 1) {
            if( e.getKeyCode() == KeyEvent.VK_ESCAPE ) {
                Var.inGame = true;
                Var.inMenu = false;
                Var.buttonExit.setVisible( false );
                Var.buttonGuide.setVisible( false );
                Var.buttonExit.setVisible( false );
                tempKeyhandler --;
                updating.tempupdating = 0;
            }
        }
    }

    public void keyReleased( KeyEvent e ) {
    }
}