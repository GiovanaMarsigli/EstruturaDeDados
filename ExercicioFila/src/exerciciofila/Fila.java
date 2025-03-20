/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciofila;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Fila {

    private Object vetor[];
    private int inicio, fim;

    // Cria uma Fila vazia
    public Fila() {
        this.vetor = new Object[10];
        this.inicio = 0;
        this.fim = this.inicio;
    }

    public Fila(int maxTam) {
        // Cria uma Fila vazia
        this.vetor = new Object[maxTam];
        this.inicio = 0;
        this.fim = this.inicio;
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }

    public void imprime() {
        for (int i = this.inicio; i != this.fim; i++) {
            System.out.print(this.vetor[i].toString() + " ");
        }
    }

    public void enfileira(Object valor) throws Exception {
        if ((this.fim + 1) > this.vetor.length) {
            throw new Exception("Erro: A fila está cheia");
        }
        this.vetor[this.fim] = valor;
        this.fim = (this.fim + 1);
    }

    public Object desenfileira() throws Exception {
        if (this.vazia()) {
            throw new Exception("Erro: A fila está vazia");
        }
        Object valor = this.vetor[this.inicio];
        this.inicio = (this.inicio + 1) % this.vetor.length;
        return valor;
    }

    
}