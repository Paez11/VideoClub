package DAO;

import java.io.File;
import java.util.HashMap;
import java.util.List;

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
public class ReservaDAO extends DAOMap{
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
	
	@Override
	public HashMap getHashMap() {
		return this.alm;
	}

	@Override
	public void setHashMap(HashMap h) {
		this.alm.clear();
		this.alm.putAll(h);
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
			s+=alm.get(i)+"\n"+"----------------------------"+"\n";
		}
		return s;
	}
	
}
