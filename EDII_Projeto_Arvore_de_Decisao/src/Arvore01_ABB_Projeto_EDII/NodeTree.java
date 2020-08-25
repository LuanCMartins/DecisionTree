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
public class NodeTree {
    private Perguntas value;
    private NodeTree filhoEsquerdo;
    private NodeTree filhoDireito;
    NodeTree raiz;

    @Override
    public String toString() {
        return value.toString();
    }
    
    public NodeTree(Perguntas valor){
        this.value = valor;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
        this.raiz = this;
    }
    
    public Perguntas getValue(){
        return value;
    }
    
    public void setValue(Perguntas value){
        this.value = value;
    }
    
    public NodeTree getFilhoEsquerdo(){
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NodeTree filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public NodeTree getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(NodeTree filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
}
