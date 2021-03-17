package fp.daw.examen2ev;

public abstract class Vehiculo implements Alquilable {
	// atributos comunes a todos los veh�culos
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
	// este m�todo es por si se quisiera cambiar el precio base de alg�n veh�culo concreto
	// (por ejemplo, para hacer m�s caros los deportivos, aunque s�lo tengan dos plazas)
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	// constructor
	public Vehiculo(String matricula) {
		this.matricula = matricula;
	}

	// m�todo de Alquilable// m�todos de Alquilable
	@Override
	public float getPrecioAlquiler(int dias) {
		float precioBase = getPrecioBase();
		float precio = precioBase * dias;
		return precio;
	}

}
