

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {
    
    private Buffer buffer;
    private final String letras = "123456789";

    public Productor(Buffer b){
        this.buffer = b;
    }
     
    public void run(){
        while(true){
            try {
                char c = letras.charAt((int) (Math.random() * letras.length()));
                buffer.producir(c);
                System.out.println("Se ingresa una pizza de numero " + c + " a la estanteria ");
                
                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
