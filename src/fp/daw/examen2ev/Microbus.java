package fp.daw.examen2ev;

public class Microbus extends VehiculoPersonas {
	// constructor
	public Microbus(String matricula, int plazas) {
		super(matricula, plazas);
	}
	
	// método de Alquilable
	@Override
	public float getPrecioAlquiler(int dias) {
		float precio = (float) (super.getPrecioAlquiler(dias) + 2 * this.getPlazas() * dias);
		return precio;
	}

}
