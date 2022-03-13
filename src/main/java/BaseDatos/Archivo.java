package BaseDatos;

public class Archivo {
		
	
	/*public void saveFile(Enum ez) {
		JAXBContext archivo;
		if(e==Lista.Productos) {
			String productoXML="Producto.xml";
			try {
				archivo=JAXBContext.newInstance(ProductoDAO.class);
				Marshaller m=archivo.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				m.marshal(_instance, new File(productoXML));
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}*/	
	
	/*public void loadFile(Enum e) {
		JAXBContext archivo;
		if(e==Lista.Productos) {
			String productoXML="Producto.xml";
			try {
				archivo = JAXBContext.newInstance(ProductoDAO.class);
			    Unmarshaller um = archivo.createUnmarshaller();
			     
			    ProductoDAO newProductoDAO = (ProductoDAO) um.unmarshal( new File(productoXML) );
			    listaProductos=newProductoDAO.listaProductos;
			} catch (JAXBException ex) {
				ex.printStackTrace();
			}
		}
	}*/
}
