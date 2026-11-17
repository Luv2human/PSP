package servicios.primerTrimestre.hilos.Ejemplos.ejemplo1;

public class BloqueoHilos1 {
	public static void main(String[] args) {
		ObjetoCompartido com = new ObjetoCompartido();
		HiloCadena1  a = new HiloCadena1 (com, " A ");
		HiloCadena1  b = new HiloCadena1 (com, " B ");
		new Thread(a).start();
		new Thread(b).start();
	}
}//BloqueoHilosInicial