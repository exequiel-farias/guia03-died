package died.guia03.ejercicio01;

public class Punto {
	private float x;
	private float y;

	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Float.floatToIntBits(x) == Float.floatToIntBits(other.x)
				&& Float.floatToIntBits(y) == Float.floatToIntBits(other.y);
	}
/*	@Override
	public boolean equals(Object otroPunto) {
		if(this == otroPunto) return true;
		if(otroPunto == null) return false;
		if(getClass() != otroPunto.getClass()) return false;
		Punto otro = (Punto) otroPunto;
		return otro.x == this.x && otro.y == this.y;
	}*/
}
