package died.guia05;

import java.util.Objects;

public class Pasajero {

	private String nombre;
	private String apelido;

	private String mail;
	private int nroPasaporte;
	
	public Pasajero(String n, String a, String m, int p) {
		this.nombre = n;
		this.apelido = a;
		this.setEmail(a);
		this.nroPasaporte = p;
	}
	private String setEmail(String a) {
		
		return this.mail = a + "@gmail.com";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mail, nroPasaporte);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		return Objects.equals(mail, other.mail) && nroPasaporte == other.nroPasaporte;
	}
}
