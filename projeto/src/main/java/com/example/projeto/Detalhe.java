package com.example.projeto;

public class Detalhe extends Conteudo {

    private String comando;

    public Detalhe(String manual, String comando) {
        super(manual);
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando
        ;
    }

    public String getConteudo() {
        return "Detalhe: " + this.getManual() + " - comando: " + this.comando + "\n";
    }
}
