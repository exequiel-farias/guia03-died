package died.guia03.ejercicio04;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Camino caminos = new Camino();
		caminos.agregar(new Coordenada());
		caminos.agregar(10.3,10.3);
		caminos.agregar(100.3, 5.5);
		Coordenada c1 = new Coordenada(-27.3, -2.3);
		caminos.agregar(c1);
		caminos.agregar(10,10);

		System.out.println("Existen " + caminos.getDestinos().size() + " caminos");

		for(Coordenada punto : caminos.getDestinos()) {
			System.out.println(punto);
		}

		Coordenada no = new Coordenada(11.0, -11.0);
		Coordenada se = new Coordenada(-11.0, 11.0);
		System.out.println("Las coordenada no y se son iguales?: " + no.equals(se));

		System.out.println("Cuales puntos se encuentran dentro de no y se?:");
		List<Coordenada> resultado1 = caminos.buscar(no, se);
		for(Coordenada punto : resultado1) {
			System.out.println(punto);
		}

		Coordenada c2 = new Coordenada(-27.3, -2.3);
		System.out.println("Partiendo del punto c2 y buscando 50 metros a la redonda");
		List<Coordenada> resultado2 = caminos.buscar(c2, 50);
		for(Coordenada punto : resultado2) {
			System.out.println(punto);
		}
	}

}
