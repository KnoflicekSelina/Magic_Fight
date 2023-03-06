package Magic_Fight;


import javax.swing.*;
import java.awt.*;

public class PanelStart extends JPanelWithBackground {

    // Start Menue
    private static final long serialVersionUID = 1L;

        public PanelStart() {
            // Hintergrundbild Start Menue
            super("png/DO-IT_Hintergrund.png");

            this.setBackground( Color.DARK_GRAY );
            Var.JFrame1.getContentPane().add( this );
            this.setVisible( true );
            this.setLayout( null );
            this.setBounds( 0 , 0 , Var.screenwidth , Var.screenheight);
            this.setOpaque(true);


            // Buttons im Start Menue
            this.add( Var.buttonStart );
            this.add( Var.buttonStartGuide );
            this.setVisible( true );


            // Anleitung im StartGuide
            Var.StartGuide = new JTextArea( """
                    
                        Tastenbelegung:
                        Tastatur 1 : Wählt den Angriff 1 an - macht 10 Schaden, cooldown 5 Sekunden
                        Tastatur 2 : Wählt den Angriff 2 an - macht 20 Schaden, cooldown 10 Sekunden
                        Tastatur 3 : Wählt den Angriff 3 an - macht 30 Schaden, cooldown 15 Sekunden
                        Mausklick links (1) zum Auswählen
                    
                        So wird gespielt:
                        Um dem Gegner Schaden zu machen wählt man einen der 3 Angriffe aus mit der Tastatur 
                        oder durch Mausklick und wählt danach den Gegner mit dem Mausklick an.
                    
                        Gegnerische Attacken werden durch Mausklick Abgewehrt.
                        Gegner Attacke 1 ( Blau )   - macht 30 Schaden, 10 Punkte, Castzeit 6 Sekunden
                        Gegner Attacke 2 ( Grün )   - macht 20 Schaden, 20 Punkte, Castzeit 4 Sekunden
                        Gegner Attacke 3 ( Orange ) - macht 10 Schaden, 30 Punkte, Castzeit 2 Sekunden
                    
                        Gewonnen ist wenn das Leben des Gegners auf 0 ist.
                        Verloren ist wenn das eigene Leben auf 0 gesunken ist.
                    """ );

            Var.StartGuide.setLineWrap( true );
            Var.StartGuide.setEditable( false );
            Var.StartGuide.setOpaque( true );
            Var.StartGuide.setWrapStyleWord( true );
            Var.StartGuide.setFont( new Font("Arial",Font.BOLD, 16) );
            Var.StartGuide.setForeground( Color.WHITE );
            Var.StartGuide.setBackground( Color.DARK_GRAY );
            Var.StartGuide.setBounds(220,310,700,300 );
            Var.StartGuide.setSize( Var.StartGuide.getPreferredSize() );
            Var.StartGuide.setVisible( false );
            this.add( Var.StartGuide );

        }



}