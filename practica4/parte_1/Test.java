package practica_4.parte_1;
import java.util.ArrayList;


public class Test {
	public static final int NUM_TRABAJADORES = 3;
	public static final int NUM_REPONEDORES = 1;
	public static void main(String[] args) {
		// INICIALIZA E INSTANCIA LAS CLASES
		ArrayList<Thread> plantilla = new ArrayList<Thread>();
		HabitacionDeLaImpresora habitacion = new HabitacionDeLaImpresora();
		for (int i = 0; i < NUM_TRABAJADORES; i++) {
			plantilla.add(new Trabajador(habitacion));
		}
		for (int i = 0; i < NUM_REPONEDORES; i++) {
			plantilla.add(new Reponedor(habitacion));
		}
		
		// COMIENZA
		for (Thread thread : plantilla) {
			thread.start();
		}
	}
}
