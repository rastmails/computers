package practica_3;

public class DosHilosIguales {

	public static void main(String[] args) {
		Contar c1 = new Contar("Despacio", 1, 10, 2000);
		Contar c2 = new Contar("Rapido", 100, 120, 500);
		c1.start();
		c2.start();
		System.out.println("PRINCIPAL FINALIZADO");
	}
}

class Contar extends Thread{
	private final String name;
	private final int lower;
	private final int upper;
	private final int milis;
	
	public Contar(String nombre, int inicio_cuenta, int fin_cuenta, int pausa) {
		super();
		this.name = nombre;
		this.lower = inicio_cuenta;
		this.upper = fin_cuenta;
		this.milis = pausa;
	}
	
	@Override
	public void run() {
		for (int i =lower; i<upper; i++) {
			System.out.println(name + " " + i);
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {}; 
		}
	}
	
}
