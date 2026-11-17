package servicios.primerTrimestre.hilos.actividades.actividad1Runnable;

public class Main {

    static void main(String[] args) {

        ClaseTic cti = new ClaseTic();
        ClaseTac cta = new ClaseTac();

        new Thread(cti).start();


    }
}
