package Q_2;

public class Cliente {

	String codenome;
	String fullname;
	private int saldo;

	public Cliente(String codenome, String fullname) {
		this.codenome = codenome;
		this.fullname = fullname;
		this.saldo = 0;
	}

	void debitar(float valor) {
		this.saldo -= valor;
	}

	void creditar(float valor) {
		this.saldo += valor;
	}

	public String toString() {
		return "[" + codenome + ":" + saldo + "]";
	}

}
