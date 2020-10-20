package Q_1;

public class Fone {

	private String foneId;
	private String numero;

	public Fone(String foneId, String numero) {
		this.foneId = foneId;
		this.numero = numero;
	}

	public Fone() {

	}

	public String getFoneId() {
		return foneId;
	}

	public void setFoneId(String foneId) {
		this.foneId = foneId;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Fone [foneId=" + foneId + ", numero=" + numero + "]";
	}

}
