package Q1;

public class Main {

	public static void main(String[] args) {

		Moto moto = new Moto();
		System.out.println(moto);
		System.out.println(moto.buzinar());
		
		moto.subir(new Pessoa("marcos", 4));
		System.out.println(moto);
		
		System.out.println(moto.buzinar());
		
		moto.subir(new Pessoa("mariza", 9));
		
		System.out.println(moto);
		
		moto = new Moto(5);
		System.out.println(moto);
		moto.subir(new Pessoa("mariza", 9));

		System.out.println(moto.buzinar());
		
	}
}
