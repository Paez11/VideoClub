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
	
	/**
	 * Constructor privado de ProductoDAO.
	 */
	private ProductoDAO() {
		listaProductos=new ArrayList<Producto>();
	}
	
	/**
	 * Método para el patrón singleton.
	 * @return Devuelve un productoDAO.
	 */
	public static ProductoDAO getInstance() {
		if(_instance==null) {
			_instance=new ProductoDAO();
		}
		return _instance;
	}

	/**
	 * Añade un producto a listaProductos.
	 * @param p Producto que se quiere añadir.
	 * @return Devuelve true si se ha añadido y false si no lo ha hecho.
	 */
	public boolean addProducto(Producto p) {
		boolean result=false;
		if(!this.listaProductos.contains(p)) {
			listaProductos.add(p);
			result=true;
		}
		return result;
	}
	
	/**
	 * Elimina un producto de listaProductos.
	 * @param nombre Nombre del producto que se quiere borrar.
	 * @return Devuelve el producto que se borra.
	 */
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
	
	/**
	 * Edita el nombre de un producto.
	 * @param nombre Nombre del producto.
	 * @return Devuelve true si el producto se ha editado y false si no lo ha hecho.
	 */
	public boolean editNombre(String nombre) {
		boolean result=false;
		Producto p = new Producto();
		for(int i=0; i<listaProductos.size(); i++) {
			if(p!=null) {
				p=listaProductos.get(i);
				p.setNombre(nombre);
				result= true;
			}
		}
		return result;
	}
	
	/**
	 * Edita la descripcion de un producto.
	 * @param descripcion Descripcion del producto.
	 * @return Devuelve true si el producto se ha editado y false si no lo ha hecho.
	 */
	public boolean editDescripcion(String descripcion) {
		boolean result=false;
		Producto p = new Producto();
		for(int i=0; i<listaProductos.size(); i++) {
			if(p!=null) {
				p=listaProductos.get(i);
				p.setDescripcion(descripcion);
				result= true;
			}
		}	
		return result;
	}
	
	/**
	 * Edita el precio de un producto.
	 * @param precio Precio del producto.
	 * @return Devuelve true si el producto se ha editado y false si no lo ha hecho.
	 */
	public boolean editPrecio(double precio) {
		boolean result=false;
		Producto p = new Producto();
		for(int i=0; i<listaProductos.size(); i++) {
			if(p!=null) {
				p=listaProductos.get(i);
				p.setPrecio(precio);
				result= true;
			}
		}	
		return result;
	}
	
	/**
	 * Busca un producto por su nombre.
	 * @param name Nombre del producto.
	 * @return Devuelve el producto buscado.
	 */
	public Producto searchProducto(String name) {
		Producto p=null;
		for(int i=0; i<listaProductos.size(); i++) {
			if(listaProductos.get(i).getNombre().equals(name)) {
				p=listaProductos.get(i);
			}
		}	
		return p;
	}
	
	/**
	 * Muestra todos los productos que hay en listaProductos.
	 */
	@Override
	public String toString() {
		String s="";
		for (Producto p : listaProductos) {
			s+=p.toString()+"\n"+"----------------------------"+"\n";
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
