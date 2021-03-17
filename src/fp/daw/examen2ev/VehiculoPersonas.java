package fp.daw.examen2ev;

public abstract class VehiculoPersonas extends Vehiculo {
	// atributo espec�fico para los veh�culos de transporte de personas
	private int plazas;

	// getter
	public int getPlazas() {
		return plazas;
	}

	// setter
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	// constructor
	public VehiculoPersonas(String matricula, int plazas) {
		super(matricula);
		this.plazas = plazas;
	}

}
