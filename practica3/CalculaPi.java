package practica_3;

public class CalculaPi {
	public static void main(String[] args) throws InterruptedException {
		  AproximaPi hilo = new AproximaPi();
		  hilo.start();
		  hilo.join();
		  System.out.println("Resultado: " + hilo.getPi());
		}
}
