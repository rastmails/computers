package practica_4.parte_1;
import java.util.Random;

class HabitacionDeLaImpresora {
	public int hojas_disponibles = 10;

	synchronized public void trabajar() throws InterruptedException {
		
		// CALCULA HOJAS NECESARIAS
		Random r = new Random();
		int hojas_necesarias = r.nextInt(9) + 1;
		System.out.println("Necesito " + hojas_necesarias +
				" hojas y hay " + hojas_disponibles);
		
		// COMPRUEBA QUE HAY SUFICIENTES
		while (hojas_disponibles < hojas_necesarias) {
			System.out.println("No hay hojas suficientes. Espero");
			wait();
		}
		
		// USA LAS HOJAS
		hojas_disponibles -= hojas_necesarias;
	}

	synchronized public void reponerPapel() {
		
		// SE CALCULAN LAS NUEVAS HOJAS
		Random r = new Random();
		int hojas_repuestas = r.nextInt(20) + 10;
		
		// SE REPONEN LAS HOJAS
		hojas_disponibles += hojas_repuestas;
		System.out.println("La impresora tenía "+
				hojas_disponibles + " hojas y he repuesto " + 
				hojas_repuestas + ". Ahora tiene " +
				(hojas_disponibles + hojas_repuestas));
		notify();
	}
	
	public int getHojasDisponibles(){
		return this.hojas_disponibles;
	}
}



























