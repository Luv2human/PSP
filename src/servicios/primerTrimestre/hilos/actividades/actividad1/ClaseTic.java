package servicios.primerTrimestre.hilos.actividades.actividad1;

public class ClaseTic extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("TIC");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
