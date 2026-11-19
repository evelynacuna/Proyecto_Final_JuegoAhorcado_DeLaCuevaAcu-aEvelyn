import java.util.Random;
import java.util.Scanner;

public class JuegoAhorcado {
	Scanner sc = new Scanner(System.in);
	
	Random random = new Random();
	static char []abc = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','X'};
	
	
	public String elegirPalabra (String[] palabras) {
		
		String palabra = palabras[random.nextInt(palabras.length)];
		
		return palabra;
	}
	
	public void inicioAhorcado(String chooseWord) {
		
	}
	
	public boolean seAdivinoPalabra(String palabraRandom, char[] letraIngresada) {
		
		for(int i =0; i<palabraRandom.length();i++) {
			char c = palabraRandom.charAt(i);
			
			boolean encontrado = false;
			
			for(int j = 0; j<letraIngresada.length; j++) {
				if(c == letraIngresada[j]) {
					encontrado = true;
					break;
				}
			}
			
			if (!encontrado) {
				return false;
			}
		}
		return true;
			
	}
	
	public String obtenerPalabraAdivinada(String palabraRandom, char letraIngresada) {
		
		
		return null;
	}
	
	
	public String obtenerLetrasDisponibles() {
		
		return null;
	}
}
