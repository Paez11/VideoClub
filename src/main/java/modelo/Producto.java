package modelo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import interfaces.IProducto;

@XmlRootElement(name="Producto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Producto implements IProducto, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name="Nombre")
	private String Nombre;
	@XmlAttribute(name="Descripcion")
	private String Descripcion;
	@XmlAttribute(name="Precio")
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
