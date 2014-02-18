package practica_3;

public class DosHilosConEspera {

	public static void main(String[] args) {
		Contar2 c1 = new Contar2("Despacio", 1, 10, 2000);
		Contar2 c2 = new Contar2("Rapido", 100, 120, 500);
		c1.start();
		c2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("DESPERTÉ");
			e.printStackTrace();
		}
		c1.interrupt();
		c2.interrupt();
		
		System.out.println("PRINCIPAL FINALIZADO");
	}
}

class Contar2 extends Thread{
	private final String name;
	private final int lower;
	private final int upper;
	private final int milis;
	
	public Contar2(String nombre, int inicio_cuenta, int fin_cuenta, int pausa) {
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
			} catch (InterruptedException e) {
				System.out.println("[INTERRUPCIÓN] " + name);
				return;
			};
		}
	}
	
}
