package threads;

public class Pfad extends Thread{
	
	int z;
	int warte;
	
	public Pfad(int z, int warte) {
		
		this.z = z;
		this.warte = warte;
		
	}

	@Override
	public void run() {

		while (z <= 100) {
			System.out.println(z);
			z++;
			
		}

		try {
			Pfad.sleep(warte);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
