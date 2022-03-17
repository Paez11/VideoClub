package BaseDatos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import DAO.*;

public class Archivo {

	/**
	 * Metodo que guardara la coleccion que reciba en un archivo xml para su posterior recarga en el programa de nuevo
	 * @param dao clase padre de las clases dao en la que se instaciara la coleccion que reciba
	 */
	public static void save(DAO dao) {
		JAXBContext archivo;
		String productoXML = "Productos.xml";
		try {
			archivo = JAXBContext.newInstance(ProductoDAO.class);
			Marshaller m = archivo.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			m.marshal(dao, new File(productoXML));
		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Metodo que guardara la coleccion que reciba en un archivo xml para su posterior recarga en el programa de nuevo
	 * @param dao clase padre de las clases dao en la que se instaciara la coleccion que reciba
	 */
	public static void save(DAOMap dao) {
		JAXBContext archivo;
		String copiaXML="Copias.xml";
		String clienteXML="Clientes.xml";
		String ReservaXML = "Reservas.xml";
		try {
			if(dao instanceof CopiaDAO) {
				archivo=JAXBContext.newInstance(CopiaDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				m.marshal(dao, new File(copiaXML));
			}else if(dao instanceof ClienteDAO) {
				archivo=JAXBContext.newInstance(ClienteDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				m.marshal(dao, new File(clienteXML));
			}else if(dao instanceof ReservaDAO) {
				archivo = JAXBContext.newInstance(ReservaDAO.class);
				Marshaller m = archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

				m.marshal(dao, new File(ReservaXML));
			}

		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Metodo que cargara el archivo xml con los datos de la coleccion guardados segun la coleccion que reciba
	 * @param dao clase padre de las clases dao en la que se instaciara la coleccion que reciba
	 */
	public static void load(DAO dao) {
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
	
	/**
	 * Metodo que cargara el archivo xml con los datos de la coleccion guardados segun la coleccion que reciba
	 * @param dao clase padre de las clases dao en la que se instaciara la coleccion que reciba
	 */
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
