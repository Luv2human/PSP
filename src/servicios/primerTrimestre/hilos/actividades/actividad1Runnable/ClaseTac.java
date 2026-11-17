package servicios.primerTrimestre.hilos.actividades.actividad1Runnable;

public class ClaseTac implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("TAC");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
