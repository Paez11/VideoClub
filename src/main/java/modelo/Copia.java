package modelo;

import java.io.Serializable;
import java.util.UUID;

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
	
	/**
	 * Los atributos que va a tener la clase copia
	 * 
	 * @param nombre--> Nombre de la copia
	 * @param descripcion--> La descripción de la copia
	 * @param precio--> El precio que va a tener la copia
	 * @param nCopias--> El número total de las copias
	 * @param key--> La key de las copias
	 */
	public Copia(String nombre, String descripcion, double precio, int nCopias, String key) {
		super(nombre, descripcion, precio, nCopias);
		this.key=key;
	}
	
	public Copia() {
		super();
		this.key="";
	}
	/**
	 * Obtener el valor de key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * Colocar el valor de  key
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	/**
	 * Metodo que genera un ID aleatorio
	 * @return devuelve el número aleatorio generado
	 */
	public String generarID() {
		String id = UUID.randomUUID().toString();
		return id;
	}

	
	@Override
	/**
	 * Generar una cadena de texto
	 */
	public String toString() {
		return "Copia--> \n"+super.toString()
				+ "\nclave: "+ key + "\n"+"----------------------------";
	}

	
	
	@Override
	/**
	 * Identificador de la instacia de la clase
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	/**
	 * Metodo equals que compara dos objetos para ver si son iguales
	 * Si son iguales devuelve true y en el caso de que no lo sean false
	 */
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
