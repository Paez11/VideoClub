package DAO;

import java.io.File;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import modelo.Copia;

public class CopiaDAO {
	
	private HashMap <String,Copia> copias;

	public CopiaDAO() {
		this.copias = new HashMap <String,Copia>();
	}
	
	public boolean addCopia(Copia c) {
		boolean result = false;
		if(!this.copias.containsKey(c.getKey())) {
			this.copias.put(c.getKey(), c);
			result =true;
		}
		return result;
	}
	
	public Copia deleteCopia(String key) {
		Copia c=null;
		if(this.copias.containsKey(key)) {
			c=this.copias.remove(key);
		}
		return c;	
	}
	
	public boolean editarCopia(String key, Copia nuevaCopia) {
		boolean result=false;
		if(!this.copias.containsKey(key)) {
			this.copias.put(key,nuevaCopia);
			result=true;
		}
		return result;
	}
	
	//No terminado
	
	public void showCopia() {
		
	}
	
	public Copia searchCopia(String id) {
		Copia c=null;
		
		for (String e: copias.keySet()) {
			if(copias.containsKey(id)) {
				c=copias.get(e);
			}
		}
		
		return c;
	}
	
	public void saveFile (String archivo) {
		JAXBContext contexto;
		
		try {
			contexto=JAXBContext.newInstance(CopiaDAO.class);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(copias, new File(archivo));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void loadFile(String archivo) {
		JAXBContext contexto;
		
		try {
			contexto=JAXBContext.newInstance(CopiaDAO.class);
			Unmarshaller um= contexto.createUnmarshaller();
			CopiaDAO newCopias =(CopiaDAO) um.unmarshal(new File(archivo));
			copias = newCopias.copias;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
