package interfaces;

import java.time.LocalDate;

import modelo.estado;

public interface IReserva {
	LocalDate getFechaCreacion();
	String getFechaPrevista();
	String getFechaReal();
	estado getEstado();
	String getKey();
	void setFechaCreacion(LocalDate fechaCreacion);
	void setFechaPrevista(String fechaPrevista);
	void setFechaReal(String fechaReal);
	void setEstado(estado estado);
	void setKey(String key);
	boolean equals(Object o);
	String toString();
}
