package died.guia03.ejercicio05;

public class Producto {
	private String descripcion;
	private double costo;

	public Producto(String descripcion, double costo) {
		this.descripcion = descripcion;
		this.costo = costo;
	}

	public double getCosto() {
		return costo;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
