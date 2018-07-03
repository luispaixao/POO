/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresoo;

import java.util.*;

/**
 *
 * @author egouvea
 */
public class IngresOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	int Opcao = 0, show = 0, compra = 0;
                
		Scanner teclado = new Scanner(System.in);
		Shows s = new Shows();
		s.Inicializa();
		while (Opcao != 99) {
			Shows.MostraMenu();
			Opcao = teclado.nextInt();
                        if (Opcao != 99){
                            show = Shows.MostraShows(Opcao);
                            compra = Shows.MostraIngressos(Opcao, show);
                        }
			}
	
		teclado.close();
		}

    }
