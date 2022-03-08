package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import interfaces.IReserva;
@XmlRootElement(name="Reserva")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reserva implements IReserva, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute(name="fechaCreacion")
	private String fechaCreacion;
	@XmlAttribute(name="fechaPrevista")
	private String fechaPrevista;
	@XmlAttribute(name="fechaReal")
	private String fechaReal;
	@XmlAttribute(name="estado")
	private estado estado;
	@XmlAttribute(name="key", required=true)
	private String key;
	
	
	
	public Reserva(String fechaCreacion, String fechaPrevista, String fechaReal, model.estado estado, String key) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.fechaPrevista = fechaPrevista;
		this.fechaReal = fechaReal;
		this.estado = estado;
		this.key = key;
	}
	
	public Reserva() {
		super();
		this.fechaCreacion = null;
		this.fechaPrevista = null;
		this.fechaReal = null;
		this.estado = null;
		this.key = null;
	}
	

	public String getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

	public String getFechaPrevista() {
		// TODO Auto-generated method stub
		return this.fechaPrevista;
	}

	public String getFechaReal() {
		// TODO Auto-generated method stub
		return this.fechaReal;
	}

	
	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	public void setFechaCreacion(String fechaCreacion) {
		// TODO Auto-generated method stub
		this.fechaCreacion = fechaCreacion;
	}


	public void setFechaPrevista(String fechaPrevista) {
		this.fechaPrevista = fechaPrevista;
	}

	public void setFechaReal(String fechaReal) {
		this.fechaReal = fechaReal;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean equals(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Reserva [fechaCreacion=" + fechaCreacion + ", fechaPrevista=" + fechaPrevista + ", fechaReal="
				+ fechaReal + ", estado=" + estado + ", key=" + key + "]";
	}


	

}
