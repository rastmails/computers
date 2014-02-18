package practica_3;
class ContarDespacio extends Thread{
		private int lower = 1;
		private int upper = 10;
		private int milis = 2000;
		private String name = "Despacio";
		
		@Override
		public void run() {
			for (int i =lower; i<upper; i++) {
				System.out.println(name + " " + i);
				try {
					Thread.sleep(milis);
				} catch (InterruptedException e) {}; 
			}
		}
	}	