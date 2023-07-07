
package br.sistema.aluno.ufc;
import java.util.HashMap;
import java.util.Map;

public class Turma {
	private int ano;
	private String codigo;
	private int semestre;
	private String horario;
	private Professor professor;
	Map<Integer, Aluno> alunosTurma;
	Map<String, Disciplina> disciplinasturma;

	// Construtor
	public Turma(int ano, String codigo, int semestre, String horario, Professor professor) {
		super();
		this.ano = ano;
		this.codigo = codigo;
		this.semestre = semestre;
		this.horario = horario;
		this.professor = professor;
		this.alunosTurma = new HashMap<Integer, Aluno>();
		this.disciplinasturma = new HashMap<String, Disciplina>();
	}

	// Get e Set
	public int getAno() {
		return ano;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getSemestre() {
		return semestre;
	}

	public String getHorario() {
		return horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Map<Integer, Aluno> getAlunosTurma() {
		return alunosTurma;
	}
	
	public Map<String, Disciplina> getDisciplinasturma() {
		return disciplinasturma;
	}

	//to string
	@Override
	public String toString() {
		return "Turma [Ano: " + ano + ", Código: " + codigo + ", Semestre: " + semestre + ", Horário: " + horario
				+ ", Professor: " + professor + ", Alunos da Turma: " + alunosTurma + ", Disciplinas da turma: " + disciplinasturma
				+ "]";
	}	

}
