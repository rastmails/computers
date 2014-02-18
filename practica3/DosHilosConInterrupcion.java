package practica_3;

public class DosHilosConInterrupcion {

	public static void main(String[] args) {
		Contar1 c1 = new Contar1("Despacio", 1, 10, 1000);
		Contar1 c2 = new Contar1("Rapido", 100, 120, 250);
		c1.start();
		c2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("DESPERTÉ");
			e.printStackTrace();
		}
		c1.interrupt();
		c2.interrupt();
		
		try {
			c1.join();
			System.out.println("PRINCIPAL FINALIZADO");
			return;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PRINCIPAL FINALIZADO");
	}
}

class Contar1 extends Thread{
	private final String name;
	private final int lower;
	private final int upper;
	private final int milis;
	
	public Contar1(String nombre, int inicio_cuenta, int fin_cuenta, int pausa) {
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
			};
		}
	}
	
}
