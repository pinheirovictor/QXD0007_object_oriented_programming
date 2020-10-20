package Q_1;

import java.util.ArrayList;

public class Topic {

	ArrayList<Passageiro> poltronas;
	int quantidadePreferenciais;

	// metodo construtor da classe topic
	public Topic(int capacidade, int quantidadePreferenciais) {
		poltronas = new ArrayList<Passageiro>();
		for (int i = 0; i < capacidade; i++) {
			poltronas.add(null);
		}
		this.quantidadePreferenciais = quantidadePreferenciais;
	}

	// metodo de inserir passageiro na topic
	private boolean inserir(int inicio, int fim, Passageiro pass) {
		for (int i = inicio; i < fim; i++) {
			if (poltronas.get(i) == null) {
				poltronas.set(i, pass);
				return true;
			}
		}
		return false;
	}

	// metodo inserir passageiros na topic
	public void inserir(Passageiro passageiro) {
		if (passageiro.preferencial()) {
			inserir(0, this.poltronas.size(), passageiro);
		} else {
			if (!inserir(this.quantidadePreferenciais, this.poltronas.size(), passageiro))
				inserir(0, this.quantidadePreferenciais, passageiro);
		}
	}

	//metodo de remover passageiros
	public boolean remover(String id) {
		for (int i = 0; i < poltronas.size(); i++) {
			if (poltronas.get(i) != null) {
				if (poltronas.get(i).id.equals(id)) {
					poltronas.set(i, null);
					return true;
				}
			}
		}
		return false;
	}

	// metodo toString
	public String toString() {
		String saida = "[";
		for (int i = 0; i < poltronas.size(); i++) {
			if (i < quantidadePreferenciais)
				saida += " @";
			else
				saida += " =";
			if (poltronas.get(i) != null)
				saida += poltronas.get(i);
		}
		return saida + " ]";
	}
}
