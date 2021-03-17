package fp.daw.examen2ev;

public final class Coche extends VehiculoPersonas {
	// constructor
	public Coche(String matricula, int plazas) {
		super(matricula, plazas);
	}

	// m�todo de Alquilable
	@Override
	public float getPrecioAlquiler(int dias) {
		float precio = (float) (super.getPrecioAlquiler(dias) + 1.5 * this.getPlazas());
		return precio;
	}

}
