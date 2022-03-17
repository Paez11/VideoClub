package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import interfaces.IReserva;
@XmlRootElement(name="Reserva")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reserva implements IReserva, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlTransient
	private LocalDate fechaCreacion;

	private String fechaPrevista;

	private String fechaReal;

	private estado estado;
	@XmlAttribute(name="key", required=true)
	private String key;

	private String producto;

	private String dni;
	
	
	public Reserva(LocalDate fechaCreacion, String fechaPrevista, String fechaReal, estado estado, String key, String
			producto, String dni) {
		this.fechaCreacion = LocalDate.now();
		this.fechaPrevista = fechaPrevista;
		this.fechaReal = fechaReal;
		this.estado = estado;
		this.key = key;
		this.producto= producto;
		this.dni= dni;
	}
	
	public Reserva() {
		this(LocalDate.now(),"","",null,"","","");
	}
	


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaPrevista() {
		return fechaPrevista;
	}

	public void setFechaPrevista(String fechaPrevista) {
		this.fechaPrevista = fechaPrevista;
	}

	public String getFechaReal() {
		return fechaReal;
	}

	public void setFechaReal(String fechaReal) {
		this.fechaReal = fechaReal;
	}

	public estado getEstado() {
		return estado;
	}

	public void setEstado(estado estado) {
		this.estado = estado;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	

	public String generarID() {
		String id = UUID.randomUUID().toString();
		return id;
	}
	
	@Override
	public String toString() {
		return "Reserva-->\n"
				+ "\n fechaCreacion:" + fechaCreacion 
				+ "\n fechaPrevista: " + fechaPrevista 
				+ "\n fechaReal: "+ fechaReal 
				+ "\n estado: " + estado 
				+ "\n key: " + key
				+ "\n producto: " + producto
				+ "\n dni: " + dni;		
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}
}