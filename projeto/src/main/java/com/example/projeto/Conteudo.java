package com.example.projeto;

public abstract class Conteudo {

    private String manual;

    public Conteudo(String manual) {
        this.manual = manual;
    }

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public abstract String getConteudo();
}
