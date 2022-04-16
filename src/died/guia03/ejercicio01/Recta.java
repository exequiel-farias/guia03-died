package died.guia03.ejercicio01;

public class Recta {
	private Punto p1;
	private Punto p2;

	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Recta() {
		this.p1 = new Punto(0,0);
		this.p2 = new Punto(1,1);
	}

	public float pendiente() {
		float m = (this.p2.getY() - this.p1.getY()) / (this.p2.getX() - this.p1.getX());
		return m;
	}

	public boolean paralelas(Recta otraRecta) {
		return this.pendiente() == otraRecta.pendiente();
	}

	@Override
	public boolean equals(Object otraRecta) {
		if(this == otraRecta) return true;
		if(otraRecta == null) return false;
		if(getClass() != otraRecta.getClass()) return false;
		Recta otra = (Recta) otraRecta;
		if(otra.p1 == this.p1 && otra.p2 == this.p2) return true;
		Punto aux1 = this.p1;
		Punto aux2 = otra.p2;
		Recta aux = new Recta(aux1, aux2);
		return this.pendiente() == aux.pendiente();
	}
}
