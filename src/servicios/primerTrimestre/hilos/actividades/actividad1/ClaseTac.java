package servicios.primerTrimestre.hilos.actividades.actividad1;

import static java.lang.Thread.sleep;

public class ClaseTac extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("TAC");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
