package modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import interfaces.ICopia;


@XmlRootElement(name="Copia")
@XmlAccessorType(XmlAccessType.FIELD)
public class Copia implements ICopia{
	
	@XmlAttribute(name="Clave", required = true)
	private String Key;
	
	@XmlAttribute(name="Nombre")
	private String Nombre;
	
	private static Copia miCopia;
	
	private Copia(String key, String nombre) {
		
		this.Key=Key;
		this.Nombre=Nombre;
		
	}
	 public  static Copia getmiCopia(String Key,String Nombre) {
		 
		 if (miCopia==null) {
				 miCopia=new Copia(Key,Nombre); //se crea el objeto miconfigurador
		 }
		 return miCopia;
	 }

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		this.Key=Key;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre=Nombre;
	}

	@Override
	public String toString() {
		return "Copia Key=" + Key + ", Nombre=" + Nombre + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Key == null) ? 0 : Key.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
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
		Copia other = (Copia) obj;
		if (Key == null) {
			if (other.Key != null)
				return false;
		} else if (!Key.equals(other.Key))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}
	
	
}