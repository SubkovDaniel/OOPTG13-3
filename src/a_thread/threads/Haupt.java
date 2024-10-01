package threads;

public class Haupt {

	public static void main(String[] args) {
			
			System.out.println("Pfad gestartet");
			
			Pfad pf = new Pfad(0, 100);
			Pfad pf2 = new Pfad(45, 100);
			
			pf.start();
			pf2.start();
			
			System.out.println("Pfad beendet");
			
		}

}
