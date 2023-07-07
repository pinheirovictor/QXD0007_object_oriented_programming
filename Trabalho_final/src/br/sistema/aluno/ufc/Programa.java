package br.sistema.aluno.ufc;

import java.util.Scanner;

public class Programa {

	public static String menu() {
		return "Aluno: parte do aluno\n" + "Professor: parte do professor\n" + "Coordenador: parte do coordenador\n"
				+ "Secretaria: parte da secretátia\n" + "Sair: Termina o programa";
	}

	public static String menuAluno() {
		return "1: Gerar Histórico \n" + "2: Mostrar Disciplinas Matriculadas\n" + "3: Mostrar Notas das Disciplinas \n"
				+ "4: Mostrar Notas e Frequência\n" + "Sair: Terminar o programa";
	}

	public static String menuProfessor() {
		return "1: Mostrar Disciplinas do Semestre\n" + "2: Lançar notas\n" + "3:Lançar Frequêcnia\n"
				+ "4: Lançar Avisos \n" + "Sair: Terminar o programa";
	}

	public static String menuCoordenador() {
		return "1: Mostrar Disciplinas do Semestre\n" + "2: Mostrar Alunos do Curso\n" + "Sair: Terminar o programa";
	}

	public static String menuSecretaria() {
		return "1: Mostra todos os Cursos\n"
				+ "2: Matricula Aluno (Nome: Data Nascimento: Situação: Usuario:  Senha: )\n"
				+ "3: Remover Aluno (Nome: )\n"
				+ "4: Cadastrar Professor (Nome: Data Nascimento: Titulo: Usuario:  Senha: )\n"
				+ "5: Imprirmir Professor  \n" + "6: Imprirmir Todos Alunos Matriculados  \n"
				+ "7: Mostrar Todas as Disciplinas de SI  \n" + "8: Mostrar Todos os Alunos de SI  \n"
				+ "9: Mostrar Todas as Disciplinas de ES  \n" + "10: Mostrar  Todos os Alunos de ES \n"
				+ "11: Mostrar Todas as Disciplinas de EC  \n" + "12: Mostrar Todos os Alunos de EC \n"
				+ "13: Mostrar Todas as Disciplinas de CC  \n" + "14: Mostrar Todos os Alunos de CC  \n"
				+ "15: Mostrar Todas as Disciplinas de DD  \n" + "16: Mostrar Todos os Alunos de DD  \n"
				+ "Sair: Termina o programa";
	}

	public static void main(String[] args) throws Exception {

		// console inicializados
		Scanner input = new Scanner(System.in);

		// intancia de instituição
		Instituicao instituicao = new Instituicao("Universidade Federal do Ceará");


		// metdodos scanner para os whiles
		Scanner inputAluno = new Scanner(System.in);
		Scanner inputProfessor = new Scanner(System.in);
		Scanner inputCoordenador = new Scanner(System.in);
		Scanner inputSecretaria = new Scanner(System.in);

		// variaveis booleanas para whiles
		boolean sair = false;
		boolean sairAluno = false;
		boolean sairProfessor = false;
		boolean sairCoordenador = false;
		boolean sairSecretaria = false;

		while (!sair) {
			System.out.print(">>>");
			String linha = input.nextLine();
			String[] comando = linha.split(" ");
			String operacao = comando[0];
			switch (operacao) {

			case "menu":
				System.out.println(menu());
				break;
			case "Aluno":
				System.out.println(">>Aluno || Digite seu usuario: ");
				String usuario = input.nextLine();

				System.out.println(">> Aluno || Digite sua senha: ");
				String senha = input.nextLine();
				AlunoGraduacao aluno2 = new AlunoGraduacao("", "dataNascimento", "situacao", "victor", "pinheiro2014");

				if (usuario.equals(aluno2.getUsuario()) && senha.equals(aluno2.getSenha())) {
					System.out.println("Sucesso || Aluno logado com sucesso");
					do {
						System.out.print(">>");
						String linha1 = input.nextLine();
						String[] comando1 = linha1.split(" ");
						String operacao1 = comando1[0];

						switch (operacao1) {

						case "menu":
							System.out.println(menuAluno());
							break;

						case "1":
							System.out.println("olá mundo ..... aluno logado");
							break;

						case "sair":
							sairAluno = true;
							inputAluno.close();
							System.out.println("Fim || do programa");
							break;

						default:
							System.out.println("Erro || Comando não encontrado");
							break;
						}
					} while (!sairAluno);
				} else {
					System.out.println("Erro || Usuario ou Senha inválidos");
				}
				break;


			case "Professor":
				break;
			}
		}
	}
}
