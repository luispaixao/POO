package app;

import java.util.*;

public class Show {
	private String NomeDaBanda;
	private String Turne;
	private String Local;
	private String Data;
	private String[] TipoDeIngresso;
	
	public Show (String NomeDaBanda, String Turne, String Local, String Data, String[] TipoDeIngresso) {
		this.setNomeDaBanda(NomeDaBanda);
		this.setTurne(Turne);
		this.setLocal(Local);
		this.setData(Data);
		this.setTipoDeIngresso(TipoDeIngresso);
	}

	public String getNomeDaBanda() {
		return NomeDaBanda;
	}

	public void setNomeDaBanda(String nomeDaBanda) {
		NomeDaBanda = nomeDaBanda;
	}

	public String getTurne() {
		return Turne;
	}

	public void setTurne(String turne) {
		Turne = turne;
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		 Local = local;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	public String[] getTipoDeIngresso() {
		return TipoDeIngresso;
	}

	public void setTipoDeIngresso(String[] tipoDeIngresso) {
		TipoDeIngresso = tipoDeIngresso;
	}
        
        public void MostraMenu(List<Show> shows,int opcao) {
		for (int i=0;i<shows.size();i++) {
			System.out.println(i+1 + " - " + shows.get(i).getNomeDaBanda() + " - " +shows.get(i).getTurne());
		}
                System.out.println("Digite o número do show o qual você deseja saber mais: ");
                switch(opcao){
                    case 1:
                        System.out.println("show 1: " + shows.get(0).getNomeDaBanda() + " - " + " Turnê: " + shows.get(0).getTurne() + " - " + "Datas: " + shows.get(0).getData() + " - " + "Local: " + shows.get(0).getLocal());
                    case 2:
                        System.out.println("show 1: " + shows.get(1).getNomeDaBanda() + " - " + " Turnê: " + shows.get(1).getTurne() + " - " + "Datas: " + shows.get(1).getData() + " - " + "Local: " + shows.get(1).getLocal());
                    case 3:
                        System.out.println("show 1: " + shows.get(2).getNomeDaBanda() + " - " + " Turnê: " + shows.get(2).getTurne() + " - " + "Data: " + shows.get(2).getData() + " - " + "Local: " + shows.get(2).getLocal());
                    case 4:
                        System.out.println("show 1: " + shows.get(0).getNomeDaBanda() + " - " + " Turnê: " + shows.get(3).getTurne() + " - " + "Data: " + shows.get(3).getData() + " - " + "Local: " + shows.get(3).getLocal());
                }
        }
	
	
};
