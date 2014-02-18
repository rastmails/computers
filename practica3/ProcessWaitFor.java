package practica_3;
	import java.io.IOException;
	import java.lang.Runtime;
	
	public class ProcessWaitFor{
		public static void main(String args[]) throws IOException, InterruptedException{
			Process process = Runtime.getRuntime().exec("gedit");
				
			process.waitFor();
			System.out.println("JAVA HA EXTERMINADO ESTE PROCESO!");
	
		}
	}
