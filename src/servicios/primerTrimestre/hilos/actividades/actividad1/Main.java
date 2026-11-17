package servicios.primerTrimestre.hilos.actividades.actividad1;

/*Crea dos clases (hilos) que extiendan la clase Thread. Uno de los hilos debe visualizar en
pantalla en un bucle infinito la palabra TIC y el otro hilo la palabra TAC. Dentro del bucle
utiliza el método sleep() para que nos de tiempo a ver las palabras que se visualizan
cuando lo ejecutemos. Tendrás que añadir un bloque try-catch (para capturar la
excepción InterruptedException). Crea después la función main() que haga uso de los
hilos anteriores. ¿Se visualizan los textos TIC y TAC de forma ordenada?
*/

public class Main {

    static void main(String[] args) {

        ClaseTac cta = new ClaseTac();
        ClaseTic cti = new ClaseTic();

        cta.start();
        cti.start();

    }


}
