/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ldp;


public class Petroleiro extends Navio {
    private float capCarga;
    
    public Petroleiro(String Nome, String Matricula, float Comprimento, float CapCarga){
            super(Nome, Matricula, Comprimento);
            this.capCarga=CapCarga;
        }
}
