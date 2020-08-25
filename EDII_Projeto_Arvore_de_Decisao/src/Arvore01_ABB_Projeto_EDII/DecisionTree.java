/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore01_ABB_Projeto_EDII;

import Fila_Dinamica_Implementacao.Queue;
import java.util.ArrayList;

/**
 *
 * @author LuanC
 * 
 */
public class DecisionTree<Perguntas> {

    private NodeTree raiz;
    private Perguntas nodo;

    public DecisionTree() {
        raiz = null;
    }

    public boolean isEmpty() {
        return (raiz == null);
    }

    public void setRaiz(NodeTree raiz) {
        this.raiz = raiz;
    }

    public NodeTree getRaiz() {
        return raiz;
    }

    public void insert(Queue perguntas) {
        NodeTree nodoEmFoco = raiz;
        Queue filaAuxiliar = new Queue();
        ArrayList<NodeTree> listaDeNodos = new ArrayList<>();

        while (!perguntas.isEmpty()) {
            if (raiz == null) {
                filaAuxiliar.enqueue(perguntas.dequeue());
                NodeTree novaRaiz = new NodeTree(filaAuxiliar.peek());
                nodoEmFoco = novaRaiz;
                setRaiz(novaRaiz);
            } else {
                while (filaAuxiliar.peek().getClassificacao() == '?') {
                    NodeTree add = new NodeTree(perguntas.peek());
                    listaDeNodos.add(add);
                    nodoEmFoco.setFilhoEsquerdo(add);
                    filaAuxiliar.enqueue(perguntas.dequeue());

                    NodeTree add2 = new NodeTree(perguntas.peek());
                    listaDeNodos.add(add2);
                    nodoEmFoco.setFilhoDireito(add2);
                    filaAuxiliar.enqueue(perguntas.dequeue());

                    nodoEmFoco = listaDeNodos.remove(0);
                    filaAuxiliar.dequeue();
                }
                while(!perguntas.isEmpty()) {
                    perguntas.dequeue();
                }
            }
        }
    }
}
