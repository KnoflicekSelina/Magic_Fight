package Magic_Fight;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        // Menue Buttons
        if(e.getSource()==Var.buttonStart){
            Var.inStartMenu = false;
            Var.inStartGuide = false;
            Var.inGame = true;
            Var.buttonStart.setVisible( false );
            Var.buttonStartGuide.setVisible( false );
            Var.buttonExit.setVisible( false );
            Var.StartGuide.setVisible( false );

            KeyHandler.tempKeyhandler = 0;


            if ( Var.panelGame == null ){
                Var.panelGame = new PanelGame();
            }
            Var.panelStart.setVisible( false );
            Var.panelGame.requestFocus();
            Var.JFrame1.requestFocus();
        }

        else if(e.getSource()==Var.buttonStartGuide){
            Var.inStartMenu = false;
            Var.inStartGuide = true;
            Var.inGame = false;
            Var.buttonStart.setVisible( true );
            Var.buttonStartGuide.setVisible( false );
            Var.buttonExit.setVisible( false );
            Var.StartGuide.setVisible( true );

            KeyHandler.tempKeyhandler = 1;

            Var.JFrame1.requestFocus();
        }


        else if(e.getSource()==Var.buttonExit){
            Var.inStartMenu = true;
            Var.inStartGuide = false;
            Var.inGame = false;
            Var.buttonStart.setVisible( true );
            Var.buttonStartGuide.setVisible( true );
            Var.buttonExit.setVisible( false );

            KeyHandler.tempKeyhandler = 1;
            // pauseMenuT.tempPauseMenu = 0;

            Var.JFrame1.requestFocus();

        }

        // Player Angriffe
        else if( e.getSource().getClass() == PlayerAttackButton.class ) {

            if ( e.getSource() != Var.attackOne )  {
                Var.attackOne.setSelected( false );
            }

            if ( e.getSource() != Var.attackTwo ) {
                Var.attackTwo.setSelected( false );
            }

            if ( e.getSource() != Var.attackThree ) {
                Var.attackThree.setSelected( false );
            }

        }




    }
}
