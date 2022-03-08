import java.util.ArrayList;
import java.util.HashMap;

public class ClienteDAO {
	static HashMap<String,Cliente> clientes = new HashMap<String,Cliente>();
	public ClienteDAO() {
		this.clientes = new HashMap<String,Cliente>();
	}
	/**
	 * Añadir un cliente
	 * @param cliente
	 * @return true si se ha añadido el cliente o false si no
	 */
	private boolean addCliente(Object cliente) {
		boolean result=false;
		if(!this.clientes.containsKey(cliente.getDni())) {
			this.clientes.put(cliente.getDni(), cliente);
			result=true;
		}
		return result;
	}
	/**
	 * Elimina el cliente que se le pasa por nombre
	 * @param nombre del cliente a eliminar
	 * @return el cliente eliminado
	 */
	private Cliente deleteCliente(String nombre) {
		return clientes.remove(nombre);
		
	}
	
	
	
	// Edita todos los atributos del cliente, Nombre,Dni,Edad
	private boolean editCliente(String key,Cliente nuevoNombre, Cliente antiguoNombre) {
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
	private void showClientes() {
		String lista="|Lista de Clientes|";
		for(String key:clientes.keySet()) {
			lista="\nDni: "+key+"\tValor: "+clientes.get(key);
		}
		return;
	}
	public Cliente searchCliente(String nombre) {
		return clientes.get(nombre);
	}
	
	
	
	
	
	
}
