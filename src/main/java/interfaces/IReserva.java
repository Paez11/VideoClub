package interfaces;

import model.estado;

public interface IReserva {
	String getFechaCreacion();
	String getFechaPrevista();
	String getFechaReal();
	estado getEstado();
	String getKey();
	void setFechaCreacion(String fechaCreacion);
	void setFechaPrevista(String fechaPrevista);
	void setFechaReal(String fechaReal);
	void setEstado(estado estado);
	void setKey(String key);
	boolean equals(String key);
	String toString();
}
