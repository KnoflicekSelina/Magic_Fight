package Magic_Fight;


import javax.swing.*;
import java.awt.*;

public class GameOver extends JPanel {

    public GameOver( String gameOverText ){
        super();

        int bonusPoints = 0;

        if (Var.zeitdifferenz <= 1000*60 ){
             bonusPoints = 100;
        }
        else if (Var.zeitdifferenz <= 1000*120 ){
             bonusPoints = 50;
        }
        else if (Var.zeitdifferenz <= 1000*180 ){
             bonusPoints = 10;
        }


        gameOverText = gameOverText +"<br> Bonus Punkte: " + bonusPoints + "</html>";

        this.setBackground( Color.DARK_GRAY );
        Var.JFrame1.getContentPane().add( this );
        this.setVisible( true );
        this.setLayout( null );
        this.setBounds( 0 , 0 , Var.screenwidth , Var.screenheight);
        this.setOpaque(true);

        JLabel lose = new JLabel( gameOverText , SwingConstants.CENTER );
        lose.setForeground( Color.WHITE );
        lose.setFont(new Font( "Arial", Font.BOLD, 35));
        lose.setBounds( 0, 0, Var.screenwidth, Var.screenheight);

        lose.setVisible( true );
        this.add( lose );

    }

}
