package DAO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="CopiaDAO")
@XmlAccessorType(XmlAccessType.FIELD)
public class CopiaDAO {
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
	
	public void saveFile(Enum e) {
		JAXBContext archivo;
		if(e==Lista.Copias) {
			String copiaXML="Copia.xml";
			try {
				archivo=JAXBContext.newInstance(CopiaDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				m.marshal(_instance, new File(copiaXML));
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	public void loadFile(Enum e) {
		JAXBContext archivo;
		if(e==Lista.Copias) {
			String copiaXML="Copia.xml";
			try {
				archivo = JAXBContext.newInstance(ProductoDAO.class);
			    Unmarshaller um = archivo.createUnmarshaller();
			     
			    CopiaDAO newProductoDAO = (CopiaDAO) um.unmarshal( new File(copiaXML) );
			    CopiaDAO=newProductoDAO.CopiaDAO;
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}
}
