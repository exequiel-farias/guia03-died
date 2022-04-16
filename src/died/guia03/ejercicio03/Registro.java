package died.guia03.ejercicio03;

import died.guia03.ejercicio02.Temperatura;

public class Registro {
	private String ciudad;
	private Temperatura[] historico;
	private int indice;

	public Registro() {
		this.ciudad = "-";
		this.historico = new Temperatura[30];
		this.indice = 0;
	}

	public Registro(String ciudad) {
		this.ciudad = ciudad;
		this.historico = new Temperatura[30];
		this.indice = 0;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void agregar(Temperatura t) {
		if(indice < 30) {
			this.historico[indice] = t;
			indice++;
		}
	}

	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);
		for(int i=0;i<indice;i++)
			System.out.println(i+1 + " " + this.historico[i].toString());
	}

	public Double mediaAsCelcius() {
		Double sum = 0.0;
		for(int i=0; i < indice; i++)
			sum += this.historico[i].asCelcius();
		return sum / (indice + 1);
	}

	public Double mediaAsFahrenheit() {
		Double sum = 0.0;
		for(int i=0; i < indice; i++)
			sum += this.historico[i].asFahrenheit();
		return sum / (indice + 1);
	}

	public Temperatura maximo() {
		return maximo(this.historico[0], this.historico[1], 1);
	}

	private Temperatura maximo(Temperatura maximo, Temperatura temp, int actual) {
		if(actual == this.indice - 1) {
			if(maximo.asCelcius() >= temp.asCelcius()) return maximo;
			else return temp;
		}else {
			if(maximo.asCelcius() >= temp.asCelcius()) return maximo(maximo, this.historico[actual+1], actual+1);
			else return maximo(temp, this.historico[actual+1], actual+1);
		}
	}
}
