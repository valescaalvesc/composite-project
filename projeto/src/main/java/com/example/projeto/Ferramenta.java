package com.example.projeto;

public class Ferramenta {

    private Conteudo flag;

    public void setFlag(Conteudo flag) {
        this.flag = flag;
    }

    public String getFlag() {
        if (this.flag == null) {
            throw new NullPointerException("Ferramenta sem Flag");
        }
        return this.flag.getConteudo();


}
    }
