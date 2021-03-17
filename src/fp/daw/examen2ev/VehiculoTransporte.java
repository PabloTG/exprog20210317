package fp.daw.examen2ev;

public abstract class VehiculoTransporte extends Vehiculo {
	// atributo específico de los vehículos de transportwe de mercancías
	private float capacidad; // para el PMA en toneladas

	// getter
	public float getCapacidad() {
		return capacidad;
	}

	// setter
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

	// constructor
	public VehiculoTransporte(String matricula, float capacidad) {
		super(matricula);
		this.capacidad = capacidad;
	}

	// métodos de Alquilable
	@Override
	public float getPrecioAlquiler(int dias) {
		float precio = (float) (super.getPrecioAlquiler(dias) + 20 * capacidad);
		return precio;
	}

	// método toString útil para sus herederas
	@Override
	public String toString() {
		String devolver = super.toString();
		devolver += " con un PMA de " + capacidad + " toneladas.";
		return devolver;
	}
}
