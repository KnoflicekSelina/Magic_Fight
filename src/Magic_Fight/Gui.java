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

        // Tastatur und Maus
        Var.jf1.addKeyListener( new KeyHandler() );
        Var.jf1.addMouseListener( new MouseHandler() );



        JPanelWithBackground jP = new JPanelWithBackground("png/DO-IT_Hintergrund_Klein_1.png" );
        Var.jf1.getContentPane().add( jP );
        jP.setVisible( true );
        jP.setLayout( null );
        jP.setBounds( 0 , 0 , Var.screenwidth, Var.screenhigh );

        // Grundfarbe Fenster
        jP.setBackground(Color.DARK_GRAY);

        // Sichtbarkeit Fenster
        Var.jf1.setVisible( true );


        jP.add( Var.buttonStart );
        jP.add( Var.buttonGuide );


        /* // Button
        Var.buttonStart = new JButton();
        Var.buttonStart.setText( "Start" );
        Var.buttonStart.setBounds( 30, 50, 225, 50);
        Var.buttonStart.setVisible( true );
        Var.buttonStart.addActionListener( new ActionHandler() );
        Var.buttonStart.setBackground( new Color( 0, 255, 115 ) );
        Var.buttonStart.setFont( new Font("Arial", Font.BOLD, 40 ) );
        Var.buttonStart.setBorder( null );
        Var.buttonStart.setFocusPainted( false );
        Var.buttonStart.addMouseListener( new MouseAdapter() {

            public void mouseEntered( MouseEvent evt ) {
                Var.buttonStart.setBackground( new Color( 0, 230, 115 ) );
                Var.buttonStart.setForeground(Color.BLACK);
            }
            public void mouseExited( MouseEvent evt ) {
                Var.buttonStart.setBackground( new Color( 0, 255, 115 ) );
                Var.buttonStart.setForeground(Color.BLACK);
            }
        });
        Var.buttonGuide = new JButton();
        Var.buttonGuide.setText( "Anleitung" );
        Var.buttonGuide.setBounds( 30, 50, 325, 50);
        Var.buttonGuide.setVisible( true );
        Var.buttonGuide.addActionListener( new ActionHandler() );
        Var.buttonGuide.setBackground( new Color( 0, 255, 115 ) );
        Var.buttonGuide.setFont( new Font("Arial", Font.BOLD, 30 ) );
        Var.buttonGuide.setBorder( null );
        Var.buttonGuide.setFocusPainted( false );
        Var.buttonGuide.addMouseListener(new MouseAdapter() {

            public void mouseEntered( MouseEvent evt ) {
                Var.buttonGuide.setBackground( new Color( 0, 230, 115 ) );
                Var.buttonGuide.setForeground(Color.BLACK);
            }
            public void mouseExited( MouseEvent evt ) {
                Var.buttonGuide.setBackground( new Color( 0, 255, 115 ) );
                Var.buttonGuide.setForeground(Color.BLACK);
            }
        });

        Var.buttonExit = new JButton();
        Var.buttonExit.setText( "Zurück zum Start" );
        Var.buttonExit.setBounds( 30, 50, 425, 50);
        Var.buttonExit.setVisible( true );
        Var.buttonExit.addActionListener( new ActionHandler() );
        Var.buttonExit.setBackground( new Color( 0, 255, 115 ) );
        Var.buttonExit.setFont( new Font("Arial", Font.BOLD, 30 ) );
        Var.buttonExit.setBorder( null );
        Var.buttonExit.setFocusPainted( false );
        Var.buttonExit.addMouseListener( new MouseAdapter() {

            public void mouseEntered( MouseEvent evt ) {
                Var.buttonExit.setBackground( new Color( 0, 230, 115 ) );
                Var.buttonExit.setForeground(Color.BLACK);
            }
            public void mouseExited( MouseEvent evt ) {
                Var.buttonExit.setBackground( new Color( 0, 255, 115 ) );
                Var.buttonExit.setForeground(Color.BLACK);
            }
        }); */



    }
}
