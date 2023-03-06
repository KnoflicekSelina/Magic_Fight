package Magic_Fight;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {
    private int temporary = 0;  // ???

    public MouseHandler() {
    }
    // Mouse klick für Buttons
    public void mouseClicked( MouseEvent e ) {
        if( temporary == 0){

            if ( e.getButton() == MouseEvent.BUTTON1 ) {
                Var.mouseClick = true;

                // Gegner anklicken können und Leben abziehen
                if ( e.getSource().getClass() == Enemy.class ) {
                    PlayerAttackButton currentAttack = null;
                    Var.mouseClick = true;
                    if ( Var.attackOne.isSelected() ) {
                        currentAttack = Var.attackOne;
                    }
                    else if ( Var.attackTwo.isSelected() ) {
                        currentAttack = Var.attackTwo;

                    }
                    else if ( Var.attackThree.isSelected() ) {
                        currentAttack = Var.attackThree;

                    }
                    else
                        return;


                    Var.enemyLive.setLive( Var.enemyLive.getLive() - currentAttack.playerDamage );
                    Var.group.clearSelection();
                    currentAttack.setEnabled( false );
                    System.out.println(currentAttack.isSelected());
                    PlayerAttackButton finalCurrentAttack = currentAttack;
                    currentAttack.cooldownTimer = new Timer(currentAttack.cooldown, new ActionListener() {
                        @Override
                        public void actionPerformed( ActionEvent e ) {
                            finalCurrentAttack.setEnabled( true );
                        }
                    });

                    currentAttack.cooldownTimer.setRepeats(false);
                    currentAttack.cooldownTimer.start();

                    if ( Var.enemyLive.getLive() <= 0 ){

                        Var.endeZeit = System.currentTimeMillis();
                        Var.zeitdifferenz = Var.endeZeit - Var.startZeit ;

                        int Sekunden = (int) (Var.zeitdifferenz / 1000) % 60;
                        int Minuten = (int) ((Var.zeitdifferenz / (1000*60)) % 60);
                        int Stunden = (int) ((Var.zeitdifferenz / (1000*60*60)) % 24);


                        if ( Var.panelGameOver == null ){
                            Var.panelGameOver = new GameOver( "<html> GEWONNEN <br>" + "Erreichte Punkte: " + Var.points.getPoints() + "<br> Benötigte Zeit: " + Stunden + " Stunden " + Minuten + " Minuten "+ Sekunden + " Sekunden");// --> plus Erreichte Punkte, plus Zeit
                        }
                        Var.panelGame.setVisible( false );
                        Var.panelGameOver.requestFocus();
                        Var.JFrame1.requestFocus();
                    }
                }
            }
        }

    }

    public void mousePressed( MouseEvent e ) {
    }

    public void mouseReleased( MouseEvent e ) {
    }

    public void mouseEntered( MouseEvent e ) {
    }

    public void mouseExited( MouseEvent e ) {
    }
}
