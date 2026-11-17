package servicios.primerTrimestre.hilos.ejemplosPresentacion.ejemplo13;

import servicios.primerTrimestre.hilos.ejemplosPresentacion.ejemplo13.Contador;
import servicios.primerTrimestre.hilos.ejemplosPresentacion.ejemplo13.HiloA;
import servicios.primerTrimestre.hilos.ejemplosPresentacion.ejemplo13.HiloB;

public class CompartirInf {
    public static void main(String[] args) {
	Contador cont = new Contador(100);
	HiloA a = new HiloA("HiloA", cont);
    HiloB b = new HiloB("HiloB", cont);
	//a.start();
	b.start();
	a.start();
    }
}
