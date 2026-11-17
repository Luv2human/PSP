package servicios.primerTrimestre.hilos.ejerciciosPrueba;

public class RatonSimple implements Runnable {

    private String nombre;
    private int tiempoAlimentacion;
    private int alimentoConsumido;

    public RatonSimple(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    public void comer() {

        try {

            System.out.println("El ratón "+ nombre +" ha comenzado a alimentarse");
            Thread.sleep(tiempoAlimentacion*1000);

            synchronized (RatonSimple.class) {
                alimentoConsumido++;
                System.out.println("El ratón " + nombre + " ha terminado de alimentarse. Alimento consumido: " + alimentoConsumido);
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        this.comer();
    }

    /*static void main(String[] args) {

        RatonSimple raton = new RatonSimple("Nigga", 4);
        RatonSimple raton2 = new RatonSimple("Duende", 2);

        new Thread(raton).start();
        new Thread(raton2).start();
    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RatonSimple fievel=new RatonSimple("Fievel",4);
		new Thread(fievel).start();
		new Thread(fievel).start();
		new Thread(fievel).start();
		new Thread(fievel).start();
	}

    //main para varios Threads

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		RatonSimple fievel=new RatonSimple("Fievel",4);
		for (int i=0;i<1000;i++){
			new Thread(fievel).start();
		}
	}*/
}

