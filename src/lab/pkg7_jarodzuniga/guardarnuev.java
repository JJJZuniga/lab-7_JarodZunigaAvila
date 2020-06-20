package lab.pkg7_jarodzuniga;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class guardarnuev extends Thread {

    private JProgressBar progBar_c;
    private boolean avanzar;
    private boolean vive;

    public guardarnuev(JProgressBar progBar_c) {
        this.progBar_c = progBar_c;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int d = 1;
               
                progBar_c.setValue(100);
            }//FIN IF
            try {
                Thread.sleep(1000000000);
            } catch (InterruptedException ex) {
            }
        }

    }

}
