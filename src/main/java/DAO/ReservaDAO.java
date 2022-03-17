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
import modelo.Reserva;
import modelo.estado;


@XmlRootElement(name="Reservas")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReservaDAO {
	/**
	 * variable privada est�tica para hacer el patr�n singleton
	 */
	private static ReservaDAO _instance;
	
	/**
	 * HashMap para almacenar las reservas 
	 */
	private HashMap<String, Reserva> alm;
	
	/**
	 * Constructor privado para hacer el patr�n singleton
	 */
	private ReservaDAO(){
		alm = new HashMap<String,Reserva>();
	}
	
	/**
	 * M�todo que instancia una �nica vez para hacer el patr�n singleton
	 * @return Devuelve la variable est�tica y privada del patr�n singleton 
	 */
	public static ReservaDAO getInstance() {
		if(_instance==null) {
			_instance=new ReservaDAO();
		}
		return _instance;
	}
	
	/**
	 * M�todo para a�adir una nueva reserva
	 * @param r: es la reserva que queremos a�adir a nuestro hashmap
	 * @return devuelve true si se ha a�adido y false si no se ha a�adido
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
	 * M�todo para borrar una reserva del hashmap
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
	 * M�todo que edita la fecha prevista de una reserva
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
	 * M�todo que edita la fecha de entrega de una reserva
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
	 * M�todo que edita el estado de la reserva
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
	 * M�todo que busca una reserva a trav�s de su c�digo
	 * @param key: c�digo de la reserva que se esta buscando
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
	 * M�todo toString sobreescrito para mostrar de forma ordenada el contenido del HashMap
	 */
	@Override
	public String toString() {
		
		String s="";
		for (String i : alm.keySet()) {
			s+=alm.get(i)+"\n"+"----------------------------"+"\n";
		}
		return s;
	}

	public void saveFile(Lista e) {
		JAXBContext archivo;
		if(e==Lista.Reservas) {
			String reservaXML="Reserva.xml";
			try {
				archivo=JAXBContext.newInstance(ReservaDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				//alm hay que cambiarlo cuando se implemente el patr�n singleton
				m.marshal(alm, new File(reservaXML));
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	public void loadFile(Lista e) {
		JAXBContext archivo;
		if(e==Lista.Reservas) {
			String reservaXML="Reserva.xml";
			try {
				archivo = JAXBContext.newInstance(ReservaDAO.class);
			    Unmarshaller um = archivo.createUnmarshaller();
			     
			    ReservaDAO newReservaDAO = (ReservaDAO) um.unmarshal( new File(reservaXML) );
			    alm=newReservaDAO.alm;
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
