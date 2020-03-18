/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ldp;

public class TesteNavios {


    public static void main(String[] args) {
        Porto p = new Porto();
        Petroleiro n1 = new Petroleiro("Alfredo", "08-OU-80", 15, 100);
        Petroleiro n2 = new Petroleiro("Amadora", "21-AA-20", 12, 90);
        
        PortaContentores n3 = new PortaContentores("Andorra", "30-EE-30", 10, 30);
        PortaContentores n4 = new PortaContentores("Batata", "07-JJ-28", 20, 15);
        
    }
    
}
