package Magic_Fight;

import java.awt.*;
import javax.swing.*;

public class Gui {
    public Gui() {

        //Fenster
        Var.JFrame1 = new JFrame();
        Var.JFrame1.setSize( Var.screenwidth, Var.screenheight);
        Var.JFrame1.setLocationRelativeTo( ( Component ) null );
        Var.JFrame1.setLayout( ( LayoutManager ) null );
        Var.JFrame1.setTitle( "Magic Fight" );
        Var.JFrame1.setResizable( false );
        Var.JFrame1.setDefaultCloseOperation( 3 );
        Var.JFrame1.requestFocus();

        // Tastatur und Maus Listener
        Var.JFrame1.addKeyListener( new KeyHandler() );
        Var.JFrame1.addMouseListener( new MouseHandler() );

        // Sichtbarkeit Fenster
        Var.JFrame1.setVisible( true );

        Var.panelStart = new PanelStart();


    }
}
