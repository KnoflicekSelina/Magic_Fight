package Magic_Fight;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class Var {
    // Grundgerüst
    static JFrame jf1;
    static int screenwidth = 1246; static int screenhigh = 790;
    static int backgroundY = 0;
    static int x = 500, y = 250;


    static int live = 1000, maxLive = 1000;
    static int enemyLive1 = 1000, maxEnemyLive = 1000;

    // Tastatur und Maus
    static boolean attackOne = false; static boolean attackTwo = false; static boolean attackThree = false;
    static boolean mouseClick = false;
    static boolean inGame = true, inMenu = false;
    static LabelStart label1;

    // Bilder
    static BufferedImage iBg1;
    // static BufferedImage iEnemy1;
    // static BufferedImage iAttack1;
    // static BufferedImage iAttack2;
    // static BufferedImage iAttack3;


    // Buttons
    static JButton buttonStart;

    static JButton buttonGuide;
    static JButton buttonExit;


    public Var() {

        // Buttons
        Var.buttonStart = new JButton();
        Var.buttonStart.setText( "Start" );
        Var.buttonStart.setBounds( 500, 300, 225, 50);
        Var.buttonStart.setVisible( true );
        Var.buttonStart.addActionListener( new ActionHandler() );
        Var.buttonStart.setBackground( new Color(0, 255, 115 ) );
        Var.buttonStart.setFont( new Font("Arial", Font.BOLD, 40 ) );
        Var.buttonStart.setBorder( null );
        Var.buttonStart.setFocusPainted( false );
        Var.buttonStart.setVisible( true );
        Var.buttonStart.addMouseListener( new MouseAdapter() {

            public void mouseEntered( MouseEvent evt ) {
                Var.buttonStart.setBackground( new Color(0, 230, 115 ) );
                Var.buttonStart.setForeground( Color.BLACK );
            }

            public void mouseExited( MouseEvent evt ) {
                Var.buttonStart.setBackground( new Color(0, 255, 115 ) );
                Var.buttonStart.setForeground( Color.BLACK );
            }
        });
        Var.buttonGuide = new JButton();
        Var.buttonGuide.setText( "Anleitung" );
        Var.buttonGuide.setBounds( 500, 360, 325, 50);
        Var.buttonGuide.setVisible( true );
        Var.buttonGuide.addActionListener( new ActionHandler() );
        Var.buttonGuide.setBackground( new Color(0, 255, 115 ) );
        Var.buttonGuide.setFont( new Font("Arial", Font.BOLD, 30 ) );
        Var.buttonGuide.setBorder( null );
        Var.buttonGuide.setFocusPainted( false );
        Var.buttonGuide.setVisible( true );
        Var.buttonGuide.addMouseListener( new MouseAdapter() {

            public void mouseEntered ( MouseEvent evt ){
                Var.buttonGuide.setBackground( new Color(0, 230, 115 ) );
                Var.buttonGuide.setForeground( Color.BLACK );
            }
            public void mouseExited ( MouseEvent evt ){
                Var.buttonGuide.setBackground( new Color(0, 255, 115 ) );
                Var.buttonGuide.setForeground( Color.BLACK );
            }
        });
    }
}
