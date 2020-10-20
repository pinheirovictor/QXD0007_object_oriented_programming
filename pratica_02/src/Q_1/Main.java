package Q_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Topic topic = new Topic(0, 0);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			String[] ui = line.split(" ");
			if (ui[0].equals("end")) {
				break;
			} else if (ui[0].equals("init")) {
				topic = new Topic(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
			} else if (ui[0].equals("show")) {
				System.out.println(topic);
			} else if (ui[0].equals("in")) {
				topic.inserir(new Passageiro(ui[1], Integer.parseInt(ui[2])));
			} else if (ui[0].equals("out")) {
				topic.remover(ui[1]);
			} else {
				System.out.println("ERRO | comando nao encontrado");
			}
		}

	}
}
