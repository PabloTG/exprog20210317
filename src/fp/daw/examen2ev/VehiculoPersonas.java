package fp.daw.examen2ev;

public abstract class VehiculoPersonas extends Vehiculo {
	// atributo específico para los vehículos de transporte de personas
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

	// método toString útil para sus herederas
	@Override
	public String toString() {
		String devolver = super.toString();
		devolver += " con capacidad máxima para " + plazas + " personas.";
		return devolver;
	}
}
