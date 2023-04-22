package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FerramentaTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Uso uso1 = new Uso("Escalar Privilegios");

        Uso uso2 = new Uso("Rede");
        Detalhe detalhe21 = new Detalhe("Scan de rede - nmap", "nmap -");
        uso2.addConteudo(detalhe21);

        Uso uso3 = new Uso("OSINT");
        Detalhe detalhe31 = new Detalhe("Shodan", "-");
        Detalhe detalhe32 = new Detalhe("Ashok", "python3 Ashok.py -h");
        uso3.addConteudo(detalhe31);
        uso3.addConteudo(detalhe32);

        Uso flag = new Uso("Flags utilizadas");
        flag.addConteudo(uso1);
        flag.addConteudo(uso2);
        flag.addConteudo(uso3);

        Ferramenta ferramenta = new Ferramenta();
        ferramenta.setFlag(flag);

        assertEquals("Uso: Flags utilizadas\n" +
                "Uso: Escalar Privilegios\n" +
                "Uso: Rede\n" +
                "Detalhe: Scan de rede - nmap - comando: nmap -\n" +
                "Uso: OSINT\n" +
                "Detalhe: Shodan - comando: -\n" +
                "Detalhe: Ashok - comando: python3 Ashok.py -h\n", ferramenta.getFlag());
    }

    @Test
    void deveRetornarExecacaoFerramentaSemFlag() {
        try {
            Ferramenta ferramenta = new Ferramenta();
            ferramenta.getFlag();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Ferramenta sem Flag", e.getMessage());
        }
    }
}
