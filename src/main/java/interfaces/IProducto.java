package interfaces;

public interface IProducto {
	String getNombre();
	String getDescripcion();
	double getPrecio();
	void setNombre(String nombre);
	void setDescripcion(String descripcion);
	void setPrecio(double precio);
	boolean equals(Object o);
	String toString();
}
