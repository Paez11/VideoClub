package DAO;

import java.io.File;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import controlador.Lista;
import modelo.Cliente;


@XmlRootElement(name="ClienteDAO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClienteDAO {
	private static ClienteDAO _instance;
	private HashMap<String,Cliente> clientes;
	
	private ClienteDAO(){
		clientes = new HashMap<String,Cliente>();
	}
	
	public static ClienteDAO getInstance() {
		if(_instance==null) {
			_instance=new ClienteDAO();
		}
		return _instance;
	}
	/**
	 * Añadir un cliente
	 * @param cliente
	 * @return true si se ha añadido el cliente o false si no
	 */
	public boolean addCliente(Cliente cliente) {
		boolean result=false;
		if(!clientes.containsKey(cliente.getDni())) {
			clientes.put(cliente.getDni(), cliente);
			result=true;
		}
		return result;
	}
	/**
	 * Elimina el cliente que se le pasa por nombre
	 * @param nombre del cliente a eliminar
	 * @return el cliente eliminado
	 */
	public Cliente deleteCliente(String key) {
		return clientes.remove(key);
	}
	
	
	
	// Edita todos los atributos del cliente, Nombre,Dni,Edad
	/**
	 * Editar nombre del cliente
	 * @param key del cliente al que se le quiere cambiar el nombre
	 * @param nombre: nuevo nombre
	 * @return si se ha cambiado el nombre correctamente o no
	 */
	public boolean editClienteNombre(String key,String newNombre) {
		boolean result=false;
		Cliente c=this.searchCliente(key);
		if(c!=null) {
			c.setNombre(newNombre);
			result=true;
		}
		return result;
	}
	/**
	 * Editar DNI del cliente
	 * @param key del cliente al que se le quiere cambiar el DNI
	 * @param dni: nuevo DNI
	 * @return si se ha cambiado el DNI correctamente true, false si no
	 */
	public boolean editClienteDni(String key,String dni) {
		boolean result=false;
		Cliente c=this.searchCliente(key);
		if(c!=null) {
			c.setDni(dni);
			result=true;
		}
		return result;
	}
	public boolean editClienteEdad(String key,int edad) {
		boolean result=false;
		Cliente c=this.searchCliente(key);
		if(c!=null) {
			c.setEdad(edad);
			result=true;
		}
		return result;
				
	}
	
	public Cliente searchCliente(String dni) {
		return clientes.get(dni);
	}
	
	
	
	@Override
	public String toString() {
		
		String s="";
		for (String i : clientes.keySet()) {
			s+="\n"+ clientes.get(i)+"\n";
		}
		return s;
	}

	public void saveFile(Lista e) {
		JAXBContext archivo;
		if(e==Lista.Clientes) {
			String clienteXML="Cliente.xml";
			try {
				archivo=JAXBContext.newInstance(ClienteDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				m.marshal(_instance, new File(clienteXML));
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	public void loadFile(Lista e) {
		JAXBContext archivo;
		if(e==Lista.Clientes) {
			String clienteXML="Cliente.xml";
			try {
				archivo = JAXBContext.newInstance(ClienteDAO.class);
			    Unmarshaller um = archivo.createUnmarshaller();
			     
			    ClienteDAO newClienteDAO = (ClienteDAO) um.unmarshal( new File(clienteXML) );
			    clientes=newClienteDAO.clientes;
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
