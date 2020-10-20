package Q_2;

public class Transacao {

	int id;
	String codenome;
	float valor;

	public Transacao(int id, String codenome, float valor) {
		this.id = id;
		this.codenome = codenome;
		this.valor = valor;
	}

	int comparaClientes(Cliente um, Cliente dois) {
		return um.codenome.compareTo(dois.codenome);
	}

	public String toString() {
		return "[" + this.id + ":" + this.codenome + ":" + this.valor + "]";
	}

}
