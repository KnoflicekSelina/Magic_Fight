package Magic_Fight;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {
    public MouseHandler() {
    }

    public void mouseClicked( MouseEvent e ) {
        if ( e.getButton() == 1 ) {
            Var.mouseClick = true;
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
