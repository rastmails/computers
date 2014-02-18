package practica_3;

public class DosHilos{

	public static void main(String[] args) {
		new ContarDeprisa().start();
		new ContarDespacio().start();
		System.out.println("PRINCIPAL FINALIZADO");
	}
}
