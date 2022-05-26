package died.guia05;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Fecha {

	private LocalDateTime FyOPartida;
	private LocalDateTime FyOArribo;
	private LocalDateTime Fcancel;
	
	
	
	public void setPartida(int anio, int mes, int dia) {
		this.FyOPartida = LocalDateTime.of(anio, mes, dia, 0, 0);
	}
	public LocalDateTime getPartida() {
		return this.FyOPartida;
	}
		
	public void setArribo(int anio, int mes, int dia) {
		this.FyOArribo = LocalDateTime.of(anio, mes, dia, 0, 0);
	}
	public LocalDateTime getArribo() {
		return this.FyOArribo;
	}	
	
	public LocalDateTime fechaCancelacion() {
		return this.Fcancel = this.getArribo().minus(1, ChronoUnit.DAYS);
	}
	
	public long duracion() {
		return  ChronoUnit.DAYS.between(this.FyOPartida, this.FyOArribo);
	}
}
