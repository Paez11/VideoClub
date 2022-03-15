package controlador;
import java.time.LocalDate;

import DAO.*;
import modelo.*;
import utils.lee;
import vistas.menu;

public class Addmenu {
	
	
	public static boolean newProducto(ProductoDAO productos) {
			
			lee.Print("Introduzca el nombre del producto");
			String id=lee.String();
			lee.Print("Introduzca una descripcion del producto");
			String des=lee.String();
			lee.Print("Introduzca el precio del producto");
			double precio=lee.Double();
			
			Producto producto=null;
			producto=new Producto(id,des,precio);
			
			if(producto!=null) {
				lee.Print("Producto añadido correctamente");
			}
			
			return productos.addProducto(producto);
		}
	
	public static boolean newCliente(ClienteDAO clientes) {
		
		lee.Print("Introduzca el nombre del cliente");
		String id=lee.String();
		lee.Print("Introduzca el dni del cliente");
		String dni=lee.String();
		lee.Print("Introduzca la edad del cliente");
		int edad=lee.Entero();
		lee.Print("¿va a ser cliente vip?\n 1 para vip\n 2 para cliente normal");
		int eleccion=lee.Entero();
		boolean vip=false;
		//do {
			if(eleccion==1) {
				vip=true;
			}else if(eleccion==2) {
				vip=false;
			}else {
				lee.Print("eleccion no valida");
			}
		//}while(eleccion!=1 || eleccion!=2); 
		Cliente cliente=null;
		cliente=new Cliente(id,dni,edad,vip);
		
		if(cliente!=null) {
			lee.Print("Cliente añadido correctamente");
		}
		
		return clientes.addCliente(cliente);
	}
	
	public static boolean newReserva(ReservaDAO reservas) {
		
		lee.Print("Introduzca la fecha de hoy de la reserva");
		LocalDate fechaCreacion = null;
		lee.Print("Introduzca la fecha prevista para devolver la pelicula");
		String fechaPrevista=lee.String();
		String fechaReal=fechaPrevista;
		lee.Print("Introduzca el estado del producto");
		estado e = null;
		int opcion=-1;
		//do {
			
			menu.estados();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					e=estado.BIEN;
					break;
				case 2:
					e=estado.ROTO;
					break;
				case 3:
					e=estado.SIN_CARCASA;
					break;
				case 4:
					e=estado.SUCIO;
					break;
				case 5:
					e=estado.RAYADO;
					break;
					default:
						lee.Print("error");
						break;
			}
		//}while(e!=null);
		lee.Print("Introduzca la clave de la reserva");
		String clave=lee.String();
		Reserva reserva=null;
		reserva=new Reserva(fechaCreacion,fechaPrevista,fechaReal,e,clave);
		
		if(reserva!=null) {
			lee.Print("Reserva añadido correctamente");
		}
		
		return reservas.addReserva(reserva);
	}
	
	/*
	 * 	lee.print("Introduzca la fecha real de entrega");
		String fechaReal=lee.Float();
	 */
}
