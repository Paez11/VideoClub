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
	@XmlAttribute(name="NumeroCopias")
	private int nCopias;
	
	/**
	 * Constructor completo de Producto.
	 * @param nombre Nombre del producto.
	 * @param descripcion Descripcion del producto.
	 * @param precio Precio del producto.
	 * @param nCopias Nº de copias del producto.
	 */
	public Producto(String nombre, String descripcion, double precio, int nCopias) {
		Nombre = nombre;
		Descripcion = descripcion;
		Precio = precio;
		this.nCopias= nCopias;
	}
	
	/**
	 * Constructor por defecto de Producto.
	 */
	public Producto() {
		this("","",-1,-1);
	}
	/**
	 * Llama al atributo nombre de un producto.
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * Asigna al atributo nombre un valor.
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * Llama al atributo descripcion de un producto.
	 */
	public String getDescripcion() {
		return Descripcion;
	}
	/**
	 * Asigna al atributo descripcion un valor.
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	/**
	 * Llama al atributo precio de un producto.
	 */
	public double getPrecio() {
		return Precio;
	}
	/**
	 * Asigna al atributo precio un valor.
	 */
	public void setPrecio(double precio) {
		Precio = precio;
	}
	/**
	 * Llama al atributo ncopias de un producto.
	 */
	public int getnCopias() {
		return nCopias;
	}
	/**
	 * Asigna al atributo ncopias un valor.
	 */
	public void setnCopias(int nCopias) {
		this.nCopias = nCopias;
	}

	/**
	 * Muestra todos los datos de un producto.
	 */
	@Override
	public String toString() {
		return "Producto: " + Nombre + "\nDescripcion: " + Descripcion + "\nPrecio: " + Precio + "€" + "\nCopias: "+ nCopias;
	}
	
	/**
	 * Método que dice si un nombre de un producto es igual al nombre de otro producto. Da true si es el mismo y false si es diferente.
	 */
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
