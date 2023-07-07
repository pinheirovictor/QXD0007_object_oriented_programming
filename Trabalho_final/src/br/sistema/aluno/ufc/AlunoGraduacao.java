package br.sistema.aluno.ufc;

import java.util.HashMap;
import java.util.Map;

public class AlunoGraduacao extends Aluno implements Remunerado {

	// Atributos
	Map<String, Disciplina> listaDisciplinas;

	// Construtor
	public AlunoGraduacao(String nome, String dataNascimento, String situacao, String usuario, String senha) {
		super(nome, dataNascimento, usuario, senha, situacao);
		this.listaDisciplinas = new HashMap<String, Disciplina>();
	}

	// Get
	public Map<String, Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}

	@Override
	public float valorBolsa(int horasTrabalhadas, float valorHora) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void emitirHistorico() {
		// TODO Auto-generated method stub

	}
	
	// Matricular em disciplina
	public void addDisciplina(Disciplina disciplina) throws Exception {
		if (listaDisciplinas.size() >= 50) {
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

	// to String
	@Override
	public String toString() {
		return "Aluno de Graduacao: [" + this.getNome() + "], [ Matricula: " + getMatricula() + "], [Disciplinas: "
				+ listaDisciplinas.size() + "]";
	}

	

}
