package br.sistema.aluno.ufc;

import java.util.HashMap;
import java.util.Map;

public class Professor extends Pessoa {

	// Atributos
	private String titulo;
	private int id;
	private String usuario;
	private String senha;
	private static int nextId = 1;
	Map<String, Turma> turmasProfessores;

	//construtor
	public Professor(String nome, String dataNascimento,String titulo, String usuario, String senha) {
		super(nome, dataNascimento, usuario, senha);
		this.titulo = titulo;
		this.usuario = usuario;
		this.senha = senha;
		this.id = nextId;
		nextId++;
		this.turmasProfessores = new HashMap<String, Turma>();
		// Get e Set
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// To String
	@Override
	public String toString() {
		return "[Nome :" + getNome() + ",  Título: " + titulo + ", SIAP: " + id + "]";
	}

}
