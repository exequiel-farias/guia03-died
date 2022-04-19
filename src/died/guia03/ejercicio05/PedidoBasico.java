package died.guia03.ejercicio05;

public class PedidoBasico extends Pedido {
	private boolean esExpress;
	private final int CANT_MAX = 5;

	public PedidoBasico(boolean esExpress) {
		this.esExpress = esExpress;
	}

	@Override
	public double precio() {
		double total = 0;
		for(Producto p : this.productos) {
			total += p.getCosto() * 1.05;
		}
		return esExpress ? total * 1.20 : total;
	}

	@Override
	public double comision() {
		return entregado ? precio() * 0.1 : 0;
	}

	@Override
	public boolean agregarProducto(Producto p) {
		if(this.productos.size() < CANT_MAX) {
			this.productos.add(p);
			return true;
		}else return false;
	}
}
