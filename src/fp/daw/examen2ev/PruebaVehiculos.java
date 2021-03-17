package fp.daw.examen2ev;

import java.util.Scanner;

public class PruebaVehiculos {

	public static void main(String[] args) {
		// instancio un vehículo de cada tipo
		Coche coche = new Coche("1234AAA", 5);
		Microbus microbus = new Microbus("2345BBB", 15);
		Furgoneta furgoneta = new Furgoneta("3456CCC", (float) 1.2);
		Camion camion = new Camion("4567DDD", (float) 15);
		// introduzco los vehículos en un array para poder hacer
		// una sola referencia polimórfica a todos ellos
		Vehiculo[] vehiculos = { coche, microbus, furgoneta, camion };
		// solicito el número de días por teclado
		System.out.println("Por favor, introduzca el número de días para calcular el alquiler: ");
		// declaro un Scanner para aceptar el número
		Scanner entrada = new Scanner(System.in);
		// declaro el número de días y lo inicializo con el número metido por teclado
		int dias = entrada.nextInt();
		// uso un for para demostrar el alquiler con una única referencia polimórfica
		// (admito que queda un poco feo por el punto que puse al final de los toString,
		// por eso hago por lo menos el adorno de distinguir entre día y días)
		String diaDias = " días ";
		if (dias == 1)
			diaDias = " día ";
		for (Vehiculo v : vehiculos) {
			System.out.println("El alquiler del " + v.toString() + " durante " + dias + diaDias + " es de "
					+ v.getPrecioAlquiler(dias) + "€.");
		}
		// cierro el Scanner
		entrada.close();
	}

}
