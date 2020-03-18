/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ldp;

public class PortaContentores extends Navio{
    private int nMaxContentores;
    
    public PortaContentores(String Nome, String Matricula, float Comprimento, int NMaxContentores){
            super(Nome, Matricula, Comprimento);
        this.nMaxContentores = NMaxContentores;
    }
}
