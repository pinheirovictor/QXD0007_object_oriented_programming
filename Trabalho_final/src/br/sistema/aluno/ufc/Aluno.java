package br.sistema.aluno.ufc;

public abstract class Aluno extends Pessoa {

	// Atributos
	private int matricula;
	private String situacao;
	private static int proxMatricula = 1;

	// construtor
	public Aluno(String nome, String dataNascimento,String situacao, String usuario, String senha) {
		super(nome, dataNascimento, usuario, senha);
		this.matricula = proxMatricula;
		this.situacao = situacao;
		proxMatricula++;

	}

	// Get e Set
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	// Metodo emitir historico
	public abstract void emitirHistorico();

	// depos dcidir
	public double verificarAprovacao(double ap1, double ap2) {
		double media = (ap1 + ap2) / 2;
		if (media < 4) {
			System.out.println("Reprovado");
			return media;
		} else if (media >= 4) {
			System.out.println("Recuperação");
			return media;
		}
		System.out.println("Aprovado");
		return media;
	}

	// Matricular em disciplina
	public abstract void addDisciplina(Disciplina disciplina) throws Exception;

	// Imprimir disciplinas já cadastradas
	public abstract void imprimirDisciplinas();


}
