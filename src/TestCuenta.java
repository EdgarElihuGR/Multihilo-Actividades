
public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Usuario padre = new Usuario("Manuel",cuenta);
		Usuario hijo = new Usuario("Daniel",cuenta);
		Usuario hija = new Usuario("Alejandra",cuenta);
		
		padre.start();
		hijo.start();
		hija.start();
	}

}
