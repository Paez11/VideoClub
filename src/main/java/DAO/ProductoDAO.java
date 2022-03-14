package DAO;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import controlador.Lista;
import modelo.Producto;

@XmlRootElement(name="ProductoDAO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductoDAO {
	private static ProductoDAO _instance;
	private ArrayList<Producto> listaProductos;
	
	private ProductoDAO() {
		listaProductos=new ArrayList<Producto>();
	}
	
	public static ProductoDAO getInstance() {
		if(_instance==null) {
			_instance=new ProductoDAO();
		}
		return _instance;
	}

	public boolean addProducto(Producto p) {
		boolean result=false;
		if(!this.listaProductos.contains(p)) {
			listaProductos.add(p);
			result=true;
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
	
	public boolean editNombre(String nombre) {
		boolean result=false;
		Producto p = new Producto();
		for(int i=0; i<listaProductos.size(); i++) {
			if(p!=null) {
				p=listaProductos.get(i);
				p.setNombre(nombre);
			}
		}
		return result;
	}
	public boolean editDescripcion(String descripcion) {
		boolean result=false;
		Producto p = new Producto();
		for(int i=0; i<listaProductos.size(); i++) {
			if(p!=null) {
				p=listaProductos.get(i);
				p.setDescripcion(descripcion);
			}
		}	
		return result;
	}
	
	public boolean editPrecio(double precio) {
		boolean result=false;
		Producto p = new Producto();
		for(int i=0; i<listaProductos.size(); i++) {
			if(p!=null) {
				p=listaProductos.get(i);
				p.setPrecio(precio);
			}
		}	
		return result;
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
	
	@Override
	public String toString() {
		String s="";
		for (Producto p : listaProductos) {
			s+=p.toString();
		}
		return s;
	}
	
	public void saveFile(Lista e) {
		JAXBContext archivo;
		if(e==Lista.Productos) {
			String productoXML="Producto.xml";
			try {
				archivo=JAXBContext.newInstance(ProductoDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				m.marshal(_instance, new File(productoXML));
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	public void loadFile(Lista e) {
		JAXBContext archivo;
		if(e==Lista.Productos) {
			String productoXML="Producto.xml";
			try {
				archivo = JAXBContext.newInstance(ProductoDAO.class);
			    Unmarshaller um = archivo.createUnmarshaller();
			     
			    ProductoDAO newProductoDAO = (ProductoDAO) um.unmarshal( new File(productoXML) );
			    listaProductos=newProductoDAO.listaProductos;
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}
}
