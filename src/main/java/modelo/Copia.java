package modelo;

import java.io.Serializable;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import interfaces.ICopia;


@XmlRootElement(name="Copia")
@XmlAccessorType(XmlAccessType.FIELD)
public class Copia extends Producto implements ICopia, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name="key")
	private String key;
	
	
	public Copia(String nombre, String descripcion, double precio, int nCopias, String key) {
		super(nombre, descripcion, precio, nCopias);
		this.key=key;
	}
	
	public Copia() {
		super();
		this.key="";
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	


	
	@Override
	public String toString() {
		return "Copia--> \n"+super.toString()
				+ "\nclave: "+ key + "\n"+"----------------------------";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Copia other = (Copia) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
	
	
}
