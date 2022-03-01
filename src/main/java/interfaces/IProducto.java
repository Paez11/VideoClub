package interfaces;

public interface IProducto {
	String getNombre();
	String getDescripcion();
	float getPrecio();;
	void setNombre(String nombre);
	void setDescripcion(String descripcion);
	void setPrecio(float precio);
	boolean equals(Object o);
	String toString();
}
