package Magic_Fight;
import java.awt.*;
import javax.swing.*;

// import static Magic_Fight.pauseMenuT.tempPauseMenu;

public class PanelGame extends JPanelWithBackground {

    private static final long serialVersionUID = 1L;



    public PanelGame() {
        // Hintergrundbild Game
        super("png/DO-IT_Hintergrund_Klein_1.png");

            this.setBackground( Color.DARK_GRAY );
            Var.jf1.getContentPane().add( this );
            this.setVisible( true );
            this.setLayout( null );
            this.setBounds( 0 , 0 , Var.screenwidth , Var.screenhigh );



        // Gegner Bild
         Enemy jPE = new Enemy();
         this.add(jPE);
         jPE.setVisible( true );
         jPE.addMouseListener( new MouseHandler() );


        /* // Eigene Angriffe mit den Parametern
        attackObject attackOne = new attackObject( 10 , 30 , 5000 );

        attackObject attackTwo = new attackObject( 20 , 20 , 10000 );

        attackObject attackThree = new attackObject( 30 , 10 , 15000 );
        */



        // Buttons im Spiel Menue
        if(Var.inGame) {

            //
            //
            // Spielinhalt ( Attacken, Punkte und Leben )
            //
            //



        }
        else if( Var.inGameMenu){

        }
    }
}

