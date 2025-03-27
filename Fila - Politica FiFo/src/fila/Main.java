package fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileira("Andressa");
        fila.enfileira("Bella");
        fila.enfileira("Camila");

        System.out.println("Primeiro da fila: " + fila.primeiro()); 
        System.out.println("Último da fila: " + fila.ultimo());

        // Teste de desenfileiramento
        fila.desenfileira();
        System.out.println("Novo primeiro da fila: " + fila.primeiro()); 

        //tamanho e estado da fila
        System.out.println("Tamanho da fila: " + fila.tamanho()); 
        System.out.println("Fila está vazia? " + fila.vazia()); 

        //esvaziar a fila
        fila.desenfileira();
        fila.desenfileira();
        System.out.println("Fila está vazia? " + fila.vazia()); 

        //enfileirar após esvaziar
        fila.enfileira("X");
        System.out.println("Primeiro da fila: " + fila.primeiro()); 
    }
}
