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
		for(int i=0; i<listaProductos.size(); i++) {
			if(p!=null && !listaProductos.get(i).equals(p)) {
				listaProductos.add(p);
				result=true;
			}
		}
		return result;
	}
	
	public Producto deleteProducto(String nombre) {
		Producto p = null;
		for(int i=0; i<listaProductos.size();i++) {
			if(listaProductos.get(i).getNombre().equals(nombre)) {
				p=listaProductos.get(i);
				listaProductos.remove(p);
			}
		}
		return p;
	}
	
	public boolean editProducto(String nombre) {
		boolean result=false;
		Producto p = new Producto();
		String s=leeString();
		double d=leeDouble();
		for(int i=0; i<listaProductos.size(); i++) {
			if(nombre!=null) {
				p=listaProductos.get(i);
				p.setNombre(s);
				p.setDescripcion(s);
				p.setPrecio(d);
			}
		}
		
		return result;
	}
	
	public void showProducto() {
		//Rafa tiene que ponerlo de vista
	}
	
	public Producto searchProducto(String name) {
		Producto p=new Producto();
		for(int i=0; i<listaProductos.size(); i++) {
			if(name!=null) {
				p=listaProductos.get(i);
			}
		}	
		return p;
	}
}
