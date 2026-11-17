package servicios.primerTrimestre.hilos.actividades.actividad1Runnable;

public class ClaseTic implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("TIC");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
