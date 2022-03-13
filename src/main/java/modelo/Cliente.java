package modelo;
import java.io.Serializable;


@XmlRootElement(name="Cliente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente implements ICliente, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlAttribute(name="Nombre")
	private String nombre;
	@XmlAttribute(name="DNI")

	@XmlAttribute(name="Edad")
	private int edad;
	@XmlAttribute(name="VIP")
	private boolean vip;
	
	public Cliente() {
		
	}

	private static Cliente miCliente;
	
	
	public Cliente(String nombre, String dni, int edad, boolean vip) {
		super();
		this.nombre = nombre;
		System.out.println("Nombre del cliente: "+this.nombre);
		this.dni = dni;
		System.out.println("DNI del cliente: "+this.dni);
		this.edad = edad;
		System.out.println("Edad del cliente: "+this.edad);
		this.vip = vip;
		System.out.println("El cliente es: "+this.vip);
	}
	
	public static Cliente getSingletonInstance(String nombre,String dni,int edad,boolean vip) {
		if(miCliente == null) {
			miCliente=new Cliente(nombre, dni, edad, vip);
		}else {
			System.out.println("No se puede crear el cliente"+nombre+"porque hay existe un cliente");
		}
		return miCliente;
		
	} 

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public String toString() {
		return "Nombre de cliente=" + nombre +
				"\nDNI:" + dni +
				"\ncon edad=" + edad + 
				"\nvip=" + vip;
	}

	public boolean equals(Object dni) {
		boolean result=false;
		
		if(dni!=null) {
			if(this==dni) {
				result=true;
			}else {
				if (getClass()==dni.getClass()) {
					Cliente tmp=(Cliente) dni;
					if(this.getDni().equals(tmp.getDni())) {
						result=true;
					}
				}
			}
		}
		return result;	
	}
	
}
