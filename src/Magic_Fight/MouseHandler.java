package Magic_Fight;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {
    public MouseHandler() {
    }

    public void mouseClicked( MouseEvent e ) {
        if ( e.getButton() == MouseEvent.BUTTON1 ) {
            Var.mouseClick = true;

            if (e.getSource().getClass() == Enemy.class) {

            }
        }

        if (Var.mouseClick){

        }

    }

    public void mousePressed( MouseEvent e ) {
    }

    public void mouseReleased( MouseEvent e ) {
    }

    public void mouseEntered( MouseEvent e ) {
    }

    public void mouseExited( MouseEvent e ) {
    }
}
