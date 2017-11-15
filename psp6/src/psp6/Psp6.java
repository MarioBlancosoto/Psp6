/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp6;

import java.util.Random;

/**
 *
 * @author mbs
 */
public class Psp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Caja caja = new Caja();
     
     
    Fio fio1 = new Fio(caja,true);
    Fio fio2 = new Fio(caja,false);
    fio1.start();
     fio2.start();
    }
    
}
