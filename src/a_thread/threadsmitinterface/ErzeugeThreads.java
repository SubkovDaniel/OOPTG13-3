package threadsmitinterface;

public class ErzeugeThreads {
	
	public static void main(String[] args) {
		
		System.out.println("Der Pfad wurde gestartet.");
		
		MeinThread  a = new MeinThread(100, "Aa" );
		MeinThread  b = new MeinThread(122, "Bb" );
		
		a.start();
		b.start();
		
		System.out.println("Der Pfad wurde beendet.");
		
	}

}
