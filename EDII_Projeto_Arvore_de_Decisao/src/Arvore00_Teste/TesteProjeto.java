/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arvore00_Teste;

import Arvore01_ABB_Projeto_EDII.Perguntas;
import Fila_Dinamica_Implementacao.Queue;

/**
 *
 * @author LuanC
 */
public class TesteProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        game1();
        game2();
    }
    
    public static void game1() {
        Perguntas p1,p2,p3,r1,r2,r3,r4;
        p1 = new Perguntas("O animal come carne?", '?');
        p2 = new Perguntas("O animal tem listras?", '?');
        p3 = new Perguntas("O animal tem listras?", '?');
        r1 = new Perguntas("Tigre", '!');
        r2 = new Perguntas("Leopardo", '!');
        r3 = new Perguntas("Zebra", '!');
        r4 = new Perguntas("Cavalo", '!');
        
        Queue perguntas = new Queue();
        perguntas.enqueue(p1);
        perguntas.enqueue(p2);
        perguntas.enqueue(p3);
        perguntas.enqueue(r1);
        perguntas.enqueue(r2);
        perguntas.enqueue(r3);
        perguntas.enqueue(r4);
        
        GameHandle jogo = new GameHandle(perguntas);
        jogo.game();
    }
    
    public static void game2() {
        Perguntas p1,p2,p3, p4, p5, p6, p7,r1,r2,r3,r4, r5, r6, r7, r8;
        p1 = new Perguntas("É homem?", '?');
        p2 = new Perguntas("É loiro?", '?');
        p3 = new Perguntas("É ruiva?", '?');
        p4 = new Perguntas("É ator?", '?');
        p5 = new Perguntas("É ator?", '?');
        p6 = new Perguntas("É atriz?", '?');
        p7 = new Perguntas("É atriz?", '?');
        r1 = new Perguntas("Chris Evans", '!');
        r2 = new Perguntas("David Bowie", '!');
        r3 = new Perguntas("Robert Dawney Jr.", '!');
        r4 = new Perguntas("Brendon Urie", '!');
        r5 = new Perguntas("Emma Stone", '!');
        r6 = new Perguntas("Hayley Williams", '!');
        r7 = new Perguntas("Gal Gadot", '!');
        r8 = new Perguntas("Rihanna", '!');
        
        Queue perguntas = new Queue();
        perguntas.enqueue(p1);
        perguntas.enqueue(p2);
        perguntas.enqueue(p3);
        perguntas.enqueue(p4);
        perguntas.enqueue(p5);
        perguntas.enqueue(p6);
        perguntas.enqueue(p7);
        perguntas.enqueue(r1);
        perguntas.enqueue(r2);
        perguntas.enqueue(r3);
        perguntas.enqueue(r4);
        perguntas.enqueue(r5);
        perguntas.enqueue(r6);
        perguntas.enqueue(r7);
        perguntas.enqueue(r8);
        
        GameHandle jogo = new GameHandle(perguntas);
        jogo.game();
    }
}
