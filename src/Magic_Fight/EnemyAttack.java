package Magic_Fight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;


public class EnemyAttack extends JLabel{

    public int castTime;
    int enemyDamage;
    int points;

    Timer damageTimer;


    public EnemyAttack( String filename, int width, int height, int castTime, int enemyDamage, int points ) {
        super();
        ImageIcon enemyAttackIcon = new ImageIcon( filename );

        enemyAttackIcon.setImage( enemyAttackIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT) );
        this.setIcon( enemyAttackIcon );

        this.castTime = castTime;
        this.enemyDamage = enemyDamage;
        this.points = points;

        this.setSize( width, height );
        this.setVisible( true );
        this.addMouseListener( new MouseHandler() );

        damageTimer = new Timer( castTime, new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                // Schadensberechnung
                Var.playerLive.setLive( Var.playerLive.getLive() - enemyDamage);
                reset();

                if ( Var.playerLive.getLive() <= 0 ){

                    Var.endeZeit = System.currentTimeMillis();
                    Var.zeitdifferenz = Var.endeZeit - Var.startZeit ;

                    int Sekunden = (int) (Var.zeitdifferenz / 1000) % 60;
                    int Minuten = (int) ((Var.zeitdifferenz / (1000*60)) % 60);
                    int Stunden = (int) ((Var.zeitdifferenz / (1000*60*60)) % 24);

                    if ( Var.panelGameOver == null ){
                        Var.panelGameOver = new GameOver( "<html> VERLOREN <br>"  + "Erreichte Punkte: " + Var.points.getPoints() + "<br> Benötigte Zeit: " + Stunden + " Stunden " + Minuten + " Minuten "+ Sekunden + " Sekunden" );// --> plus Erreichte Punkte, plus Zeit
                    }
                    Var.panelGame.setVisible( false );
                    Var.panelGameOver.requestFocus();
                    Var.JFrame1.requestFocus();
                }
            }
        });
        damageTimer.setRepeats(false);
        damageTimer.start();
    }

    public void setRandomLocation() {
        setLocation(ThreadLocalRandom.current().nextInt(80, Var.screenwidth - 150 ), ThreadLocalRandom.current().nextInt(80, Var.screenheight - 250 ));

    }

    public void reset(){
        this.setVisible(false);
        Timer timer = new Timer(ThreadLocalRandom.current().nextInt(500, 5000), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setRandomLocation();
               setVisible( true );
               damageTimer.restart();
            }
        });

        timer.setRepeats(false);
        timer.start();

    }
}
