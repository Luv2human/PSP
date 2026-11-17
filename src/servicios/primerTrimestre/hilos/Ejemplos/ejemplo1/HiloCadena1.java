package servicios.primerTrimestre.hilos.Ejemplos.ejemplo1;

class HiloCadena1 implements Runnable {
    private ObjetoCompartido objeto;
    String cad;

    public HiloCadena1(ObjetoCompartido c, String s) {
        this.objeto = c;
        this.cad = s;
    }

    @Override
    public void run() {
        //for (int j = 0; j < 10; j++) objeto.PintaCadena(cad);
        synchronized (this.objeto) {
            for (int j = 0; j < 10; j++) {
                this.objeto.PintaCadena(this.cad);
            }
        }//fin bloque synchronized
        System.out.print("\n" + this.cad + " finalizado");
    }//run

}//HiloCadena1
