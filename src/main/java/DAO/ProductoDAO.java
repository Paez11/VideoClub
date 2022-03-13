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
	
	public boolean editProducto(String nombre, String s, double d) {
		boolean result=false;
		Producto p = new Producto();
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
	
	public void saveFile(Enum e) {
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
	
	public void loadFile(Enum e) {
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
