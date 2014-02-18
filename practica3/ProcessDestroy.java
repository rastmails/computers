package practica_3;
import java.io.IOException;
import java.lang.Runtime;

public class ProcessDestroy{
	public static void main(String args[]) throws IOException{
		Process process = Runtime.getRuntime().exec("gedit");
		
		buclePausa();
		
		process.destroy();
	}
	static void buclePausa() { // Imprime un numero y espera 5 seg antes de imprimir otro
		int i;
		for (i =0; i<12; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);  // 5 segundos
			}
			catch (InterruptedException e) {};  // No hacer nada
		}
	}
}
