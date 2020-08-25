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
public class Queue implements TAD_Queue {

    private Node head = null, tail = null;

    public Queue() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Perguntas peek() {
        if (head == null) {
            return null;
        } else {
            return head.getValue();
        }
    }

    @Override
    public Perguntas enqueue(Perguntas x) {
        if (x == null) {
            return null;
        }
        try {
            Node novo = new Node();
            novo.setValue(x);
            novo.setNext(null);
            if (tail == null) {
                head = novo;
                tail = novo;
            } else {
                tail.setNext(novo);
                tail = novo;
            }
            return x;
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Perguntas dequeue() {
        if (head == null) {
            return null;
        }
        Perguntas value = head.getValue();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return value;
    }

    @Override
    public String toString() {
        if (!isEmpty()) {
            String saida = "";
            Node aux = head;
            while (aux != null) {
                saida += aux.getValue().toString();
                aux = aux.getNext();
                if (aux != null) {
                    saida += ", ";
                }
            }
        return ("f: [" + saida + "]");
        }
        else return "f: []";
    }
}
