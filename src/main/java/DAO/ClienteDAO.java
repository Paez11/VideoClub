package DAO;

import java.util.HashMap;
import modelo.Cliente;

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
	
}
