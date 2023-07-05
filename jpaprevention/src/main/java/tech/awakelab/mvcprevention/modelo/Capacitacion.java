package tech.awakelab.mvcprevention.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="capacitaciones")
public class Capacitacion {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="rut_cliente")
	private String rutCliente;
	@Column(name="dia")
	private String dia;
	@Column(name="hora")
	private String hora;
	@Column(name="lugar")
	private String lugar;
	@Column(name="duracion")
	private String duracion;
	@Column(name="cantidad_asistentes")
	private int cantidadAsistentes;
	

	public int getId() {
		return id;
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
	
}
