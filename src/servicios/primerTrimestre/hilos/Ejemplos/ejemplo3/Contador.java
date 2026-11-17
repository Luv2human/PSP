package servicios.primerTrimestre.hilos.Ejemplos.ejemplo3;

class Contador {
	private int c = 0;
        
	public Contador(int c) {
		this.c = c;
	}

	public void incrementa() {
		c = c + 1;
	}

	public void decrementa() {
		c = c - 1;
	}

	public int getValor() {
		return c;
	}

}
