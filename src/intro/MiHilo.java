package intro;

public class MiHilo extends Thread{
	
	public void impresiones() {
		System.out.println("Instrucci�n 1");
		System.out.println("Instrucci�n 2");
		System.out.println("Instrucci�n 3");
		System.out.println("Instrucci�n 4");
		System.out.println("Instrucci�n 5");
	}
	
	@Override
	public void run() {
		System.out.println(getName()+" Instrucci�n 1");
		System.out.println(getName()+" Instrucci�n 2");
		System.out.println(getName()+" Instrucci�n 3");
		System.out.println(getName()+" Instrucci�n 4");
		System.out.println(getName()+" Instrucci�n 5");
	}
	
	@Override
	public synchronized void start() {
		super.start();
	}
	
	

	public static void main(String[] args) {
		MiHilo hilo = new MiHilo();//Instancia de clase normal
		MiHilo hilo2 = new MiHilo();
		MiHilo hilo3 = new MiHilo();
		
		//Efecto secuencial
		hilo.impresiones();
		System.out.println();
		hilo2.impresiones();
		System.out.println();
		hilo3.impresiones();
		System.out.println();
		//Sin orden espec�fico de ejecuci�n - Depende del procesador
		hilo.start();
		hilo2.start();
		hilo3.start();
	}

}
