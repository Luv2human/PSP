package servicios.primerTrimestre.hilos.ejemplosPresentacion.ejemplo14;

public class CompartirInf {
	public static void main (String[] args) {
		Cuenta c = new Cuenta (40);
		SacarDinero h1 = new SacarDinero("Ana",c);
		SacarDinero h2 = new SacarDinero ("Juan", c);
		h1.start();
		h2.start();
	}
}
