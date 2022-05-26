package died.guia05;

import java.util.Comparator;
import java.util.Objects;

public class Pasaje implements Comparable<Pasaje>{
	
	
	private String codigo;
	private int numVuelo;
	private String ciudadO;
	private String ciudadD;
	private int asiento;
	private double monto;
	private Fecha fechas;
	private Aerolinea aerolinea;
	private Pasajero pasajero;
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ciudadD, ciudadO, codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasaje other = (Pasaje) obj;
		return Objects.equals(ciudadD, other.ciudadD) && Objects.equals(ciudadO, other.ciudadO)
				&& Objects.equals(codigo, other.codigo);
	}
	
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int compareTo(Pasaje o) {
		 if(this.monto-o.monto>0.0) return 1;
		 if (this.monto-o.monto<0.0) return -1;
		 return 0;
		}
	@Override
	public String toString() {
		return "Pasaje [codigo=" + codigo + ", numVuelo=" + numVuelo + ", ciudadO=" + ciudadO + ", ciudadD=" + ciudadD
				+ ", asiento=" + asiento + ", monto=" + monto + ", fechas=" + fechas + ", aerolinea=" + aerolinea
				+ ", pasajero=" + pasajero + "]";
	}

	
	
	
}
