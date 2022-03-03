package modelo;

import interfaces.IProducto;

public class Producto implements IProducto {
	
	private String Nombre;
	private String Descripcion;
	private double Precio;
	
	public Producto() {
		this("","",-1);
	}
	public Producto(String nombre, String descripcion, double precio) {
		Nombre = nombre;
		Descripcion = descripcion;
		Precio = precio;
	}
	
	public String getNombre() {
		return null;
	}
	public String getDescripcion() {
		return null;
	}
	public double getPrecio() {
		return 0;
	}
	public void setNombre(String nombre) {
	}
	public void setDescripcion(String descripcion) {
		
	}
	public void setPrecio(double precio) {
	}
	@Override
	public String toString() {
		return "Producto: " + Nombre + "\nDescripcion: " + Descripcion + "\nPrecio: " + Precio + "€";
	}
	
	public boolean equals(Object obj) {
		boolean result=false;
		if(obj!=null && this==obj) {
				result=true;
		}else {
			if(getClass()==obj.getClass()) {
				Producto tmp=(Producto) obj;
				if(this.getNombre().equals(tmp.getNombre())) {
					result=true;
				}
			}
		}
		return result;
	}
}
