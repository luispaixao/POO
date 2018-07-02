package app;

import java.util.*;


public class IngresOO {
	public static void main(String[] args) {
		int Opcao = -2;
		Scanner teclado = new Scanner(System.in);
		List<Show> Shows = new ArrayList<>();
		Shows.add(new Show("Iron Maiden","The Trooper","Rio de Janeiro","10/12/2018", new String[] {"Pista","Cadeira Lateral"}));
                Shows.add(new Show("Coldplay","Parachutes","São Paulo","12/12/2018",new String[] {"Pista","Cadeira Lateral","Cadeira Superior","Camarote"}));       
                Shows.add(new Show ("U2","360","Rio de Janeiro","09/10/2018", new String[] {"Pista","Cadeira Lateral","Camarote"}));
                Shows.add(new Show ("Rolling Stones","A Bigger Bang","Belo Horizonte","10/10/2018", new String[] {"Pista","Cadeira Lateral","Cadeira Superior","Camarote"}));
                
		while (Opcao != -1) {
			Shows.MostraMenu(Shows,Opcao);                         
		}
	
		teclado.close();
	}
}


