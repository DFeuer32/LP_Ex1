
package com.mycompany.ldp;


public abstract class Navio {
    protected String nome;
    protected String matricula;
    protected float comprimento;
    
    public Navio(String Nome, String Matricula, float Comprimento){
        this.comprimento = Comprimento;
        this.matricula = Matricula;
        this.nome = Nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    
}
