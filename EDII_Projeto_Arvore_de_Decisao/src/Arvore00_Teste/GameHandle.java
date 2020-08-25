/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arvore00_Teste;

import Arvore01_ABB_Projeto_EDII.DecisionTree;
import Arvore01_ABB_Projeto_EDII.NodeTree;
import Fila_Dinamica_Implementacao.Queue;
import java.util.Scanner;

/**
 *
 * @author LuanC
 */
public class GameHandle {
    private int rodadas = 1;
    private boolean continuaJogo;
    
    private NodeTree nodeAtual;
    private final Queue perguntas;
    private final DecisionTree arvore = new DecisionTree();
    Scanner leitor = new Scanner(System.in);

    public GameHandle(Queue perguntas) {
        this.perguntas = perguntas;
    }
    
    //UM INSERT QUE RECEBE UMA FILA COMO PARÂMETRO E INSERE TODAS AS PERGUNTAS DE FORMA
    //QUE A ÁRVORE CONTINUE CHEIA
    private void iniciaArvore() {
        arvore.insert(perguntas);
        nodeAtual = arvore.getRaiz();
    }
    
    //INICIA A ÁRVORE E EXECUTA A LÓGICA DO JOGO
    public void game() {
        iniciaArvore();
        iniciaJogo();
    }
    
    //EXECUTA O JOGO, E REINICIA O PROCESSO QUANTAS VEZES FOREM NECESSÁRIAS ATÉ
    //QUE O USUÁRIO INFORME QUE DESEJA ENCERRAR O JOGO
    private void iniciaJogo() {
        System.out.println("Bem Vindo!");
        
        do {
            System.out.println("\n\nRodada: " + rodadas);
            System.out.println(this.nodeAtual.toString());
            
            while(nodeAtual.getValue().getClassificacao() != '!') {
                gamePlay(validaResposta(capturarResposta()));
                System.out.println(this.nodeAtual.toString());
            }
            
            System.out.println("\nDeseja encerrar o jogo?");
            encerraJogo(capturarResposta());
        } while (continuaJogo);
    }
    
    //CAPTURA A RESPOSTA PASSADA PELO JOGADOR ATRAVÉS DO TERMINAL
    private String capturarResposta() {
        return leitor.nextLine();
    }
    
    //VALIDA A RESPOSTA DADA PELO JOGADOR, CASO INSATISFATÓRIA CONTINUA A 
    //PERGUNTAR ESPERANDO UMA RESPOSTA SATISFATÓRIA ("SIM" OU "NÃO")
    private String validaResposta(String resposta) {
        if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")
                || resposta.equalsIgnoreCase("Yes") || resposta.equalsIgnoreCase("Y")
                || resposta.equalsIgnoreCase("Não")|| resposta.equalsIgnoreCase("Nao")
                || resposta.equalsIgnoreCase("No") || resposta.equalsIgnoreCase("N")) {
            return resposta;
        } else {
            System.out.println("Por favor, insira uma resposta válida!");
            System.out.println("\n" + this.nodeAtual.toString());
            resposta = leitor.nextLine();
            return validaResposta(resposta);
        }
    }
    
    //EXECUTA LÓGICA DE DECISÃO DO JOGO
    private void gamePlay(String resposta) {
        String resp = resposta;
         if ((resp.equalsIgnoreCase("Nao")|| resposta.equalsIgnoreCase("No") || resposta.equalsIgnoreCase("N")) && nodeAtual.getFilhoDireito() != null) {
            nodeAtual = nodeAtual.getFilhoDireito();
        } else if ((resp.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")
                || resposta.equalsIgnoreCase("Yes") || resposta.equalsIgnoreCase("Y")) && nodeAtual.getFilhoEsquerdo() != null) {
            nodeAtual = nodeAtual.getFilhoEsquerdo();
        }
    }
    
    //FAZ A CHECAGEM SE O JOGADOR INFORMOU QUE DESEJA OU NÃO ENCERRAR O JOGO
    private void encerraJogo(String check) {
        if (check.equalsIgnoreCase("Sim") || check.equalsIgnoreCase("S") 
                || check.equalsIgnoreCase("Yes") || check.equalsIgnoreCase("Y")) {
            continuaJogo = false;
        } else if (check.equalsIgnoreCase("Nao") || check.equalsIgnoreCase("Não")
                || check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
            nodeAtual = arvore.getRaiz();
            rodadas++;
            continuaJogo = true;
        } else {
            System.out.println("Por favor, insira uma resposta válida!\nDeseja encerrar o jogo?");
            check = leitor.nextLine();
            encerraJogo(check);
        }
    }
}
