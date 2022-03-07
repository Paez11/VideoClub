package DAO;

import java.util.HashMap;

import model.Copia;

public class CopiaDAO {
	
	private HashMap<String,Copia> CopiaDAO;

	public CopiaDAO() {
		this.CopiaDAO = new HashMap<String,Copia>();
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
	
	public boolean editarCopia(String key, Copia nuevaCopia) {
		boolean result=null;
		if(!this.CopiaDAO.containsKey(key)) {
			this.CopiaDAO.put(key,nuevaCopia);
		}
		return result;
	}
	
	//No terminado
	
	public void showCopia() {
		
	}
	
	public Copia searchCopia(String Copia) {
		Copia c=new Copia();
		
		return c;
	}
}
