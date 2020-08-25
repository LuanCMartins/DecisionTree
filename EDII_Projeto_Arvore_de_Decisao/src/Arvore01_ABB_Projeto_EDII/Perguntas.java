/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arvore01_ABB_Projeto_EDII;

/**
 *
 * @author LuanC
 */
public class Perguntas {
    private final String informacao;
    private final char classificacao;

    public Perguntas(String pergunta, char classificacao) {
        this.informacao = pergunta;
        this.classificacao = classificacao;
    }

    public String getPergunta() {
        return informacao;
    }

    public char getClassificacao() {
        return classificacao;
    }

    @Override
    public String toString() {
        return informacao;
    }
}
