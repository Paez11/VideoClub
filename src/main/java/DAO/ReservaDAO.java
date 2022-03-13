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
import interfaces.ICliente;
import interfaces.IReserva;
import modelo.Reserva;
//martes 15 10:30
@XmlRootElement(name="Reservas")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReservaDAO {

	private HashMap<String, Reserva> alm;
	
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
	
	public boolean editReserva(String key) {

		boolean valid=false;
		
		if(this.alm.containsKey(key)) {
			alm.get(key).setKey(key);
			valid=true;
		}
		
		return valid;
	}
	
	public void showReserva() {
		for(String e:alm.keySet()) {
			System.out.println(e);
		}
	}
	
	public Reserva searchReserva(String key) {
		Reserva r=null;
		if(this.alm.containsKey(key)) {
			r=this.alm.get(key);
		}
		return r;
	}
	
	public void saveFile(Enum e) {
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
	
	public void loadFile(Enum e) {
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
