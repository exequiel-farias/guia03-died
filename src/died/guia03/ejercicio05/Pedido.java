package died.guia03.ejercicio05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
	protected List<Producto> productos = new ArrayList<Producto>();
	protected boolean entregado = false;
	protected LocalDate fechaEntrega = null;
	
	public void setFechaEntrega(LocalDate fecha) {
		this.fechaEntrega = fecha;
		this.entregado = true;
	}

	public abstract boolean agregarProducto(Producto p);
	public abstract double precio();
	public abstract double comision();
}
