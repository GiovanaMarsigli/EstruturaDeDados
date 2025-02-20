/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhaprimeiraed;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class CarrinhoDeCompras {
    private double frete = 0;
    private double total_a_pagar =0;
    
    MinhaPrimeiraED carrinho = new MinhaPrimeiraED();
    
    public void adicionaBebida(Bebida item){
        carrinho.adiciona(item);
        total_a_pagar += item.getPreco();
    }
    
    public void adicionaPizza(Pizza item){
    carrinho.adiciona(item);
        total_a_pagar += item.getPreco();
    }
    
    public double getTotalPagar(){
        return total_a_pagar;
    }

    String getTotalPagar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
