package died.guia03.ejercicio02;

public class Temperatura {
	private Double grados;
	private Escala escala;

	public Temperatura() {
		this.grados = 0.0;
		this.escala = Escala.CELCIUS;
	}

	public Temperatura(Double temperatura, Escala escala) {
		this.grados = temperatura;
		this.escala = escala;
	}

	@Override
	public String toString() {
		String aux = (this.escala == Escala.CELCIUS) ? " C°" : " F°";
		return "" + grados + aux;
	}

	public Double asCelcius() {
		if(this.escala == Escala.FAHRENHEIT)
			return (this.grados - 32) * 5 / 9;
		return this.grados;
	}

	public Double asFahrenheit() {
		if(this.escala == Escala.CELCIUS)
			return (this.grados * 9 / 5) + 32;
		return this.grados;
	}

	public void aumentar(Temperatura temperatura) {
		if(temperatura.grados == 0.0) return;
		if(temperatura.escala == this.escala) {
			this.grados += temperatura.grados;
			return;
		}
		Double temp = (temperatura.escala == Escala.CELCIUS) ? 
				(temperatura.grados * 9/5)+32 : (temperatura.grados-32)*5/9;
		this.grados += temp;
	}

	public void disminuir(Temperatura temperatura) {
		Temperatura aux = new Temperatura(-temperatura.grados, temperatura.escala);
		aumentar(aux);
	}
}
