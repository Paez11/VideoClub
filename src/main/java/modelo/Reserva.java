package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

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
	private LocalDate fechaCreacion;
	@XmlAttribute(name="fechaPrevista")
	private String fechaPrevista;
	@XmlAttribute(name="fechaReal")
	private String fechaReal;
	@XmlAttribute(name="estado")
	private estado estado;
	@XmlAttribute(name="key", required=true)
	private String key;
	private String producto;
	private String dni;
	
	/**
	 * constructor personalizado que crea una reserva declarando cada una de sus variables
	 * @param fechaCreacion Fecha en la que se crea la reserva
	 * @param fechaPrevista Fecha en la que se prevee la entrega de la reserva
	 * @param fechaReal Fecha en la que se se entrega realmente la reserva
	 * @param estado Estado del producto
	 * @param key Clave del producto
	 * @param producto Nombre de la pelicula
	 * @param dni Del cliente
	 */
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
	
	/**
	 * Constructor que da valores por defecto a una reserva
	 */
	public Reserva() {
		this(LocalDate.now(),"","",null,"","","");
	}
	

	/**
	 * devuelve la fecha de creacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Modifica la fecha de creación al valor que se ha pasado
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Devuelve la fecha prevista
	 */
	public String getFechaPrevista() {
		return fechaPrevista;
	}

	/**
	 * Modifica la fecha prevista al valor que se ha pasado
	 */
	public void setFechaPrevista(String fechaPrevista) {
		this.fechaPrevista = fechaPrevista;
	}

	/**
	 * Devuelve la fecha real
	 */
	public String getFechaReal() {
		return fechaReal;
	}

	/**
	 * Modifica la fecha real al valor que se ha pasado
	 */
	public void setFechaReal(String fechaReal) {
		this.fechaReal = fechaReal;
	}

	/**
	 * Devuelve el estado del producto
	 */
	public estado getEstado() {
		return estado;
	}

	/**
	 * Modifica el estado del producto al valor que se ha pasado
	 */
	public void setEstado(estado estado) {
		this.estado = estado;
	}

	/**
	 * Devuelve el valor de la clave
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Modifica el valor de la clave al valor que se ha pasado
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	
	/**
	 * Devuelve el Producto
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * Modifica el valor producto al valor que se ha pasado
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * Devuelve el valor de dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Modifica el valor del dni al valor que se ha pasado
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	

	/**
	 * Genera un id random para la reserva
	 * @return devuelve el id generado
	 */
	public String generarID() {
		String id = UUID.randomUUID().toString();
		return id;
	}
	
	/**
	 * Método sobreescrito del toString para mostrar la informacion de reserva de forma ordenada
	 */
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

	
	/**
	 * Método sobreescrito del hasCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		return result;
	}

	/**
	 * Método sobreescrito del equals para comparar las distintas variables de una reserva
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (estado != other.estado)
			return false;
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