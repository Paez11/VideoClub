package Modelo;

import interfaces.ICopia;

public class Copia implements ICopia {
	
	private String Key;
	private String Nombre;
	private Copia(String key, String nombre) {
		super();
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
	
}