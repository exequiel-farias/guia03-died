package died.guia03.ejercicio05;

public class PedidoPremium extends Pedido {
	private final int CANT_MAX = 10;

	@Override
	public double precio() {
		double total = 0;
		for(Producto p : this.productos) {
			total += p.getCosto();
		}
		if(this.productos.size() <= 5) total *= 1.20;
		else total *= 1.30;
		return total;
	}

	@Override
	public double comision() {
		return entregado ? precio() * 0.15 : 0;
	}

	@Override
	public boolean agregarProducto(Producto p) {
		if(this.productos.size() < CANT_MAX) {
			this.productos.add(p);
			return true;
		}else return false;
	}
}
