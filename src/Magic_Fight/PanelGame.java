package Magic_Fight;
import java.awt.*;
import javax.swing.*;

// import static Magic_Fight.pauseMenuT.tempPauseMenu;

public class PanelGame extends JPanelWithBackground {

    private static final long serialVersionUID = 1L;



    public PanelGame() {
        // Hintergrundbild Game
        super("png/DO-IT_Hintergrund_Klein_1.png");

            // Hintergrund hinter dem Bild
            this.setBackground( Color.DARK_GRAY );
            Var.jf1.getContentPane().add( this );
            this.setVisible( true );
            this.setLayout( null );
            this.setBounds( 0 , 0 , Var.screenwidth , Var.screenhigh );



            // Gegner Bild
             Enemy jPE = new Enemy();
             this.add( jPE );
             jPE.setVisible( true );



            // JToggleButton Anwaehlen und Abwaehlen dass nur eine Attacke möglich ist
            ItemListener itemListener = itemEvent -> {
                int state = itemEvent.getStateChange();
                PlayerAttackButton eventSource = (PlayerAttackButton) itemEvent.getSource();
                if ( state == ItemEvent.SELECTED ) {
                    System.out.println( eventSource.getCooldown() + " Selected" );
                } else {
                    System.out.println(eventSource.getCooldown() + " Deselected");
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
            Var.enemyLive = new LiveCounter( 1000 );
            Var.enemyLive.setFont( new Font( "Arial", Font.BOLD, 20));
            Var.enemyLive.setForeground( Color.WHITE );
            Var.enemyLive.setBounds( 1035, 680, 300, 100 );
            Var.enemyLive.setVisible( true );
            this.add( Var.enemyLive );


            Var.playerLive = new LiveCounter( 1000 );
            Var.playerLive.setFont( new Font( "Arial", Font.BOLD, 20));
            Var.playerLive.setForeground( Color.WHITE );
            Var.playerLive.setBounds( 111, 680, 300, 100 );
            Var.playerLive.setVisible( true );
            this.add( Var.playerLive );







            // Buttons im Spiel Menue


    }
}

