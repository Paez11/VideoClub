package DAO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import modelo.Reserva;
import modelo.estado;


@XmlRootElement(name="Reservas")
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD
public class ReservaDAO {
	@XmlTransient
=======
public class ReservaDAO extends DAOMap{
>>>>>>> 6de4c10b95ef9e308b26f527de6ac62c69e4e5c0
	private static ReservaDAO _instance;
	private HashMap<String, Reserva> alm;
	
	private ReservaDAO(){
		alm = new HashMap<String,Reserva>();
	}
	
	/**
	 * Método que instancia una única vez para hacer el patrón singleton
	 * @return Devuelve la variable estática y privada del patrón singleton 
	 */
	public static ReservaDAO getInstance() {
		if(_instance==null) {
			_instance=new ReservaDAO();
		}
		return _instance;
	}
	
	@Override
	public HashMap getHashMap() {
		return this.alm;
	}

	@Override
	public void setHashMap(HashMap h) {
		this.alm.clear();
		this.alm.putAll(h);
	}
	
	/**
	 * Método para añadir una nueva reserva
	 * @param r: es la reserva que queremos añadir a nuestro hashmap
	 * @return devuelve true si se ha añadido y false si no se ha añadido
	 */
	public boolean addReserva(Reserva r) {
		boolean valid=false;
		if(!this.alm.containsKey(r.getKey())) {
			this.alm.put(r.getKey(), (Reserva) r);
			valid=true;
		}
		return valid;
	}
	
	/**
	 * Método para borrar una reserva del hashmap
	 * @param key recibe la clave del producto que se quiere borrar
	 * @return devuelve la reserva que se ha borrado
	 */
	public Reserva deleteReserva(String key) {
		Reserva p=null;
		if(this.alm.containsKey(key)) {
			p=(Reserva) this.alm.remove(key);
		}
		return p;
	}
	
	/**
	 * Método que edita la fecha prevista de una reserva
	 * @param key: clave de la reserva que se quiere modificar
	 * @param fecha: nueva fecha prevista para la reserva
	 * @return devuelve true si se ha editado correctamente y false si no se ha editado,
	 * ya sea porque no haya encontrado esa clave o porque no exista
	 */
	public boolean editFechaPrevista(String key,String fecha) {
		boolean valid=false;
		Reserva r=this.searchReserva(key);
		if(r!=null) {
			r.setFechaPrevista(fecha);
			valid=true;
		}
		return valid;
	}
	
	/**
	 * Método que edita la fecha de entrega de una reserva
	 * @param key: clave de la reserva que se quiere modificar
	 * @param fecha: nueva fecha de entrega para la reserva
	 * @return devuelve true si se ha editado correctamente y false si no se ha editado,
	 * ya sea porque no haya encontrado esa clave o porque no exista
	 */
	public boolean editFechaEntrega(String key,String fecha) {
		boolean valid=false;
		Reserva r=this.searchReserva(key);
		if(r!=null) {
			r.setFechaReal(fecha);
			valid=true;
		}
		return valid;
	}
	
	/**
	 * Método que edita el estado de la reserva
	 * @param key: clave de la reserva que se quiere modificar
	 * @param e: nuevo estado de la reserva
	 * @return devuelve true si se ha editado correctamente y false si no se ha editado,
	 * ya sea porque no haya encontrado esa clave o porque no exista
	 */
	public boolean editEstado(String key,estado e) {
		boolean valid=false;
		Reserva r=this.searchReserva(key);
		if(r!=null) {
			r.setEstado(e);
			valid=true;
		}
		return valid;
	}
	
	/**
	 * Método que busca una reserva a través de su código
	 * @param key: código de la reserva que se esta buscando
	 * @return Devuelve la reserva que se esta buscando, o null si no la ha encontrado
	 */
	public Reserva searchReserva(String key) {
		Reserva r=null;
		if(this.alm.containsKey(key)) {
			r=this.alm.get(key);
		}
		return r;
	}
	
	/**
	 * Busca dentro de la coleccion de reservas si existe el elemento que identifica la copia para devolver el objeto 
	 * que la contenga
	 * @param id de la copia que queremos comprobar si existe en la reserva
	 * @return devuelve la reserva si la a encontrado o null si ninguna de ellas contiene ese producto con la esa id en
	 * su atributo de producto o si la reserva a finalizado
	 */
	public Reserva searchCopiaReserva(String id) {
		
		Reserva r=null;
		
		for(Reserva c:alm.values()) {
			if(c.getProducto().equals(id) && c.getFechaReal().equals("Sin entrega")) {
				r=c;
			}
		}
		return r;
	}
	
	
	/**
	 * Método toString sobreescrito para mostrar de forma ordenada el contenido del HashMap
	 */
	@Override
	public String toString() {
		
		String s="";
		for (String i : alm.keySet()) {
			s+=alm.get(i)+"\n"+"----------------------------"+"\n";
		}
		return s;
	}
	
}
