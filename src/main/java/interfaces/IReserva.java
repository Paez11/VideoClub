package interfaces;

public interface IReserva {
	String getFechaCreacion();
	String getFechaPrevista();
	String getFechaReal();
	boolean getEstado();
	String getKey();
	void setFechaCreacion(String fechaCreacion);
	void setFechaPrevista(String fechaPrevista);
	void setFechaReal(String fechaReal);
	void setEstado(boolean estado);
	void setKey(String key);
	boolean equals(String key);
	String toString();
}
