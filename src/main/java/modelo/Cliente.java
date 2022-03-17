package modelo;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import interfaces.ICliente;


@XmlRootElement(name="Cliente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente implements ICliente, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	@XmlAttribute(name="DNI")
	private String dni;
	private int edad;
	private boolean vip;
	
	public Cliente() {
		
	}
	/**
	 * Constructor
	 * @param nombre: Nombre del cliente
	 * @param dni: DNI del cliente
	 * @param edad: Edad del cliente
	 * @param vip: Si el cliente es VIP o no
	 */
	public Cliente(String nombre, String dni, int edad, boolean vip) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.vip = vip;
	}

	/*
	 * Metodo para llamar al atributo nombre de un cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * Metodo para asignarle un valor al atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * Metodo para llamar al atributo DNI de un cliente
	 */
	public String getDni() {
		return dni;
	}

	/*
	 * Metodo para asignar un valor al atributo DNI
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/*
	 * Metodo para obtener la edad de un cliente
	 */
	public int getEdad() {
		return edad;
	}

	/*
	 * Metodo para asignarle un valor al atributo edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*
	 * Metodo que devuelve true o false dependiendo si el cliente es VIP o no
	 */
	public boolean isVip() {
		return vip;
	}

	/*
	 * Metodo para establecerle a Cliente si es VIP o no
	 */
	public void setVip(boolean vip) {
		this.vip = vip;
	}

	/*
	 * Metodo para mostrar todos los atributos de un Cliente
	 */
	public String toString() {
		return "Nombre: " + nombre +
				"\nDNI: " + dni +
				"\nedad: " + edad + 
				"\nvip: " + vip;
	}

	/**
	 * Metodo para comprobar si el DNI de un cliente tiene el mismo DNI que otro 
	 * Nos devuelve true si el DNI es el mismo o false si el DNI no es el mismo
	 */
	public boolean equals(Object dni) {
		boolean result=false;
		
		if(dni!=null) {
			if(this==dni) {
				result=true;
			}else {
				if (getClass()==dni.getClass()) {
					Cliente tmp=(Cliente) dni;
					if(this.getDni().equals(tmp.getDni())) {
						result=true;
					}
				}
			}
		}
		return result;	
	}
	
}
