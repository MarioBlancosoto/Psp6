/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Caja {
    static int fondos =0;
    Random rnd = new Random();
    
    
    public Caja(){
        
        
    }

    public  int getFondos() {
        return fondos;
    }
    
    
    
    public synchronized void ingresarRetirar(Boolean aux){
        
      //int  cantidad = (int) (Math.floor(Math.random() * (25+ 35)) - 35);
     
       if(aux){
           int cantidad =1;
           fondos+=cantidad;
           System.out.println("Ingreso "+cantidad);
           System.out.println("Fondos totales "+fondos);
           notify();
            
          
            
       }else{
    int cantidad = -1;
           while(-cantidad>fondos){
               
                try {  
                    wait();
                     System.out.println("Fondos insuficientes,esperando ingreso...");
                    System.out.println("Hilo sigue");
                   
                } catch (InterruptedException ex) {
                    Logger.getLogger(Caja.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            
           }
           
            fondos=fondos+cantidad;
            System.out.println("Retirada "+cantidad);
            System.out.println("Fondos totales "+fondos);
            
           
       }
       
       }
        
        
       }
    

