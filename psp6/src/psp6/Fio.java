
package psp6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Fio extends Thread{
    Boolean aux;
    Caja c;
    public Fio(Caja c,Boolean aux){
       super();
       this.aux = aux;
        this.c=c;
        
        
    }
     
   
    public void run(){
      
   
        
        for(int i=0;i<20;i++){
           
        c.ingresarRetirar(aux);
       
            try {
                sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          }
        
        
          
            try {
                sleep(600);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
   
    
    
    

