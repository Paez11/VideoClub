package modelo;
import interfaces.ICopia;

public class Copia implements ICopia{
	private String Key;
	private String Nombre;
	
	public Copia(String key, String nombre) {
		
		Key = key;
		Nombre = nombre;
	}

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
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
