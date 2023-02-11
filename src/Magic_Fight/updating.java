package Magic_Fight;

import java.util.Timer;
import java.util.TimerTask;

public class updating {
    Timer updating;
    static int tempupdating = 0;
    public updating() {
        updating = new Timer();
        updating.scheduleAtFixedRate( new TimerTask () {

            public void run(){
                if( Var.inMenu ){
                    if ( tempupdating == 0 ){
                        Var.buttonExit.requestFocus();
                        Var.buttonGuide.requestFocus();
                        tempupdating++;
                    } else if ( tempupdating == 1 ) {
                        Var.jf1.requestFocus();
                    }
                }
            }
        } ,0, 50 );
    }
}
