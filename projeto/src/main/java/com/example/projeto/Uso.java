package com.example.projeto;

import java.util.ArrayList;
import java.util.List;

public class Uso extends Conteudo {
    private List<Conteudo> conteudos;

    public Uso(String manual) {
        super(manual);
        this.conteudos = new ArrayList<Conteudo>();
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public String getConteudo() {
        String saida = "";
        saida = "Uso: " + this.getManual() + "\n";
        for (Conteudo conteudo : conteudos) {
            saida += conteudo.getConteudo();
        }
        return saida;
    }

    }
