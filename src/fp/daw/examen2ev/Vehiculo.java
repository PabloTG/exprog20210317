package fp.daw.examen2ev;

public abstract class Vehiculo implements Alquilable {
	// atributos comunes a todos los vehículos
	private String matricula;
	private int precioBase = 50;

	// getters
	public String getMatricula() {
		return matricula;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	// setters
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	// este método es por si se quisiera cambiar el precio base de algún vehículo concreto
	// (por ejemplo, para hacer más caros los deportivos, aunque sólo tengan dos plazas)
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	// constructor
	public Vehiculo(String matricula) {
		this.matricula = matricula;
	}

	// método de Alquilable// métodos de Alquilable
	@Override
	public float getPrecioAlquiler(int dias) {
		float precioBase = getPrecioBase();
		float precio = precioBase * dias;
		return precio;
	}

}
