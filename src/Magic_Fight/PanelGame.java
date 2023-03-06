package Magic_Fight;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class PanelGame extends JPanelWithBackground {

    private static final long serialVersionUID = 1L;

    public PanelGame() {

        // Hintergrundbild Game
        super("png/DO-IT_Hintergrund.png");
         Var.startZeit = System.currentTimeMillis();

            // Hintergrund hinter dem Bild
            this.setBackground( Color.DARK_GRAY );
            Var.JFrame1.getContentPane().add( this );
            this.setVisible( true );
            this.setLayout( null );
            this.setBounds( 0 , 0 , Var.screenwidth , Var.screenheight);
            this.setOpaque(true);
            this.revalidate();


            // Gegner Bild
             Enemy jLabelEnemy = new Enemy();
             this.add( jLabelEnemy, JLayeredPane.DEFAULT_LAYER);
             jLabelEnemy.setVisible( true );


            // JToggleButton Anwaehlen und Abwaehlen dass nur eine Attacke möglich ist
            ItemListener itemListener = itemEvent -> {
                int state = itemEvent.getStateChange();
                PlayerAttackButton eventSource = (PlayerAttackButton) itemEvent.getSource();
                if ( state == ItemEvent.SELECTED ) {
                    System.out.println( eventSource.getCooldown() + " Selected" );
                } else {
                    System.out.println( eventSource.getCooldown() + " Deselected" );
                }
                if ( itemEvent.getSource() != Var.attackOne )  {
                    Var.attackOne.setSelected( false );
                }
                if ( itemEvent.getSource() != Var.attackTwo ) {
                    Var.attackTwo.setSelected( false );
                }
                if ( itemEvent.getSource() != Var.attackThree ) {
                    Var.attackThree.setSelected( false );
                }
            };


            // Player Angriffe Icon und Werte
            Var.attackOne = new PlayerAttackButton("png/Player_Attack_One.png", 5000, 10 );
            this.add( Var.attackOne );
            Var.attackOne.addItemListener( itemListener );

            Var.attackTwo = new PlayerAttackButton("png/Player_Attack_Two.png", 10000, 20 );
            this.add( Var.attackTwo );
            Var.attackTwo.addItemListener( itemListener );

            Var.attackThree= new PlayerAttackButton("png/Player_Attack_Three.png", 15000, 30 );
            this.add( Var.attackThree );
            Var.attackThree.addItemListener( itemListener );


            // Gruppe für die Buttons, dass nur ein Button gewählt wird und alle anderen abgewählt
            ButtonGroup gruppe = new ButtonGroup();
            gruppe.add( Var.attackOne );
            gruppe.add( Var.attackTwo );
            gruppe.add( Var.attackThree );


            // Leben Counter darstellung
            Var.playerLive = new LiveCounter( 100 );
            Var.playerLive.setFont( new Font( "Arial", Font.BOLD, 20));
            Var.playerLive.setForeground( Color.WHITE );
            Var.playerLive.setBounds( 30, 680, 300, 100 );
            Var.playerLive.setVisible( true );
            this.add( Var.playerLive );

            Var.enemyLive = new LiveCounter( 100 );
            Var.enemyLive.setFont( new Font( "Arial", Font.BOLD, 20));
            Var.enemyLive.setForeground( Color.WHITE );
            Var.enemyLive.setBounds( 1035, 680, 300, 100 );
            Var.enemyLive.setVisible( true );
            this.add( Var.enemyLive );


            // Gegnerische Angriffe
            Var.enemyAttackOne = new EnemyAttack("png/Enemy_Attack_One.png", 90, 90, 8000, 30, 10 );
            this.add( Var.enemyAttackOne,  JLayeredPane.PALETTE_LAYER);
            Var.enemyAttackOne.setRandomLocation();

            Var.enemyAttackTwo = new EnemyAttack("png/Enemy_Attack_Two.png", 75, 75, 6500, 20, 20 );
            this.add( Var.enemyAttackTwo, JLayeredPane.PALETTE_LAYER);
            Var.enemyAttackTwo.setRandomLocation();

            Var.enemyAttackThree= new EnemyAttack("png/Enemy_Attack_Three.png", 60, 60, 5000, 10, 30 );
            this.add( Var.enemyAttackThree, JLayeredPane.PALETTE_LAYER);
            Var.enemyAttackThree.setRandomLocation();


            // Punkte Anzeige
            Var.points = new PointCounter(  0 );
            Var.points.setFont( new Font( "Arial", Font.BOLD, 20));
            Var.points.setForeground( Color.WHITE );
            Var.points.setBounds( 300, 680, 300, 100 );
            Var.points.setVisible( true );
            this.add( Var.points );

    }
}

