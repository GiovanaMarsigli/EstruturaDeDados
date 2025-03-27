package fila;

public class Fila {
    private Object[] objetos = new Object[10];
    private int inicio = 0; 
    private int fim = 0;
    private int totalDeObjetos = 0;

     public void enfileira(Object objeto) {
        if (totalDeObjetos == objetos.length) {
            // se a fila estiver cheia, desloca os elementos para frente
            for (int i = 0; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            fim = totalDeObjetos - 1; 
        }

        objetos[fim] = objeto;
        fim = (fim + 1) % objetos.length; 
        totalDeObjetos++;
    }

     public void desenfileira() {
        if (totalDeObjetos > 0) {
            objetos[inicio] = null;
            inicio = (inicio + 1) % objetos.length; 
            totalDeObjetos--;
        } else {
            System.out.println("Fila vazia!");
        }
    }

    //primeiro elemento da fila sem removê-lo
    public Object primeiro() {
        if (totalDeObjetos > 0) {
            return objetos[inicio];
        } else {
            return null;
        }
    }

    //último elemento da fila sem removê-lo
    public Object ultimo() {
        if (totalDeObjetos > 0) {
            int ultimoIndice = (fim - 1 + objetos.length) % objetos.length;
            return objetos[ultimoIndice];
        } else {
            return null;
        }
    }

    //número de elementos na fila
    public int tamanho() {
        return totalDeObjetos;
    }

    //verifica se a fila está vazia
    public boolean vazia() {
        return totalDeObjetos == 0;
    }
}
