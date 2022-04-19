package died.guia03.ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Cadete {
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	public void agregarPedido(Pedido p) {
		pedidos.add(p);
	}

	public double comisiones() {
		double comisiones = 0;
		for(Pedido p : pedidos)
			comisiones += p.comision();
		return comisiones;
	}

	public List<Pedido> getPedidos(){
		return pedidos;
	}
}
