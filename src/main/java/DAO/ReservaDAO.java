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
import modelo.Reserva;
import modelo.estado;


@XmlRootElement(name="Reservas")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReservaDAO {
	private static ReservaDAO _instance;
	private HashMap<String, Reserva> alm;
	
	private ReservaDAO(){
		alm = new HashMap<String,Reserva>();
	}
	
	public static ReservaDAO getInstance() {
		if(_instance==null) {
			_instance=new ReservaDAO();
		}
		return _instance;
	}
	
	public boolean addReserva(Reserva r) {
		boolean valid=false;
		if(!this.alm.containsKey(r.getKey())) {
			this.alm.put(r.getKey(), (Reserva) r);
			valid=true;
		}
		return valid;
	}
	
	public Reserva deleteReserva(String key) {
		Reserva p=null;
		if(this.alm.containsKey(key)) {
			p=(Reserva) this.alm.remove(key);
		}
		return p;
	}
	
	public boolean editFechaPrevista(String key,String fecha) {
		boolean valid=false;
		Reserva r=this.searchReserva(key);
		if(r!=null) {
			r.setFechaPrevista(fecha);
			valid=true;
		}
		return valid;
	}
	
	public boolean editFechaEntrega(String key,String fecha) {
		boolean valid=false;
		Reserva r=this.searchReserva(key);
		if(r!=null) {
			r.setFechaReal(fecha);
			valid=true;
		}
		return valid;
	}
	
	public boolean editEstado(String key,estado e) {
		boolean valid=false;
		Reserva r=this.searchReserva(key);
		if(r!=null) {
			r.setEstado(e);
			valid=true;
		}
		return valid;
	}
	

	public Reserva searchReserva(String key) {
		Reserva r=null;
		if(this.alm.containsKey(key)) {
			r=this.alm.get(key);
		}
		return r;
	}
	
	@Override
	public String toString() {
		
		String s="";
		for (String i : alm.keySet()) {
			s+="\n"+ alm.get(i)+"\n";
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
				
				//alm hay que cambiarlo cuando se implemente el patrón singleton
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
