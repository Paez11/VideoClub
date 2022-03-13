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
	
	private ClienteDAO() {
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
	public boolean editCliente(String key,Cliente nuevoNombre, Cliente antiguoNombre) {
		boolean result=false;
		if(this.clientes.containsKey(key)) {
			this.clientes.replace(key, antiguoNombre, nuevoNombre);
		}
		return result;
	}
	/**
	 * Lista de todos los clientes
	 * @return la lista con los clientes
	 */
	public void showClientes() {
		String lista="|Lista de Clientes|";
		for(String key:clientes.keySet()) {
			lista="\nDni: "+key+"\tValor: "+clientes.get(key);
		}
	}
	
	public Cliente searchCliente(String nombre) {
		return clientes.get(nombre);
	}
	
	public void saveFile(Enum e) {
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
	
	public void loadFile(Enum e) {
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
