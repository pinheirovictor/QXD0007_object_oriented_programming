package Q_1;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

	private Map<String, Contato> contatos;
	private Map<String, Contato> favoritos;

	public Agenda() {
		this.contatos = new HashMap<String, Contato>();
		this.favoritos = new HashMap<String, Contato>();
	}

	public Map<String, Contato> getContatos() {
		return contatos;
	}

	public void setContatos(Map<String, Contato> contatos) {
		this.contatos = contatos;
	}

	public Map<String, Contato> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(Map<String, Contato> favoritos) {
		this.favoritos = favoritos;
	}

	public boolean addContato(Contato contato) {
		if (this.contatos.containsKey(contato.getNome())) {
			return false;
		}
		this.contatos.put(contato.getNome(), contato);
		return true;
	}

	public Contato getContatos(String nome) {
		if (!this.contatos.containsKey(nome)) {
			return null;
		}
		return this.contatos.get(nome);
	}

	public boolean deletarContato(String nome) {
		if (this.contatos.containsKey(nome)) {
			this.contatos.remove(nome);
			return true;
		}
		return false;
	}

	public boolean favoritar(String nome) {
		if (this.contatos.containsKey(nome)) {
			Contato contato = this.contatos.get(nome);
			if (!contato.isFavoritar() == true) {
				this.favoritos.put(nome, contato);
				contato.setFavoritar(true);
				return true;
			}
		}
		return false;
	}

	public boolean desfavoritar(String nome) {
		if (this.contatos.containsKey(nome)) {
			Contato contato = this.contatos.get(nome);
			if (contato.isFavoritar() == true) {
				contato.setFavoritar(false);
				this.favoritos.remove(nome);
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String saida = "Contatos:\n";
		saida += this.getContatos();
		return saida;
	}

	public String getContatosFavoritos() {
		String saida = "";
		for (Contato contato : this.favoritos.values())
			saida += contato + "\n";
			return saida;
	}
	
	

}
