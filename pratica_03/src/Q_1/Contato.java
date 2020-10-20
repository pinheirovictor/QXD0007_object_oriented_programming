package Q_1;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	private String nome;
	private List<Fone> fones = new ArrayList<Fone>();
	private boolean favoritar;

	public Contato(String nome) {
		this.nome = nome;
	}

	public Contato(String nome, boolean favoritar) {
		this.nome = nome;
		this.fones = new ArrayList<Fone>();
		this.favoritar = favoritar;
	}

	public Contato() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Fone> getFones() {
		return fones;
	}

	public void setFones(List<Fone> fones) {
		this.fones = fones;
	}

	public boolean isFavoritar() {
		return favoritar;
	}

	public void setFavoritar(boolean favoritar) {
		this.favoritar = favoritar;
	}

	// metodo de adionar telefone a lista de fones do contato
	public boolean addFone(Fone fone) {
		for (Fone fone1 : fones) {
			if (fone1.getFoneId() == fone.getFoneId()) {
				return false;
			}
		}
		this.fones.add(fone);
		return true;
	}

	// metodo de deletar fone a lista de fones do contato
	public boolean deletarFone(Fone fone1) {
		for (Fone fone : fones) {
			if (fone.getFoneId() == fone1.getFoneId()) {
				this.fones.remove(fone);
				return true;
			}
		}
		return false;
	}

	// metodo to strig
	public String toString() {
		String saida = "";
		saida += (this.favoritar) ? "@" : "-";
		saida += " " + this.nome;
		for (Fone fone : fones) {
			saida += fone;
		}
		return saida;
	}

}
