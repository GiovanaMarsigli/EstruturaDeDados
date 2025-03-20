/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercíciofilano;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");

        System.out.println("Mostrar fila:");
        fila.imprime();

        fila.desenfileira();
        
        System.out.println("\nFila após remoção:");
        fila.imprime();
    }
}