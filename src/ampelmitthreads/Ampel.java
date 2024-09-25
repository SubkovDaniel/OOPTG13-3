package ampelmitthreads;

public class Ampel implements Runnable{
	
	private int wait;
	private String name;
	private int Zustand;
	private final static int Rot = 0;
	private final static int RotGelb = 1;
	private final static int Gruen = 2;
	private final static int Gelb = 3;
	private Thread t;
	
	public Ampel(int wait, int Zustand, String name) {
		
		this.wait = wait;
		this.Zustand = Zustand;
		this.name = name;
		t = new Thread(this);

	}

	@Override
	public void run() {

		while (true) {

			switch (Zustand) {
			
			case Rot:
				System.out.println(name+ ":" + "Rot");
				Zustand=RotGelb;
				break;

			case RotGelb:
				System.out.println(name+ ":" +"Rot-Gelb");
				Zustand=Gruen;
				break;
				
			case Gruen:
				System.out.println(name+ ":" +"Grün");
				Zustand=Gelb;
				break;
				
			case Gelb:
				System.out.println(name+ ":" +"Gelb" );
				Zustand=Rot;
				break;
			}
			
			warte();
			
		}

	}
	
	public void start() {
		
		t.start();
		
	}
	
	public void warte() {
		
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
