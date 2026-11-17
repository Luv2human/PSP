package servicios.primerTrimestre.procesos.actividadesEjemplos.ejerciciosEmpezando;

import java.io.IOException;

public class AbrirElNotepad {
    /*Cómo ejecutar una aplicación en Windows, en este caso el NOTEPAD*/
    static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("NOTEPAD");

        Process p = pb.start();

    }
}
