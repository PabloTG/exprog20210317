package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		in.readLine();
		System.out.print("calculadora > ");
		while (!(linea = in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.print("calculadora > ");
		}
	}

	static void calcular(String linea) {
		Scanner s = new Scanner(linea);
		double operando1, operando2;
		String operador;
		try {
			if (s.hasNextDouble())
				operando1 = s.nextDouble();
			else {
				s.close();
				throw new IOException();
			}
			operador = s.next();
			if (s.hasNextDouble())
				operando2 = s.nextDouble();
			else {
				s.close();
				throw new IOException();
			}
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
				s.close();
				throw new IOException();
			}
		} catch (IOException ioe) {
			System.out.println("expresión incorrecta");
		}

		/* * completa aquí este método para resolver el problema */ s.close();
	}
}