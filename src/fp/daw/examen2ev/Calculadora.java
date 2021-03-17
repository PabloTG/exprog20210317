package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// no veo por qué ni dónde está el fallo, pero hay que pulsar Enter
// para echar la calculadora a andar (no lee la primera operación)
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
		// separo la línea introducida por teclado en sus componentes
		// (que estarán separados por un espacio en blanco) y los
		// almaceno en un array de cadenas de caracteres
		String[] operacion = linea.split(" ");
		// uso los componentes del array para tener los elementos de la
		// operación a realizar (asumiendo que serán operando, operación,
		// operando, como en los ejemplos del enunciado)
		try {
			double operando1 = Double.parseDouble(operacion[0]);
			String operador = operacion[1];
			double operando2 = Double.parseDouble(operacion[2]);
			// realizo la operación y la muestro por pantalla
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
			System.out.println("expresión incorrecta");
		}
	}
}