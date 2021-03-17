package fp.daw.examen2ev;

import java.util.Scanner;

public class PruebaVehiculos {

	public static void main(String[] args) {
		// instancio un veh�culo de cada tipo
		Coche coche = new Coche("1234AAA", 5);
		Microbus microbus = new Microbus("2345BBB", 15);
		Furgoneta furgoneta = new Furgoneta("3456CCC", (float) 1.2);
		Camion camion = new Camion("4567DDD", (float) 15);
		// introduzco los veh�culos en un array para poder hacer
		// una sola referencia polim�rfica a todos ellos
		Vehiculo[] vehiculos = { coche, microbus, furgoneta, camion };
		// solicito el n�mero de d�as por teclado
		System.out.println("Por favor, introduzca el n�mero de d�as para calcular el alquiler: ");
		// declaro un Scanner para aceptar el n�mero
		Scanner entrada = new Scanner(System.in);
		// declaro el n�mero de d�as y lo inicializo con el n�mero metido por teclado
		int dias = entrada.nextInt();
		// uso un for para demostrar el alquiler con una �nica referencia polim�rfica
		// (admito que queda un poco feo por el punto que puse al final de los toString,
		// por eso hago por lo menos el adorno de distinguir entre d�a y d�as)
		String diaDias = " d�as ";
		if (dias == 1)
			diaDias = " d�a ";
		for (Vehiculo v : vehiculos) {
			System.out.println("El alquiler del " + v.toString() + " durante " + dias + diaDias + " es de "
					+ v.getPrecioAlquiler(dias) + "�.");
		}
		// cierro el Scanner
		entrada.close();
	}

}
