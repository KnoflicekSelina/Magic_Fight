package Magic_Fight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Var {
    // Grundgerüst
    static JFrame jf1;
    static int screenwidth = 1246; static int screenhigh = 795;
    static int backgroundY = 0;  // <-- ???


    static int Enemy;   // <-- ???



    // Leben und Punkte
    static int points = 0;

    static LiveCounter enemyLive;
    static LiveCounter playerLive;


    // Tastatur und Maus
    static boolean mouseClick = false;


    static boolean inStartMenu = true; // Menü das gestartet wird bevor gespielt wird
    static boolean inStartGuide = false; // Hilfe die geöffent werden kann bevor das Spiel startet
    static boolean inGame = false; // Im Spiel
    static boolean inGameMenu = false; // Im Spiel das Pausemenü wo Zurück zum Satart und Hilfe geöffnet werden kann
    static boolean inGameGuide = false; // Hilfe die im Pausemenü des Spiels geöffnet werden kann


    // Panel die angezeigt werden
    static PanelStart panelStart;
    static PanelGame panelGame;



    // Buttons im Menue
    static JButton buttonStart; // Startet das Spiel
    static JButton buttonStartGuide; // Öffnet Hilfe bevor das Spiel Startet
    static JButton buttonGuide; // Öffnet Hilfe im Pausemenü im Spiel
    static JButton buttonExit; // Schickt einen zum Startmenü zurück


    //Player Angriffe
    static PlayerAttackButton attackOne;
    static PlayerAttackButton attackTwo;
    static PlayerAttackButton attackThree;

    static boolean victory = false;   // <-- ???
    static boolean gameOver = false;   // <-- ???



    // Anleitung Text im Start Guide
    static JTextArea StartGuide;

    public Var() {
        // Buttons --> Richtige Formatierung, Farbe und Position
        Var.buttonStart = ( new JButton("Start" ) );
        Var.buttonStart.setSize( 300, 50 );
        Var.buttonStart.setLocation( 465, 250 );
        Var.buttonStart.addActionListener( new ActionHandler() );
        Var.buttonStart.setBackground( new Color(147, 0, 29 ) );
        Var.buttonStart.setFont( new Font("Arial", Font.BOLD, 30 ) );
        Var.buttonStart.setForeground( Color.BLACK );
        Var.buttonStart.setBorder( null );
        Var.buttonStart.setFocusPainted( false );
        Var.buttonStart.setVisible( true );
        Var.buttonStart.addMouseListener( new MouseAdapter() {

            public void mouseEntered( MouseEvent evt ) {
                Var.buttonStart.setBackground( new Color(192, 0, 29 ) );
                Var.buttonStart.setForeground( Color.BLACK );
            }

            public void mouseExited( MouseEvent evt ) {
                Var.buttonStart.setBackground( new Color(147, 0, 29 ) );
                Var.buttonStart.setForeground( Color.BLACK );
            }
        });
        Var.buttonStartGuide = ( new JButton("Anleitung" ) );
        Var.buttonStartGuide.setSize( 300, 50 );
        Var.buttonStartGuide.setLocation( 465, 350 );
        Var.buttonStartGuide.addActionListener( new ActionHandler() );
        Var.buttonStartGuide.setBackground( new Color(147, 0, 29 ) );
        Var.buttonStartGuide.setFont( new Font("Arial", Font.BOLD, 30 ) );
        Var.buttonStartGuide.setForeground( Color.BLACK );
        Var.buttonStartGuide.setBorder( null );
        Var.buttonStartGuide.setFocusPainted( false );
        Var.buttonStartGuide.setVisible( true );

        Var.buttonStartGuide.addMouseListener( new MouseAdapter() {

            public void mouseEntered ( MouseEvent evt ){
                Var.buttonStartGuide.setBackground( new Color(192, 0, 29 ) );
                Var.buttonStartGuide.setForeground( Color.BLACK );
            }
            public void mouseExited ( MouseEvent evt ){
                Var.buttonStartGuide.setBackground( new Color(147, 0, 29 ) );
                Var.buttonStartGuide.setForeground( Color.BLACK );
            }


        });
        Var.buttonGuide = ( new JButton("Anleitung" ) );
        Var.buttonGuide.setSize( 300, 50 );
        Var.buttonGuide.setLocation( 465, 350 );
        Var.buttonGuide.addActionListener( new ActionHandler() );
        Var.buttonGuide.setBackground( new Color(147, 0, 29 ) );
        Var.buttonGuide.setFont( new Font("Arial", Font.BOLD, 30 ) );
        Var.buttonGuide.setForeground( Color.BLACK );
        Var.buttonGuide.setBorder( null );
        Var.buttonGuide.setFocusPainted( false );
        Var.buttonGuide.setVisible( true );
        Var.buttonGuide.addMouseListener( new MouseAdapter() {

            public void mouseEntered ( MouseEvent evt ){
                Var.buttonGuide.setBackground( new Color(192, 0, 29 ) );
                Var.buttonGuide.setForeground( Color.BLACK );
            }
            public void mouseExited ( MouseEvent evt ){
                Var.buttonGuide.setBackground( new Color(147, 0, 29 ) );
                Var.buttonGuide.setForeground( Color.BLACK );
            }
        });
        Var.buttonExit = ( new JButton("Zurück zum Hauptmenü" ) );
        Var.buttonExit.setSize( 300, 50 );
        Var.buttonExit.setLocation( 465, 450 );
        Var.buttonExit.addActionListener( new ActionHandler() );
        Var.buttonExit.setBackground( new Color( 147, 0, 29) );
        Var.buttonExit.setFont( new Font("Arial", Font.BOLD, 30 ) );
        Var.buttonExit.setForeground( Color.BLACK );
        Var.buttonExit.setBorder( null );
        Var.buttonExit.setFocusPainted( false );
        Var.buttonExit.setVisible( true );
        Var.buttonExit.addMouseListener( new MouseAdapter() {

            public void mouseEntered( MouseEvent evt ) {
                Var.buttonExit.setBackground( new Color( 192, 0, 29  ) );
                Var.buttonExit.setForeground( Color.BLACK );
            }
            public void mouseExited( MouseEvent evt ) {
                Var.buttonExit.setBackground( new Color( 147, 0, 29 ) );
                Var.buttonExit.setForeground( Color.BLACK );
            }
        });
    }
}
