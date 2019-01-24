

public class Cuenta {
	public int saldo = 0;
	
	public void depositarCuenta(int monto, String nombre, String threadName) {
		saldo+=monto;
		System.out.println(threadName+" "+nombre+" deposita "+ monto +" "+saldo);
	}
	
	public void retirarCuenta(int monto, String nombre, String threadName) {
		saldo-=monto;
		System.out.println(threadName+" "+nombre+" retira "+ monto + " " + saldo);
	}
	
	public void mostrarSaldo(String nombre, String threadName) {
		System.out.println(threadName+" "+nombre+" consulta "+saldo);
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	
}
