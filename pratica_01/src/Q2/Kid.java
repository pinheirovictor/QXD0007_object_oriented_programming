package Q2;

public class Kid {

	private String nome;
	private int age;

	public Kid() {

	}

	public Kid(String nome, int age) {
		this.nome = nome;
		this.age = age;
	}

	public String getNome() {
		return nome;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", age=" + age + "]";
	}

}
