package DAO;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import modelo.Producto;

@XmlRootElement(name="ProductoDAO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductoDAO {
	
	private ArrayList<Producto> listaProductos;

	public boolean addProducto(Producto p) {
		boolean result=false;
		if(p!=null && !listaProductos.contains(p)) {
			listaProductos.add(p);
			result=true;
		}
		return result;
	}
	
	public Producto deleteProducto(String nombre) {
		Producto p = new Producto();
		if(nombre!=null && listaProductos.contains(nombre)) {
			p.setNombre(nombre);
			listaProductos.remove(p);
		}
		return p;
	}
	
	public boolean editProducto(String nombre) {
		boolean result=false;
		Producto p = new Producto();
		String s=leeString();
		double d=leeDouble();
		if(nombre!=null && listaProductos.contains(nombre)) {
			p.setNombre(nombre);
			p.setNombre(s);
			p.setDescripcion(s);
			p.setPrecio(d);
		}
		return result;
	}
	
	public void showProducto() {
		//Rafa tiene que ponerlo de vista
	}
	
	public Producto searchProducto(String name) {
		Producto p=new Producto();
		if(name!=null && listaProductos.contains(name)) {
			p.setNombre(name);
		}
		return p;
	}
}
