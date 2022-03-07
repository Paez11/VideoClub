package controlador;
import modelo.*;
import modeloDAO.*;

public class Addmenu {
	
	public static boolean newProducto() {
			
			lee.print("Introduzca el nombre del producto");
			String id=lee.String();
			lee.print("Introduzca una descripcion del producto");
			String des=lee.String();
			lee.print("Introduzca el precio del producto");
			float precio=lee.Float();
			
			Producto producto=null;
			producto=new Producto(id,des,precio);
			
			return ProductoDAO.addProduct(producto);
		}
	
	public static boolean newCliente() {
		
		lee.print("Introduzca el nombre del cliente");
		String id=lee.String();
		lee.print("Introduzca el dni del cliente");
		String dni=lee.String();
		lee.print("Introduzca la edad del cliente");
		int edad=lee.Entero();
		lee.print("¿va a ser cliente vip?\n 1 para vip\n 2 para cliente normal");
		int eleccion=lee.Entero();
		boolean vip=false;
		while(eleccion==1 || eleccion==2) {
			if(eleccion==1) {
				vip=true;
			}else if(eleccion==2) {
				vip=false;
			}else {
				lee.print("eleccion no valida");
			}
		}
		Cliente cliente=null;
		Cliente=new Cliente(id,dni,edad,vip);
		
		return ClienteDAO.addCliente(cliente);
	}
	
	public static boolean newReserva() {
		
		lee.print("Introduzca la fecha de hoy de la reserva");
		String fechaCreacion=lee.String();
		lee.print("Introduzca la fecha prevista para devolver la pelicula");
		String fechaPrevista=lee.String();
		String fechaReal=fechaPrevista;
		lee.print("Introduzca el estado del producto");
		Estado;
		lee.print("Introduzca la clave de la reserva");
		String clave=lee.String();
		Reserva reserva=null;
		reserva=new reserva(fechaCreacion,fechaPrevista,fechaReal,estado,clave);
		
		return ReservaDAO.addReseva(reserva);
	}
	
	/*
	 * 	lee.print("Introduzca la fecha real de entrega");
		String fechaReal=lee.Float();
	 */
}
