package Q_1;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Contato joao = new Contato("joao");
		joao.addFone(new Fone("OI", "09876543"));
		joao.addFone(new Fone("VIVO", "00000000"));
		agenda.addContato(joao);

		agenda.addContato(new Contato("Victor"));
		Contato victor = agenda.getContatos("Victor");
		victor.addFone(new Fone("CLARO", "0987654"));

		agenda.addContato(new Contato("Silva"));
		agenda.favoritar("Silva");
		agenda.favoritar("Victor");

		System.out.println(agenda.getContatosFavoritos());
		
		Contato luis = new Contato("Luis");
		luis.addFone(new Fone("TIM", "008765432"));
		
		joao.ligacao(victor);
		joao.ligacao(luis);
		System.out.println(joao.historicoLigacoes());
		
	}
}
