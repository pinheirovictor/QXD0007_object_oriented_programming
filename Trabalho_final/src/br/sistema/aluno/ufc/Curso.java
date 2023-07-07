package br.sistema.aluno.ufc;

import java.util.HashMap;
import java.util.Map;

public class Curso {

	// Atributos
	private String nomeCurso;
	private Coordenador coordenador;
	private int codigo;
	private int cargaHorario;
	Map<String, Disciplina> disciplinasCurso;
	Map<String, Aluno> alunosCurso;

	// Construtor
	public Curso(String nomeCurso, Coordenador coordenador, int codigo, int cargaHorario) {
		super();
		this.nomeCurso = nomeCurso;
		this.coordenador = coordenador;
		this.codigo = codigo;
		this.cargaHorario = cargaHorario;
		this.disciplinasCurso = new HashMap<String, Disciplina>();
		this.alunosCurso = new HashMap<String, Aluno>();
	}

	// Get
	public Coordenador getCoordenador() {
		return coordenador;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getCargaHorario() {
		return cargaHorario;
	}

	public Map<String, Disciplina> getDisciplinasCurso() {
		return disciplinasCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	// Adicionar curso
	public void addDisciplina(Disciplina disciplina) throws Exception {
		if (disciplinasCurso.containsKey(disciplina.getNome())) {
			throw new Exception("Erro || Curso já ofertado.");
		}
		disciplinasCurso.put(disciplina.getNome(), disciplina);
	}

	// Imprimir cursos
	public void imprimirDisciplinas() {
		for (Disciplina disciplinasCurso : this.disciplinasCurso.values()) {
			System.out.println(disciplinasCurso);
		}
	}

	// Adicionar alunos
	public void matricularAluno(Aluno aluno) throws Exception {
		if (alunosCurso.containsKey(aluno.getNome())) {
			throw new Exception("Erro || Aluno já matriculado.");

		}
		alunosCurso.put(aluno.getNome(), aluno);
	}

	// Imprimir alunos
	public void imprimirAlunos() {
		for (Aluno aluno : alunosCurso.values()) {
			System.out.println(aluno);

		}
	}

	// To String
	@Override
	public String toString() {
		return "Curso: " + this.nomeCurso + " \n [Coordenador: " + coordenador + ", Código: " + codigo
				+ ", Carga horária: " + cargaHorario + "," + " Disciplinas do curso: " + disciplinasCurso.size()
				+ "]\n\n";
	}

}
