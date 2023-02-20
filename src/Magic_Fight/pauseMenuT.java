
package Magic_Fight;


import java.util.Timer;
import java.util.TimerTask;

public class pauseMenuT {
    Timer PauseMenuTimer;
    static int tempPauseMenu = 0;
    public pauseMenuT() {
        PauseMenuTimer = new Timer();
        PauseMenuTimer.scheduleAtFixedRate(new TimerTask () {
            @Override
            public void run(){
                if( Var.inGameMenu){
                    if ( tempPauseMenu == 0 ){
                        Var.buttonGuide.requestFocus();
                        Var.buttonExit.requestFocus();
                        tempPauseMenu++;
                    }
                    else if ( tempPauseMenu == 1 ) {
                        Var.jf1.requestFocus();
                    }
                }
            }
        } ,0, 50 );
    }
}
