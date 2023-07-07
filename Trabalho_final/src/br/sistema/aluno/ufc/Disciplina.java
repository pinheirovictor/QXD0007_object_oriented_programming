package br.sistema.aluno.ufc;

import java.util.HashMap;
import java.util.Map;

public class Disciplina {
	// Atributos
	private String nome;
	private int creditos;
	private int codigoId;
	private static int proxCodigoId = 1;
	Map<String, Professor> professoresDisciplina;
	Map<String, Aluno> alunosDisciplina;

	// Construtor
	public Disciplina(String nome, int creditos) {
		super();
		this.nome = nome;
		this.creditos = creditos;
		this.codigoId = proxCodigoId;
		proxCodigoId++;
		this.professoresDisciplina = new HashMap<String, Professor>();
		this.alunosDisciplina = new HashMap<String, Aluno>();
	}

	// Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getCodigoId() {
		return codigoId;
	}

	public Map<String, Professor> getProfessoresDisciplina() {
		return professoresDisciplina;
	}

	public void setProfessoresDisciplina(Map<String, Professor> professoresDisciplina) {
		this.professoresDisciplina = professoresDisciplina;
	}

	// Adicionar professor a disciplina
	public void addProfessor(Pessoa professor) throws Exception {
		if (professoresDisciplina.containsKey(professor.getNome())) {
			throw new Exception("Erro || Professor já cadastrado na disciplina");
		}
		professoresDisciplina.put(professor.getNome(), (Professor) professor);

	}

	// Imprimir professores disponiveis
	public void imprimirProfessor() {
		for (Professor professorDisciplina : professoresDisciplina.values()) {
			System.out.println(professorDisciplina);

		}
	}

	// Adicionar alunos
	public void matricularAluno(Aluno aluno) throws Exception {
		if (alunosDisciplina.containsKey(aluno.getNome())) {
			throw new Exception("Erro || Aluno já matriculado.");

		}
		alunosDisciplina.put(aluno.getNome(), aluno);
	}

	// Imprimir alunos
	public void imprimirAlunos() {
		for (Aluno aluno : alunosDisciplina.values()) {
			System.out.println(aluno);

		}
	}

	// To String
	@Override
	public String toString() {
		return "Disciplina [Nome: " + nome + ", Créditos: " + creditos + ", Código: " + codigoId + "]";
	}

}
