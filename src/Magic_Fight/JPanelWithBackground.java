package Magic_Fight;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JPanelWithBackground extends JLayeredPane {

    // Hintergrundbild
    private Image backgroundImage;

    public JPanelWithBackground( String Background ) {
        super();
        try {
            // Hintergrundbild
            backgroundImage = ImageIO.read( new File( Background ) );
        }

        catch ( IOException e ) {
            e.printStackTrace();
            System.out.println( "Bild konnte nicht geladen werden!" );
        }
    }

     public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Zeichnet das Hintergrundbild (Braucht man, dass es angezeigt wird)
        g.drawImage(backgroundImage, 0, 0, this);
    }


}
