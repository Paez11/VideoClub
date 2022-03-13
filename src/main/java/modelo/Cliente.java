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
	
	@XmlAttribute(name="Nombre")
	private String nombre;
	@XmlAttribute(name="DNI")
	private String dni;
	@XmlAttribute(name="Edad")
	private int edad;
	@XmlAttribute(name="VIP")
	private boolean vip;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String dni, int edad, boolean vip) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.vip = vip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public String toString() {
		return "Nombre de cliente=" + nombre +
				"\nDNI:" + dni +
				"\ncon edad=" + edad + 
				"\nvip=" + vip;
	}

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
