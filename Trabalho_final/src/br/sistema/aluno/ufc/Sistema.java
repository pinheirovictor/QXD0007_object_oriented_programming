package br.sistema.aluno.ufc;

import java.util.Scanner;

public class Sistema {

	public static String help() {
		return "1- Mostra todos os Cursos\n"
				+ "2- Matricula Aluno (Nome: Data Nascimento: Situação: Usuario:  Senha: )\n"
				+ "3- Remover Aluno (Nome: )\n"
				+ "4- Cadastrar Professor (Nome: Data Nascimento: Titulo: Usuario:  Senha: )\n"
				+ "5- Imprirmir Professor  \n" + "6- Imprirmir Todos Alunos Matriculados  \n"
				+ "7- Mostrar Todas as Disciplinas de SI  \n" + "8- Mostrar Todos os Alunos de SI  \n"
				+ "9- Mostrar Todas as Disciplinas de ES  \n" + "10- Mostrar  Todos os Alunos de ES \n"
				+ "11- Mostrar Todas as Disciplinas de EC  \n" + "12- Mostrar Todos os Alunos de EC \n"
				+ "13- Mostrar Todas as Disciplinas de CC  \n" + "14- Mostrar Todos os Alunos de CC  \n"
				+ "15- Mostrar Todas as Disciplinas de DD  \n" + "16- Mostrar Todos os Alunos de DD  \n"
				+ "Sair #Termina o programa";
	}

	public static void main(String[] args) throws Exception {

		// console inicializados
		Scanner input = new Scanner(System.in);

		// intancia de instituição
		Instituicao instituicao = new Instituicao("Universidade Federal do Ceará");

		// instancia de curso
		Coordenador csi = new Coordenador("Jefferson Carvalho", "11/07", "Doutorado", "carvalho", "carvalho2014");
		Curso si = new Curso("Sistemas de Informação", csi, 00111, 4200);

		Coordenador ces = new Coordenador("Luandersson Evangelista", "28/11", "Pós-Doutorado", "evangelista",
				"evangelista123");
		Curso es = new Curso("Engenharia de Software", ces, 00122, 3600);

		Coordenador cec = new Coordenador("Wagner Al-Alam", "06/06", "Graduando", "alam", "alam2016");
		Curso ec = new Curso("Engenharia de Computação", cec, 000133, 3800);

		Coordenador ccc = new Coordenador("David Senna", "12/02", "Pós-Doutorado", "senna", "david224466");
		Curso cc = new Curso("Ciência da Computação", ccc, 00144, 3760);

		Coordenador cdd = new Coordenador("Pablo Vittar", "24/11", "Mestrado", "vittar", "pablo1234");
		Curso dd = new Curso("Desing Digital", cdd, 00155, 2400);

		// add professor
		instituicao.addProfessor(csi);
		instituicao.addProfessor(ces);
		instituicao.addProfessor(cec);
		instituicao.addProfessor(ccc);
		instituicao.addProfessor(cdd);

		// metodo addcurso
		instituicao.addCurso(si);
		instituicao.addCurso(es);
		instituicao.addCurso(ec);
		instituicao.addCurso(cc);
		instituicao.addCurso(dd);

		// istancia de disciplina
		Disciplina fup = new Disciplina("Fundamentos de Programação", 4);
		Disciplina basica = new Disciplina("Matemática Básica", 4);
		Disciplina tga = new Disciplina("Teoria Geral da Administração", 4);
		Disciplina isi = new Disciplina("Introdução a Sistemas de Informação", 4);
		Disciplina precalculo = new Disciplina("Pré-Cálculo", 2);

		// metodo addDisciplina no curso de sistemas de informação
		si.addDisciplina(fup);
		si.addDisciplina(basica);
		si.addDisciplina(tga);
		si.addDisciplina(isi);
		si.addDisciplina(precalculo);

		// istancia de disciplina
		// Disciplina fup2 = new Disciplina("Fundamentos de Programação", 4);
		// Disciplina basica2 = new Disciplina("Matemática Básica", 4);
		Disciplina etica = new Disciplina("Ética", 2);
		Disciplina ies = new Disciplina("Introdução a Engenharia de Softaware", 4);

		// metodo addDisciplina no curso de engenharia de software
		es.addDisciplina(fup);
		es.addDisciplina(basica);
		es.addDisciplina(etica);
		es.addDisciplina(ies);

		// istancia de disciplina
		// Disciplina fup3 = new Disciplina("Fundamentos de Programação", 4);
		// Disciplina basica3 = new Disciplina("Matemática Básica", 4);
		Disciplina ci = new Disciplina("Circuitos Integrados", 4);
		Disciplina ac = new Disciplina("Arquitetura de Computadores", 4);
		// Disciplina precalculo2 = new Disciplina("Pré-Cálculo", 4);

		// metodo addDisciplina no curso de engenharia de computação
		ec.addDisciplina(fup);
		ec.addDisciplina(basica);
		ec.addDisciplina(ci);
		ec.addDisciplina(ac);
		ec.addDisciplina(precalculo);

		// istancia de disciplina
		// Disciplina fup4 = new Disciplina("Fundamentos de Programação", 4);
		// Disciplina basica4 = new Disciplina("Matemática Básica", 4);
		// Disciplina ci = new Disciplina("Circuitos Integrados", 4);
		// Disciplina ac = new Disciplina("Arquitetura de Computadores", 4);
		// Disciplina precalculo2 = new Disciplina("Pré-Cálculo", 4);

		// metodo addDisciplina no curso de engenharia de computação
		cc.addDisciplina(fup);
		cc.addDisciplina(basica);
		cc.addDisciplina(ci);
		cc.addDisciplina(ac);
		cc.addDisciplina(precalculo);

		// istancia de disciplina
		// Disciplina fup5 = new Disciplina("Fundamentos de Programação", 4);
		// Disciplina basica4 = new Disciplina("Matemática Básica", 4);
		// Disciplina ci = new Disciplina("Circuitos Integrados", 4);
		// Disciplina ac = new Disciplina("Arquitetura de Computadores", 4);
		Disciplina desenho = new Disciplina("Desenho 1", 4);
		Disciplina hisarte = new Disciplina("História da Arte", 4);

		// metodo addDisciplina no curso de engenharia de computação
		dd.addDisciplina(fup);
		dd.addDisciplina(basica);
		dd.addDisciplina(hisarte);
		dd.addDisciplina(etica);
		dd.addDisciplina(desenho);

		// criação da turma de si
		// Turma turmasi = new Turma(2017, "QX00087", 2, "08:00", csi);

		try {
			// adcionar alunos

			// aluno 01 de si
			AlunoGraduacao aluno = new AlunoGraduacao("Maria Osnete Castelo Branco", "11/11/1999", "Ativo", "castelo",
					"osnete5515");
			instituicao.matricularAluno(aluno);
			si.matricularAluno(aluno);
			aluno.addDisciplina(fup);
			fup.matricularAluno(aluno);

			// outra disciplina ao aluno 01 de si
			aluno.addDisciplina(tga);
			tga.matricularAluno(aluno);

			// aluno 02 de si
			AlunoGraduacao aluno2 = new AlunoGraduacao("Pedro de Alcântara Souza", "03/05/1996", "Ativo", "alcantara",
					"sousa2013");
			instituicao.matricularAluno(aluno2);
			si.matricularAluno(aluno2);
			aluno2.addDisciplina(precalculo);
			fup.matricularAluno(aluno2);

			// outra disciplina ao aluno 02 de si
			aluno2.addDisciplina(basica);
			basica.matricularAluno(aluno2);

			// aluno 01 de es
			AlunoGraduacao aluno3 = new AlunoGraduacao("Sabrina Franco de Almeida Fragoso", "24/11/1970", "Ativo",
					"fragoso", "sabrinalulu17");
			instituicao.matricularAluno(aluno3);
			es.matricularAluno(aluno3);
			aluno3.addDisciplina(ac);
			fup.matricularAluno(aluno3);

			// outra disciplina ao aluno 01 de es
			aluno3.addDisciplina(etica);
			etica.matricularAluno(aluno3);

			// aluno 02 de es
			AlunoGraduacao aluno4 = new AlunoGraduacao("Carlos Eduardo Andrade Júnior", "08/09/1978", "Ativo", "junior",
					"dudu2018");
			instituicao.matricularAluno(aluno4);
			es.matricularAluno(aluno4);
			aluno4.addDisciplina(etica);
			fup.matricularAluno(aluno4);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		boolean sair = false;

		System.out.print("\t \t \t \t \t \t>> Universidade Federal do Ceará - Campus Quixadá<<");
		System.out.print("\n \t \t \t \t \t \t \t >> Sistema de Gestão de Alunos <<");

		while (!sair) {
			System.out.print("\n >>>");
			String linha = input.nextLine();
			String[] comando = linha.split(" ");
			String operacao = comando[0];
			switch (operacao) {

			case "menu":
				System.out.println(help());
				break;

			case "1": // impirmir todos os cursos
				instituicao.imprimirCurso();
				break;

			case "2": // matricular aluno
				try {
					String nome = comando[1];
					String dataNascimento = comando[2];
					String situacao = comando[4];
					String usuario = comando[5];
					String senha = comando[6];

					Aluno aluno5 = new AlunoGraduacao(nome, dataNascimento, situacao, usuario, senha);
					instituicao.matricularAluno(aluno5);

					System.out.println("Sucesso || Aluno Matriculado");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case "3":// jubilar aluno
				String nome = comando[1];
				try {
					instituicao.jubilarAluno(instituicao.getAlunosMatriculados().get(nome));
					System.out.println("Sucesso || Aluno Jubilado da Instituição");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case "4": // cadastrar professor
				String nomepro = comando[1];
				String dataNascimento = comando[2];
				String titulo = comando[3];
				String usuario = comando[4];
				String senha = comando[5];
				try {
					Pessoa professor = new Professor(nomepro, dataNascimento, titulo, usuario, senha);
					instituicao.addProfessor(professor);
					System.out.println("Sucesso || Professor Cadastrado");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case "5": // impirmir professores da instiruição
				instituicao.imprimirProfessores();
				break;

			case "6": // imprimir alunos da instituição
				instituicao.imprimirAlunos();
				break;

			case "7": // imprimir disciplinas de si
				si.imprimirDisciplinas();
				break;

			case "8": // imprimir alunos de si
				si.imprimirAlunos();
				break;

			case "9": // imprimir disciplinas de es
				es.imprimirDisciplinas();
				break;

			case "10":
				es.imprimirAlunos();
				break;

			case "11":
				ec.imprimirDisciplinas();
				break;

			case "12":
				ec.imprimirAlunos();
				break;

			case "13":
				cc.imprimirDisciplinas();
				break;

			case "14":
				cc.imprimirAlunos();
				break;

			case "15":
				dd.imprimirDisciplinas();
				break;

			case "16":
				dd.imprimirAlunos();
				break;

			case "sair":
				sair = true;
				input.close();
				System.out.println("Fim || programa finalizado");
				break;

			default:
				System.out.println("Erro || Comando não encontrado");
				break;

			}
		}
	}
}
