package br.sistema.aluno.ufc;

import java.util.HashMap;
import java.util.Map;

public class AlunoPosGraduacao extends Aluno {
	
	// Atributos
	private String tituloPosGraduacao;
	Map<String, Disciplina> listaDisciplinas;

	// Construtor
	public AlunoPosGraduacao(String nome, String dataNascimento, String situacao, String tituloPosGraduacao,String usuario, String senha) {
		super(nome, dataNascimento, usuario, senha, situacao);
		this.tituloPosGraduacao = tituloPosGraduacao;
		this.listaDisciplinas = new HashMap<String, Disciplina>();
	}
	
	// Get e Set
	public void setTituloPosGraduacao(String tituloPosGraduacao) {
		this.tituloPosGraduacao = tituloPosGraduacao;
	}

	public Map<String, Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}


	@Override
	public void emitirHistorico() {
		// TODO Auto-generated method stub

	}

	// Matricular em disciplina
	public void addDisciplina(Disciplina disciplina) throws Exception {
		if (listaDisciplinas.containsKey(disciplina.getNome())) {
			throw new Exception("Erro || Não foi possível fazer o cadastro.");

		}
		listaDisciplinas.put(disciplina.getNome(), disciplina);

	}

	// Imprimir disciplinas já cadastradas
	public void imprimirDisciplinas() {
		for (Disciplina disciplinasMatr : listaDisciplinas.values()) {
			System.out.println(disciplinasMatr);
		}
	}
	// To String
		@Override
		public String toString() {
			return "Aluno de Pos Graduação ["+this.getNome()+ "], Matricula: [" +getMatricula()+"], [ Titulo da Pós-Graduação: " + tituloPosGraduacao + "], [Disciplinas: " + listaDisciplinas + "]";
		}
}
