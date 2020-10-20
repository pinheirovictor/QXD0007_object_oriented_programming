package Q2;

import java.util.ArrayList;
import java.util.List;

public class Trampoline {

	List<Kid> kidsWaiting = new ArrayList<Kid>();
	List<Kid> kidPlaying = new ArrayList<Kid>();

	public Trampoline() {

	}

	@Override
	public String toString() {
		return "Trampoline [kidsWaiting=" + kidsWaiting + ", kidPlaying=" + kidPlaying + "]";
	}

	// metodo chegar
	public void arrive(Kid kid) {
		this.kidsWaiting.add(kid);
	}

	public void show() {
		System.out.println("Esperando: " + kidsWaiting + "Bricando: " + kidPlaying);
	}

	public void in(Kid kid) {
		this.kidPlaying.add(kid);
		this.kidsWaiting.remove(kid);

	}

	public void out(Kid kid) {
		this.kidsWaiting.add(kid);
		this.kidPlaying.remove(kid);
	}

}
