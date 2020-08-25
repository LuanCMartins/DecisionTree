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
public class Node {
    private Perguntas value;
    private Node next;

    public Perguntas getValue() {
        return value;
    }

    public void setValue(Perguntas value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
