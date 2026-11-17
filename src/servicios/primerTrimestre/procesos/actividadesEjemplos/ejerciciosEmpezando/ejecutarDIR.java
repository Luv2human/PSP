package servicios.primerTrimestre.procesos.actividadesEjemplos.ejerciciosEmpezando;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejecutarDIR {
    /* Ejercicio para ejecutar el comando DIR. Usamos el método
getInputStream() de la clase Process para leer el stream de salida del proceso, es decir,
para leer lo que el comando DIR envía a la consola. Para leer la salida usamos el
método read() de InputStream que nos devolverá carácter a carácter la salida
generada por el comando*/

    static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "dir");

        Process p = pb.start();

        InputStream is = p.getInputStream();

        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(isr);

        String cadAux = " ";

        while ( ( cadAux = br.readLine() ) != null ){
            System.out.println(cadAux);
        }
    }

}
