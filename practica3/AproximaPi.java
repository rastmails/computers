package practica_3;

public class AproximaPi extends Thread{
	private double pi;

	@Override
	public void run(){
		pi = 0;
		for(int i=1; i<1000000000; i++){
			pi += (i%2==1)? -(1.0/(2*i+1)) : (1.0/(2*i+1));
		}
		pi = (pi+1)*4;
	}

	public double getPi(){
		return this.pi;
	}
}
