package DAO;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import modelo.Copia;


@XmlRootElement(name="CopiaDAO")
@XmlAccessorType(XmlAccessType.FIELD)
public class CopiaDAO extends DAOMap{
	private static CopiaDAO _instance;
	private HashMap <String,Copia> CopiaDAO;

	private CopiaDAO() {
		CopiaDAO = new HashMap <String,Copia>();
	}
	
	public static CopiaDAO getInstance() {
		if(_instance==null) {
			_instance=new CopiaDAO();
		}
		return _instance;
	}
	
	@Override
	public HashMap getHashMap() {
		
		return this.CopiaDAO;
	}

	@Override
	public void setHashMap(HashMap h) {
		this.CopiaDAO.clear();
		this.CopiaDAO.putAll(h);
		
	}
	
	
	/**
	 * metodo que a�ade una copia
	 * @param c--> Copia
	 * @return devuelve true si se ha a�adido y false si no
	 */
	public boolean addCopia(Copia c) {
		boolean result = false;
		if(!this.CopiaDAO.containsKey(c.getKey())) {
			this.CopiaDAO.put(c.getKey(), c);
			result =true;
		}
		return result;
	}
	/**
	 * Metodo que elimina un cliente
	 * @param key de la copia
	 * @return la copia que se ha eliminado
	 */
	public Copia deleteCopia(String key) {
		Copia c=null;
		if(this.CopiaDAO.containsKey(key)) {
			c=this.CopiaDAO.remove(key);
			c.setnCopias(c.getnCopias()-1);
		}
		return c;	
	}
	/**
	 * Metodo que busca la copia
	 * @param key de la copia
	 * @return la copia buscada
	 */

	public Copia searchCopia(String key) {
		Copia c=null;
		if(this.CopiaDAO.containsKey(key)) {
			c=this.CopiaDAO.get(key);
		}
		return c;
	}
	
	@Override
	public String toString() {
		
		String s="";
		for (String i : CopiaDAO.keySet()) {
			s+="\n"+ CopiaDAO.get(i)+"\n";
		}
		return s;
	}
}
