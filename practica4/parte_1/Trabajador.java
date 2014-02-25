package practica_4.parte_1;
import java.util.Random;


public class Trabajador extends Thread{
	private static final int TIEMPO_MAX_DURMIENDO = 5000;
	private static final int TURNOS_DE_TRABAJO = 5;
	private HabitacionDeLaImpresora habitacion;

	public Trabajador(HabitacionDeLaImpresora habitacion){
		this.habitacion = habitacion;
	}

	@Override
	public void run(){
		while(true){
			// DUERME
			Random r = new Random();
			int tiempo_durmiendo = r.nextInt(TIEMPO_MAX_DURMIENDO);
			try {sleep(tiempo_durmiendo);}
			catch (InterruptedException e) {e.printStackTrace();}

			// TRABAJA
			for (int i = 0; i < TURNOS_DE_TRABAJO; i++) {
				try {this.habitacion.trabajar();}
				catch (InterruptedException e) {e.printStackTrace();}
			}
		}
	}
}
