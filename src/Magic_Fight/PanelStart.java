package Magic_Fight;


import javax.swing.*;
import java.awt.*;

public class PanelStart extends JPanelWithBackground {

    private static final long serialVersionUID = 1L;

        public PanelStart() {
            // Hintergrundbild Start Menue
            super("png/DO-IT_Hintergrund_Klein_1.png");

            this.setBackground( Color.DARK_GRAY );
            Var.jf1.getContentPane().add( this );
            this.setVisible( true );
            this.setLayout( null );
            this.setBounds( 0 , 0 , Var.screenwidth , Var.screenhigh );


            // Buttons im Start Menue
            this.add( Var.buttonStart );
            this.add( Var.buttonStartGuide );
            this.setVisible( true );


            // Anleitung im StartGuide
            Var.StartGuide = new JTextArea( """
                    Hier steht die Anleitung ...............
                    Hier beginnt der neue Absatz ...................
                    """ );
            Var.StartGuide.setLineWrap( true );
            Var.StartGuide.setEditable( false );
            Var.StartGuide.setOpaque( false );
            Var.StartGuide.setWrapStyleWord( true );
            Var.StartGuide.setFont( new Font("Arial", Font.BOLD, 25 ) );
            Var.StartGuide.setForeground( Color.BLACK );
            Var.StartGuide.setBounds(200,350,900,300 );
            Var.StartGuide.setVisible( false );
            this.add( Var.StartGuide );

        }



}