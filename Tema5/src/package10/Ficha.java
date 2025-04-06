package package10;

import java.util.Objects;

import package11.CuentaBancaria;

public abstract class Ficha {
	private int id;
	private String titulo;
	
	public Ficha(int id, String titulo) {
		if (id > 0) {
			this.id = id;
		}
		
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
	}
	
	public int getId() {
		return id;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public abstract int tiempoPrestamo();
	
//	@Override
//	public boolean equals(Object obj) {
//
//		boolean sonIguales = false;
//
//		CuentaBancaria otraCB = (CuentaBancaria) obj;
//
//		if (this.numCuenta.equalsIgnoreCase(otraCB.numCuenta)) {
//			sonIguales = true;
//		}
//
//		return sonIguales;
//	}
//	
//    @Override
//    public int hashCode() {
//        return Objects.hash(numCuenta);
//    }
//	
//	@Override
//	public String toString() {
//
//		String cuenta = "";
//
//		cuenta += "Nº Cuenta: " + this.numCuenta + ", Saldo: " + this.saldo;
//
//		return cuenta;
//	}
}
