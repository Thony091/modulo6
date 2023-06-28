package tech.awakelab.mvcprevention.modelo;

import java.io.Serializable;

public class Capacitacion implements Serializable{
	
	private int identificador;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;
	
	
	
	/** 
	 * Constructor Vacio.
	 * */
	public Capacitacion() {
		
	}
	
	/**
	 * @param identificador
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantidadDeAsistentes
	 */
	public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {

		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadDeAsistentes;
	}
	
	/**
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantidadDeAsistentes
	 */
	public Capacitacion( String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {
		
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadDeAsistentes;
	}

	public int getIdentificador() {
		return identificador;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public String getHora() {
		return hora;
	}
	public String getLugar() {
		return lugar;
	}
	public String getDuracion() {
		return duracion;
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	
	public String toString() {
		return "Capacitacion [rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes="
				+ cantidadAsistentes + "]";
	}	
	
	  /**
	   * 
	   */
	private static final long serialVersionUID = 1L;
}
