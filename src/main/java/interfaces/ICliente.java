package interfaces;

public interface ICliente {
	String getNombre();
	String getDni();
	int getEdad();
	boolean isVip();
	void setNombre(String nombre);
	void setDni(String dni);
	void setEdad(int edad);
	boolean setVip(boolean vip);
	boolean equals(Object o);
	String toString();
}
