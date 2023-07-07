package br.sistema.aluno.ufc;

import java.util.HashMap;
import java.util.Map;

public class Instituicao {
	// Atributos
	private String nome;
	Map<String, Professor> listaDeProfessores;
	Map<String, Curso> listaDeCursos;
	Map<String, Aluno> alunosMatriculados;

	// Construtor
	public Instituicao(String nome) {
		this.nome = nome;
		this.listaDeProfessores = new HashMap<String, Professor>();
		this.listaDeCursos = new HashMap<String, Curso>();
		this.alunosMatriculados = new HashMap<String, Aluno>();
	}

	// Construtor
	public Instituicao() {
	}

	// Get e Set
	public Map<String, Professor> getListaDeProfessores() {
		return listaDeProfessores;
	}

	public void setListaDeProfessores(Map<String, Professor> listaDeProfessores) {
		this.listaDeProfessores = listaDeProfessores;
	}

	public Map<String, Curso> getListaDeCursos() {
		return listaDeCursos;
	}

	public void setListaDeCursos(Map<String, Curso> listaDeCursos) {
		this.listaDeCursos = listaDeCursos;
	}

	public Map<String, Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	// implementar
	public void gerarHistorico(Aluno aluno) {

	}

	// Adiciona curso
	public void addCurso(Curso curso) throws Exception {
		if (listaDeCursos.containsKey(curso.getNomeCurso())) {
			throw new Exception("Erro || Curso já existe");
		}
		listaDeCursos.put(curso.getNomeCurso(), curso);

	}
	
	// Imprimir cursos
		public void imprimirCurso() {
			for (Curso cursoDisponivel : listaDeCursos.values()) {
				System.out.println(cursoDisponivel);
			}
		}

	// Adiciona professor
	public void addProfessor(Pessoa professor) throws Exception {
		if (listaDeProfessores.containsKey(professor.getNome())) {
			throw new Exception("Erro || Professor já cadastrado.");

		}
		listaDeProfessores.put(professor.getNome(), (Professor) professor);
	}

	// Demitir professor
	public void demitirProfessor(Professor professor) throws Exception {
		if (listaDeProfessores.containsKey(professor.getNome())) {
			listaDeProfessores.remove(professor.getNome());
		}
		throw new Exception("Erro || Professor não encontrado.");
	}

	// Imprimir professores
	public void imprimirProfessores() {
		for (Professor professor : listaDeProfessores.values()) {
			System.out.println(professor);

		}
	}

	// Adicionar alunos
	public void matricularAluno(Aluno aluno) throws Exception {
		if (alunosMatriculados.containsKey(aluno.getNome())) {
			throw new Exception("Erro || Aluno já matriculado.");

		}
		alunosMatriculados.put(aluno.getNome(), aluno);
	}

	public void jubilarAluno(Aluno aluno) throws Exception {
		if (aluno != null && alunosMatriculados.containsValue(aluno)) {
			alunosMatriculados.remove(aluno.getNome());
		}
		throw new Exception("Erro || Aluno não encontrado.");
	}

	// Imprimir alunos
	public void imprimirAlunos() {
		for (Aluno aluno : alunosMatriculados.values()) {
			System.out.println(aluno);

		}
	}
	
	// To String
	@Override
	public String toString() {
		return "Instituicao [nome=" + nome + ", listaDeProfessores=" + listaDeProfessores.size() + ", listaDeCursos="
				+ listaDeCursos.size() + "]";
	}

}
