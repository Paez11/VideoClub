package DAO;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import modelo.Cliente;


@XmlRootElement(name="ClienteDAO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClienteDAO {
	private HashMap<String,Cliente> clientes;
	
	
	public ClienteDAO() {
		clientes = new HashMap<String,Cliente>();
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
	public boolean editClienteNombre(String key,Cliente nombre) {
		boolean result=false;
		if(this.clientes.containsKey(key)) {
			this.clientes.replace(key, nombre);
		}
		return result;
	}
	/**
	 * Editar DNI del cliente
	 * @param key del cliente al que se le quiere cambiar el DNI
	 * @param dni: nuevo DNI
	 * @return si se ha cambiado el DNI correctamente true, false si no
	 */
	public boolean editClienteDni(String key,Cliente dni) {
		boolean result=false;
		if(this.clientes.containsKey(key)) {
			this.clientes.replace(key, dni);
			result=true;
		}
		return result;
	}
	public boolean editClienteEdad(String key,Cliente edad) {
		boolean result=false;
		if(this.clientes.containsKey(key)) {
			this.clientes.replace(key, edad);
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

	
	
	
	
	
	
}
