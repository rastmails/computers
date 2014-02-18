package practica_3;
	class ContarDeprisa extends Thread{
		private int lower = 100;
		private int upper = 120;
		private int milis = 500;
		private String name = "Deprisa";
		
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