import java.util.Random;

public class Usuario extends Thread {
	private String nombre;
	private Cuenta cuenta;

	public Usuario(String nombre, Cuenta cuenta) {
		this.nombre = nombre;
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", cuenta=" + cuenta + "]";

	}

	public void run() {
		int ranOpc = 0;
		int ranMonto = 0;
		
		for (int i = 0; i < 3; i++) {
			Random ran = new Random();
			ranOpc = ran.nextInt(3);;
			ranMonto = ran.nextInt(10000) + 1;
			
			switch (ranOpc) {
			case 0:
				cuenta.depositarCuenta(ranMonto, nombre, getName());
				break;
			case 1:
				cuenta.retirarCuenta(ranMonto, nombre, getName());
				break;
			case 2:
				cuenta.mostrarSaldo(nombre, getName());
				break;
			default:
				break;
			}
		}
	}
}
