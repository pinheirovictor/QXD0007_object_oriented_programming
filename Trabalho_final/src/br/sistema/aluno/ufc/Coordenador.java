package br.sistema.aluno.ufc;


public class Coordenador extends Professor{
	
	public Coordenador(String nome, String dataNascimento, String titulo, String usuario, String senha) {
		super(nome, dataNascimento, titulo, usuario, senha);
	}

	public void addDisciplina(Curso curso) {

	}
	
	public  boolean login(String usuario, String senha) {
		if(getUsuario().equals(usuario) && getSenha().equals(senha)) {
			return true;
		}else {
			return false;
		}
	}

}
