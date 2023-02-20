package Magic_Fight;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Gui {
    public Gui() {
        //Fenster
        Var.jf1 = new JFrame();
        Var.jf1.setSize( Var.screenwidth, Var.screenhigh );
        Var.jf1.setLocationRelativeTo( ( Component ) null );
        Var.jf1.setLayout( ( LayoutManager ) null );
        Var.jf1.setTitle( "Magic Fight" );
        Var.jf1.setResizable( false );
        Var.jf1.setDefaultCloseOperation( 3 );
        Var.jf1.requestFocus();

        // Tastatur und Maus Listener
        Var.jf1.addKeyListener( new KeyHandler() );
        Var.jf1.addMouseListener( new MouseHandler() );

        // Sichtbarkeit Fenster
        Var.jf1.setVisible( true );

        Var.panelStart = new PanelStart();


    }
}
