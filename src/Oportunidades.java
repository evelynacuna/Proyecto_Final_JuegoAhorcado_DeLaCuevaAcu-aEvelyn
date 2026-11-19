
public class Oportunidades {

	private byte intentos = 10;

	public byte getIntentos() {return intentos;}
	
	public void descontarIntentos() {
		if (intentos > 0) {
			intentos--;
		}
	}
}
