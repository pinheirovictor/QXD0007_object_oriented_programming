package br.sistema.aluno.ufc;

public abstract class Pessoa {
	// Atributos
	private String nome;
	private String dataNascimento;
	private String usuario;
	private String senha;

	// Construtor
	public Pessoa(String nome, String dataNascimento, String usuario, String senha) {
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
	}

	// Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + ", Data de nascimento:  " + dataNascimento + "]";
	}
	

}
