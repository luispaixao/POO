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
public class Shows {

    static List<Turne> Turnes = new ArrayList<>();

    static public void MostraMenu() {
		// TODO Auto-generated method stub
                int item = 0;
		for (Turne turne : Turnes) {
			System.out.print(item + " - " + turne.getTurne() + "\n");
                        item++;
		}	
                System.out.print("99 - Sair\n");
	}

        static public int MostraIngressos(int Opcao, int show) {
		// TODO Auto-generated method stub
                int item = 0;
                Scanner teclado = new Scanner(System.in);
                Turne t = Shows.Turnes.get(Opcao);
                Turne.Show s = t.Itens.get(show);
		for (String i[] : s.TipoDeIngresso) {
			System.out.print(item + " - " + i[0] + " - " + i[1] + "\n");
                        item++;
		}
                System.out.print("Selecione: ");
                return teclado.nextInt();
	}

    
    public class Turne{
        String Nome;
        String NomeDaBanda;
        List<Show> Itens = new ArrayList<>();
        private class Show{
		private String Local;
		private String Data;
		private String[][] TipoDeIngresso;
		
		private Show (String Local, String Data, String[][] TipoDeIngresso) {
			this.setLocal(Local);
			this.setData(Data);
			this.setTipoDeIngresso(TipoDeIngresso);
		}
		
		private String getLocal() {
			return Local;
		}

		private void setLocal(String local) {
			Local = local;
		}

		private String getData() {
			return Data.substring(6,8)+"/"+Data.substring(4,6)+"/"+Data.substring(0,4);
		}

		private void setData(String data) {
			Data = data;
		}

		private String[][] getTipoDeIngresso() {
			return TipoDeIngresso;
		}

		private void setTipoDeIngresso(String[][] tipoDeIngresso) {
			TipoDeIngresso = tipoDeIngresso;
		}
		

	}
	
        public String getNomeDaBanda() {
            return NomeDaBanda;
        }

        public void setNomeDaBanda(String nomeDaBanda) {
            NomeDaBanda = nomeDaBanda;
        }

        public String getTurne() {
            return Nome;
        }

        public void setTurne(String turne) {
            Nome = turne;
        }

    }

    
    static public enum TiposDeIngressos {
	Pista,
	Cadeira_Lateral,
	Cadeira_Superior,
	Camarote;
    }
    public void Inicializa(){
        Turne t1 = new Turne();
        t1.setTurne("The Trooper");
        t1.setNomeDaBanda("Iron Maiden");
        Turne.Show s1 = t1.new Show("Rio de Janeiro", "20181010", new String[][] {{TiposDeIngressos.Pista.name(),"50,00"},{TiposDeIngressos.Cadeira_Lateral.name(),"70,00"}});
        t1.Itens.add(s1);
        Turne.Show s1s2=t1.new Show("Sao Paulo", "20181012", new String[][] {{TiposDeIngressos.Pista.name(),TiposDeIngressos.Cadeira_Lateral.name()});
        t1.Itens.add(s1s2);
        Shows.add(t1);
        Turne t2 = new Turne();
        t2.setTurne("Parachutes");
        t2.setNomeDaBanda("Coldplay");
        Turne.Show s2 = t2.new Show("São Paulo", "20181212", new String[][] {TiposDeIngressos.Pista.name(),TiposDeIngressos.Cadeira_Lateral.name(),TiposDeIngressos.Cadeira_Superior.name(),TiposDeIngressos.Camarote.name()});
        t2.Itens.add(s2);
        Shows.add(t2);
        Turne t3 = new Turne();
        t3.setTurne("360");
        t3.setNomeDaBanda("U2");
        Turne.Show s3 = t3.new Show("Rio de Janeiro", "20181210", new String[][] {TiposDeIngressos.Pista.name(),TiposDeIngressos.Cadeira_Lateral.name(),TiposDeIngressos.Camarote.name()});
        t3.Itens.add(s3);
        Shows.add(t3);
        Turne t4 = new Turne();
        t4.setTurne("A Bigger Bang");
        t4.setNomeDaBanda("Rolling Stones");
        Turne.Show s4= t4.new Show("Belo Horizonte","20180609", new String[] {TiposDeIngressos.Pista.name(),TiposDeIngressos.Cadeira_Lateral.name(),TiposDeIngressos.Cadeira_Superior.name(),TiposDeIngressos.Camarote.name()});
        t4.Itens.add(s4);
        Shows.add(t4);
    }

        static public void add(Turne t){
            Shows.Turnes.add(t);
        }

	
	

		
        
        public static int MostraShows(int n) {
            int num=0;
            Scanner teclado = new Scanner(System.in);
            Turne t = Turnes.get(n);
            System.out.println(t.getNomeDaBanda() + " - " + t.getTurne());
            for (Iterator<Turne.Show> it = t.Itens.iterator(); it.hasNext();) {
                Turne.Show item = it.next();
                System.out.print(num + " - " + item.getLocal() + " - " + item.getData() + "\n");
                num++;
            }
            
            System.out.print("Selecione: ");
            return teclado.nextInt();
        }
}
