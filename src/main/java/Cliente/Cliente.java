import java.util.Objects;

public class Cliente implements ICliente {
	private String nombre;
	private String dni;
	private int edad;
	private boolean vip;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String dni, int edad, boolean vip) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.vip = vip;
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
