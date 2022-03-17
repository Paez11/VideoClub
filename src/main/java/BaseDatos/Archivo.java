package BaseDatos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import DAO.*;

public class Archivo {

	/**
	 * Según el enum que se le de como parámetro, guarda los datos en un archivo xml
	 * 
	 * @param producto Esto será un Enum
	 */
	public static void save(ProductoDAO producto) {
		JAXBContext archivo;
		String productoXML = "Productos.xml";
		try {
			archivo = JAXBContext.newInstance(ProductoDAO.class);
			Marshaller m = archivo.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			m.marshal(producto, new File(productoXML));
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void save(ReservaDAO reservas) {
		JAXBContext archivo;
		String ReservaXML = "Reservas.xml";
		try {
			archivo = JAXBContext.newInstance(ReservaDAO.class);
			Marshaller m = archivo.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			m.marshal(reservas, new File(ReservaXML));
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void save(ClienteDAO clientes) {
		JAXBContext archivo;
		String clienteXML="Clientes.xml";
		try {
			archivo=JAXBContext.newInstance(ClienteDAO.class);
			Marshaller m=archivo.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			m.marshal(clientes, new File(clienteXML));
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}	
	
	public static void save(CopiaDAO copias) {
		JAXBContext archivo;
		String copiaXML="Copias.xml";
		try {
			archivo=JAXBContext.newInstance(CopiaDAO.class);
			Marshaller m=archivo.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			m.marshal(copias, new File(copiaXML));
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}	

	/**
	 * Según el enum que se le de como parámetro, carga los datos desde un archivo
	 * xml
	 * 
	 * @param producto Esto será un Enum
	 */
	public static void loadProductos(DAO dao) {
		JAXBContext archivo=null;
		String productoXML = "";
		try {
			if (dao instanceof ProductoDAO) {
				productoXML = "Productos.xml";
				archivo = JAXBContext.newInstance(ProductoDAO.class);
			}
			
			if (archivo != null) {
				Unmarshaller um = archivo.createUnmarshaller();

				DAO newDAO = (DAO) um.unmarshal(new File(productoXML));
				
				dao.setList(newDAO.getList());
			}
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void load(DAOMap dao) {
		JAXBContext archivo=null;
		String XML = "";
		try {
			if (dao instanceof ReservaDAO) {
				XML = "Reservas.xml";
				archivo = JAXBContext.newInstance(ReservaDAO.class);
			}else if(dao instanceof ClienteDAO) {
				XML = "Clientes.xml";
				archivo = JAXBContext.newInstance(ClienteDAO.class);
			}else if(dao instanceof CopiaDAO) {
				XML ="Copias.xml";
				archivo = JAXBContext.newInstance(CopiaDAO.class);
			}
			
			if (archivo != null) {
				Unmarshaller um = archivo.createUnmarshaller();
				DAOMap newDAOMap = (DAOMap) um.unmarshal(new File(XML));
				dao.setHashMap(newDAOMap.getHashMap());
			}
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}
}
