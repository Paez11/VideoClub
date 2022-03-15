package interfaces;

import java.time.LocalDate;

import modelo.estado;

public interface IReserva {
	LocalDate getFechaCreacion();
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
