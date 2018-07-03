/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresoo;

/**
 *
 * @author egouvea
 */
public class Compra {
    int quantidade;
    Ingresso ingresso;
    int n_card;
    
    public int calculaTotal(Ingresso i, int quantidade){
        int total = i.preço*quantidade;
        return total;
    
}
}