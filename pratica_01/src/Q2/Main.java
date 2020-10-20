package Q2;

public class Main {

	public static void main(String[] args) {
		Trampoline trampoline = new Trampoline();
		Kid k1 = new Kid("mario", 5);
		Kid k2 = new Kid("livia", 4);
		Kid k3 = new Kid("luana", 3);
		trampoline.arrive(k1);
		trampoline.arrive(k2);
		trampoline.arrive(k3);
		System.out.println(trampoline);

		trampoline.in(k1);
		System.out.println(trampoline);
		

		trampoline.in(k2);
		System.out.println(trampoline);
		
		
		trampoline.out(k1);
		System.out.println(trampoline);
		
	}
}
