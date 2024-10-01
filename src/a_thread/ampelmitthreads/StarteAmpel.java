package ampelmitthreads;

public class StarteAmpel {

	public static void main(String[] args) {
		
		Ampel a = new Ampel(1000, 0, "a");
		Ampel b = new Ampel(1000, 0, "b");
		
		a.start();
		b.start();

	}

}
