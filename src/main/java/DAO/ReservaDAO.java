package DAO;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

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
	
	
}
