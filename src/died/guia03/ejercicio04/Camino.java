package died.guia03.ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Camino {
	private List<Coordenada> destinos = new ArrayList<Coordenada>();
	
	public void agregar(Coordenada x) {
		this.destinos.add(x);
	}

	public void agregar(double lat,double lng) {
		agregar(new Coordenada(lat,lng));
	}

	public void agregar(int mtsLt, int mtsLn) {
		// Nota: Acá el enunciado dice de sumar mtsLat y mtsLn para obtener una nueva coordenada pero no dice a partir
        // de que punto. Voy a asumir que este metodo opera sobre la ultima coordenada de la lista y si no hay una
        // que sea a partir del origen.
		Coordenada ultimaCoordenada = destinos.isEmpty() ? new Coordenada() : destinos.get(destinos.size() - 1);
		Coordenada nuevaCoordenada = new Coordenada(ultimaCoordenada.getLatitud(), ultimaCoordenada.getLongitud());
		nuevaCoordenada.sumarMetros(mtsLt, mtsLn);
		agregar(nuevaCoordenada);
	}

	public List<Coordenada> buscar(Coordenada no, Coordenada se){
		List<Coordenada> encontrados = new ArrayList<Coordenada>();
		// Valores negativos de latitud son debajo del ecuador
        // Valores negativos de longitud son a la izquierda de greenwich
		for(Coordenada punto : destinos) {
			boolean dentroDeLimiteSuperiorIzquierdo = no.getLatitud() >= punto.getLatitud() && no.getLongitud() <= punto.getLongitud();
			boolean dentroDeLimiteInferiorDerecho = se.getLatitud() <= punto.getLatitud() && se.getLongitud() >= punto.getLongitud();
			if(dentroDeLimiteSuperiorIzquierdo && dentroDeLimiteInferiorDerecho) encontrados.add(punto);
		}
		return encontrados;
	}

	public List<Coordenada> buscar(Coordenada punto, int distancia){
		Coordenada no = new Coordenada(punto.getLatitud(), punto.getLongitud());
		Coordenada se = new Coordenada(punto.getLatitud(), punto.getLongitud());
		no.sumarMetros(distancia, -distancia);
		se.sumarMetros(-distancia, distancia);
		return buscar(no,se);
	}

	public List<Coordenada> getDestinos(){
		return destinos;
	}
}
