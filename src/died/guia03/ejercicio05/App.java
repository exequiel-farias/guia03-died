package died.guia03.ejercicio05;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Producto p1 = new Producto("Jabon", 50);
		Producto p2 = new Producto("Shampoo", 50);
		Producto p3 = new Producto("Acondicionador", 50);
		Cadete juan = new Cadete();
		Pedido pe1 = new PedidoBasico(false);
		pe1.agregarProducto(p1);
		pe1.agregarProducto(p2);
		pe1.agregarProducto(p3);
		juan.agregarPedido(pe1);
		Pedido pe2 = new PedidoBasico(true);
		pe2.agregarProducto(p1);
		pe2.agregarProducto(p2);
		pe2.agregarProducto(p3);
		juan.agregarPedido(pe2);
		Pedido pe3 = new PedidoPremium();
		pe3.agregarProducto(p1);
		pe3.agregarProducto(p2);
		pe3.agregarProducto(p3);
		juan.agregarPedido(pe3);
		Pedido pe4 = new PedidoPremium();
		pe4.agregarProducto(p1);
		pe4.agregarProducto(p2);
		pe4.agregarProducto(p3);
		pe4.agregarProducto(p3);
		pe4.agregarProducto(p3);
		pe4.agregarProducto(p3);
		juan.agregarPedido(pe4);
		pe1.setFechaEntrega(LocalDate.now());
		pe3.setFechaEntrega(LocalDate.now());
		for(int i = 0; i < juan.getPedidos().size() ; i++) {
			System.out.println("El precio del pedido "+(i+1)+" es: "+ juan.getPedidos().get(i).precio());
		}
		System.out.println("Lo que va a cobrar el cadete es: "+juan.comisiones());
	}

}
