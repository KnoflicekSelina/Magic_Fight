package Magic_Fight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==Var.buttonStart){
            Var.inGame = true;
            Var.inMenu = false;
            Var.buttonStart.setVisible( true );
            Var.buttonGuide.setVisible( true );
            Var.buttonExit.setVisible( false );

            KeyHandler.tempKeyhandler = 0;
            updating.tempupdating = 0;

            Var.jf1.requestFocus();
        }

        else if(e.getSource()==Var.buttonGuide){
            Var.inGame = true;
            Var.inMenu = false;
            Var.buttonStart.setVisible( true );
            Var.buttonGuide.setVisible( true );
            Var.buttonExit.setVisible( true );

            KeyHandler.tempKeyhandler = 0;
            updating.tempupdating = 0;

            Var.jf1.requestFocus();
        }

        else if(e.getSource()==Var.buttonExit){
            Var.inGame = true;
            Var.inMenu = false;
            Var.buttonStart.setVisible( true );
            Var.buttonGuide.setVisible( true );
            Var.buttonExit.setVisible( true );

            KeyHandler.tempKeyhandler = 0;
            updating.tempupdating = 0;

            Var.jf1.requestFocus();
                System.exit(0);
        }

    }
}
