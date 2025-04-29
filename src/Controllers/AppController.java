package Controllers;
import Views.AppFrame;

import javax.management.timer.Timer;
import java.time.Duration;

public class AppController {
    private AppFrame frame = new AppFrame();

    public void start(){
        frame.initialize();

    }
}
