package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// no veo por qu� ni d�nde est� el fallo, pero hay que pulsar Enter
// para echar la calculadora a andar (no lee la primera operaci�n)
public class Calculadora {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("calculadora > ");
		String linea = in.readLine();
		while (!(linea = in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.print("calculadora > ");
		} // fin while
	} // fin main

	static void calcular(String linea) {
		// separo la l�nea introducida por teclado en sus componentes
		// (que estar�n separados por un espacio en blanco) y los
		// almaceno en un array de cadenas de caracteres
		String[] operacion = linea.split(" ");
		// uso los componentes del array para tener los elementos de la
		// operaci�n a realizar (asumiendo que ser�n operando, operaci�n,
		// operando, como en los ejemplos del enunciado)
		try {
			double operando1 = Double.parseDouble(operacion[0]);
			String operador = operacion[1];
			double operando2 = Double.parseDouble(operacion[2]);
			// realizo la operaci�n y la muestro por pantalla
			switch (operador) {
			case "+":
				System.out.println(operando1 + operando2);
				break;
			case "-":
				System.out.println(operando1 - operando2);
				break;
			case "*":
				System.out.println(operando1 * operando2);
				break;
			case "/":
				System.out.println(operando1 / operando2);
				break;
			default:
				throw new Exception();
			} // fin switch
		} // fin try
		catch (Exception e) {
			System.out.println("expresi�n incorrecta");
		}
	}
}