/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila_Dinamica_Implementacao;

import Arvore01_ABB_Projeto_EDII.Perguntas;

/**
 *
 * @author LuanC
 */
public interface TAD_Queue {
    public boolean isEmpty();
    public Perguntas enqueue(Perguntas x);
    public Perguntas dequeue();
    public Perguntas peek();
    @Override
    public String toString();
}
