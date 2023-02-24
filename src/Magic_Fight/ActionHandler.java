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
            Var.inGameMenu = false;
            Var.inGameGuide = false;
            Var.buttonStart.setVisible( false );
            Var.buttonStartGuide.setVisible( false );
            Var.buttonGuide.setVisible( false );
            Var.buttonExit.setVisible( false );
            Var.StartGuide.setVisible( false );

            KeyHandler.tempKeyhandler = 0;
            //pauseMenuT.tempPauseMenu = 0;

            if ( Var.panelGame == null ){
                Var.panelGame = new PanelGame();
            }
            Var.panelStart.setVisible( false );
            Var.panelGame.requestFocus();
            Var.jf1.requestFocus();
        }

        else if(e.getSource()==Var.buttonStartGuide){
            Var.inStartMenu = false;
            Var.inStartGuide = true;
            Var.inGame = false;
            Var.inGameMenu = false;
            Var.inGameGuide = false;
            Var.buttonStart.setVisible( true );
            Var.buttonStartGuide.setVisible( false );
            Var.buttonGuide.setVisible( false );
            Var.buttonExit.setVisible( false );
            Var.StartGuide.setVisible( true );

            KeyHandler.tempKeyhandler = 1;

            Var.jf1.requestFocus();
        }

        else if(e.getSource()==Var.buttonGuide){
            Var.inStartMenu = false;
            Var.inStartGuide = true;
            Var.inGame = false;
            Var.inGameMenu = false;
            Var.inGameGuide = false;
            Var.buttonStart.setVisible( false );
            Var.buttonStartGuide.setVisible( false );
            Var.buttonGuide.setVisible( false );
            Var.buttonExit.setVisible( true );

            KeyHandler.tempKeyhandler = 1;
            //pauseMenuT.tempPauseMenu = 1;

            Var.jf1.requestFocus();
        }

        else if(e.getSource()==Var.buttonExit){
            Var.inStartMenu = true;
            Var.inStartGuide = false;
            Var.inGame = false;
            Var.inGameMenu = false;
            Var.inGameGuide = false;
            Var.buttonStart.setVisible( true );
            Var.buttonStartGuide.setVisible( true );
            Var.buttonGuide.setVisible( false );
            Var.buttonExit.setVisible( false );

            KeyHandler.tempKeyhandler = 1;
            // pauseMenuT.tempPauseMenu = 0;

            Var.jf1.requestFocus();

        }

    }
}
