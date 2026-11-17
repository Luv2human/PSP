package servicios.primerTrimestre.procesos.actividadesEjemplos.ejerciciosEmpezando;

public class LeerNombre {

    /*Crea un programa Java llamado LeerNombre.java que reciba desde los argumentos de
main() un nombre y lo visualice en pantalla. Utiliza System.exit(0) para una finalización
correcta del programa y System.exit(-1) para el caso en el que no se hayan introducido
los argumentos correctos en main(). Posteriormente haz un programa similar a
Ejemplo3.java para ejecutar Leernombre.java. Utiliza el método waitFor() para
comprobar el valor de salida del proceso que se ejecuta. Prueba la ejecución del
programa pasando un parámetro y sin pasarlo. ¿Qué devuelve waitFor() en cada caso?*/

    static void main(String[] args) {
        if ( args[0] != null ) {
            System.out.println(args[0]);
            System.exit(0);
        }else{
            System.exit(1);
        }
    }
}
