package Q_1;

public class Passageiro {

	String id;
	int idade;

	public Passageiro(String id, int idade) {
		this.id = id;
		this.idade = idade;
	}

	public String toString() {
		return this.id + ":" + this.idade;
	}

	public boolean preferencial() {
		return (idade >= 60);
	}
}
