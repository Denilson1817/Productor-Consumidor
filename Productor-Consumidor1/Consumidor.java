

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {

    private Buffer buffer;
    private Ventana CV; 

    public Consumidor(Buffer b) {
        this.buffer = b;
    }
    
    public void imprimeC(){
        //System.out.printf(" %d ", this.area.get(i));
        System.out.println("Un cliente toma de la estantería la pizza numero: ");
    }

    public void run() {
        while (true) {
            try {
                char c = this.buffer.consumir();
                //imprimeC();
                System.out.println(c);
                System.out.println("Un cliente toma la pizza numero " + c + " de la estanteria");

                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
