package DAO;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import modelo.Copia;


@XmlRootElement(name="CopiaDAO")
@XmlAccessorType(XmlAccessType.FIELD)
public class CopiaDAO {
	
	private HashMap <String,Copia> CopiaDAO;

	public CopiaDAO() {
		this.CopiaDAO = new HashMap <String,Copia>();
	}
	
	public boolean addCopia(Copia c) {
		boolean result = false;
		if(!this.CopiaDAO.containsKey(c.getKey())) {
			this.CopiaDAO.put(c.getKey(), c);
			result =true;
		}
		return result;
	}
	
	public Copia deleteCopia(String key) {
		Copia c=null;
		if(this.CopiaDAO.containsKey(key)) {
			c=this.CopiaDAO.remove(key);
		}
		return c;	
	}
	
	//Editar Clave
	public boolean editCopia(String key) {

		boolean valid=false;
		
		if(this.CopiaDAO.containsKey(key)) {
			CopiaDAO.get(key).setKey(key);
			valid=true;
		}
		return valid;
	}
	
	//No terminado
	
	public void showCopia() {
		
	}
	
	public Copia searchCopia(String key) {
		Copia c=null;
		if(this.CopiaDAO.containsKey(key)) {
			c=this.CopiaDAO.get(key);
		}
		return c;
	}
}
