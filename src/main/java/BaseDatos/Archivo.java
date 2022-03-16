package BaseDatos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import DAO.*;
import controlador.Lista;

public class Archivo {
		
	/**
	 * Según el enum que se le de como parámetro, guarda los datos en un archivo xml
	 * @param producto Esto será un Enum
	 */
	public void saveProductos(ProductoDAO producto) {
		JAXBContext archivo;
		//if(l==Lista.Productos) {
			String productoXML="Producto.xml";
			try {
				archivo=JAXBContext.newInstance(ProductoDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				m.marshal(producto, new File(productoXML));
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		//}
	}	
	
	/**
	 * Según el enum que se le de como parámetro, carga los datos desde un archivo xml
	 * @param producto Esto será un Enum
	 */
	public void loadProductos(ProductoDAO producto) {
		JAXBContext archivo;
		//if(l==Lista.Productos) {
			String productoXML="Producto.xml";
			try {
				archivo = JAXBContext.newInstance(ProductoDAO.class);
			    Unmarshaller um = archivo.createUnmarshaller();
			     
			    ProductoDAO newProductoDAO = (ProductoDAO) um.unmarshal( new File(productoXML) );
			    //producto=newProductoDAO.;
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		//}
	}
}
