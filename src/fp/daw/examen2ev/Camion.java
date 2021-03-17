package fp.daw.examen2ev;

public class Camion extends VehiculoTransporte implements Alquilable {
	// constructor
	public Camion(String matricula, float capacidad) {
		super(matricula, capacidad);
	}

	// método de Alquilable que necesita modificación desde VehiculoTransporte
	@Override
	public float getPrecioAlquiler(int dias) {
		float precio = super.getPrecioAlquiler(dias) + 40;
		return precio;
	}
}
