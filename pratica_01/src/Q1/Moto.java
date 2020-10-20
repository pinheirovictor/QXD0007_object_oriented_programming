package Q1;

public class Moto {

	private int potencia = 1;
	private int tempo;
	private Pessoa passageiro;

	public Moto() {

	}

	public Moto(int potencia) {
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public Pessoa getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Pessoa passageiro) {
		this.passageiro = passageiro;
	}

	// metodo para comprar tempo
	public void comprarTempo(int valor) {
		if (this.tempo > 1) {
			int result = this.tempo + valor;
			this.tempo = result;
			System.out.println("Seu novo tempo é de:" + this.tempo);
		} else {
			System.out.println("Tempo esgotado!!! desça da moto");
		}

	}

	// metodo subir na moto
	public void subir(Pessoa passageiro) {
		if (this.passageiro == null) {
			this.passageiro = passageiro;
		} else {
			System.out.println("Moto com alguém sentado nela");
		}

	}

	// metodo descer da moto
	public void descer() {
		if (this.passageiro != null) {
			this.passageiro = null;
		} else {
			System.out.println("Nao tem ninguem na moto");
		}
	}

	// metdo de buzinar
	public String buzinar() {
		if (this.passageiro == null) {
			String falha = "falha, moto vazia";
			return falha;
		} else {
			String resultado = "";
			for (int i = 0; i < this.potencia; i++)
				resultado += "e";
			return "P" + resultado + "m";
		}
	}

	// metodo dirigir a moto
	public void dirigir(int tempo) {
		if (this.passageiro == null) {
			System.out.println("Nao tem ninguem na moto");
		} else if (this.passageiro.getIdade() < 2) {
			System.out.println("Muito pequeno pra andar de moto");
		} else if (this.passageiro.getIdade() > 10) {
			System.out.println("Muito grande pra andar de moto");
		} else if (this.passageiro.getIdade() > 2 && this.passageiro.getIdade() <= 10 && tempo > 0) {
			System.out.println(this.passageiro.getNome() + ":" + buzinar() + "Andou por:" + tempo);
		}
	}

	@Override
	public String toString() {
		return "Moto [potencia=" + potencia + ", tempo=" + tempo + ", passageiro=" + passageiro + "]";
	}

}
