package practica_3;
import java.util.Random;


public class CaballoCarreras extends Thread{

	
	@Override
	public void run(){
		int t;
		for(int i=1; i<10; i++){
			System.out.println(getName() + ": " + i);
			Random r = new Random();
			t = r.nextInt(1000) + 1000;
			try {
				sleep(t);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName() + ": He cruzado la meta");
		}
	}
}
