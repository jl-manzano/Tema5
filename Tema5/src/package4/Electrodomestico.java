package package4;

public class Electrodomestico {

	private double precioB = 100;
	private double peso = 5;
	private ColorE color = ColorE.BLANCO;
	private ConsumoE consumo = ConsumoE.F;

	enum ColorE {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	enum ConsumoE {
		A, B, C, D, E, F
	}

	public Electrodomestico(double precio, double peso, String color, char consumo) {
		if (precioB >= 100) {
			this.precioB = precio;
		}

		if (peso >= 5) {
			this.peso = peso;
		}

		compruebaColor(color);
		comprobarConsumoE(consumo);
	}

	public Electrodomestico(double precio, double peso) {
		if (precioB >= 100) {
			this.precioB = precio;
		}

		if (peso >= 5) {
			this.peso = peso;
		}

	}

	public boolean comprobarConsumoE(char letra) {
		boolean res = false;
		switch (Character.toUpperCase(letra)) {
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			this.consumo = ConsumoE.valueOf(String.valueOf(Character.toUpperCase(letra)));
			res = true;
		}

		}

		return res;

	}

	public boolean compruebaColor(String color) {
		boolean res = false;
		switch (color.toUpperCase()) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = ColorE.valueOf(String.valueOf(color.toUpperCase()));
			res = true;
		}
		}

		return res;
	}

	public void precioFinal() {
		switch (this.consumo) {
		case A -> {
			this.precioB += 100;
		}
		case B -> {
			this.precioB += 80;
		}
		case C -> {
			this.precioB += 60;
		}
		case D -> {
			this.precioB += 50;
		}
		case E -> {
			this.precioB += 30;
		}
		case F -> {
			this.precioB += 10;
		}
		}

		if (this.peso > 0 && this.peso <= 19) {
			this.precioB += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioB += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precioB += 80;
		} else if (this.peso > 80) {
			this.precioB += 100;
		}

	}

	public ColorE getColor() {
		return color;
	}

	public void setColor(ColorE color) {
		this.color = color;
	}

	public ConsumoE getConsumo() {
		return consumo;
	}

	public void setConsumo(ConsumoE consumo) {
		this.consumo = consumo;
	}

	public double getPrecioB() {
		return precioB;
	}

	public void setPrecioB(double precioB) {
		if (precioB >= 100) {
			this.precioB = precioB;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 5) {
			this.peso = peso;
		}
	}
	
    public String toString() {
        return "Electrodomestico [precio=" + precioB + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + "]";
    }

}
