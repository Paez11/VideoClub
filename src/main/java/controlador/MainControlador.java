package controlador;

import Utils.Read;
import interfaces.*;
import model.Product;
import view.Print;

public class MainControlador implements IControlador {

	
	public void run() {
		int opcion=-1;
		do {
			showMenuPrincipal();
			opcion=leeEntero();
			switchMenuPrincipal(opcion);
		}while(opcion!=4);
		lee.Print("Adios");
	}
	
	private void switchMenuPrincipal(int opcion) {
		
		switch(opcion) {
			case 1:
				switchMenuProductos();
				break;
			case 2:
				switchMenuClientes();
				break;
			case 3:
				switchMenuReservas();
				break;
				default:
					lee.print("Error");
					break;
				
		}
	}
	
	private void switchMenuProductos() {
		
		int opcion=-1;
		String s="";
		
		do {
			showMenuProductos();
			switch(opcion) {
				case 1:
					newProducto();
					break;
				case 2:
					lee.print("Introduzca el nombre del producto a eliminar");
					s=lee.String();
					ProductoDAO.removeProducto(s);
					break;
				case 3:
					lee.print("Introduzca el nombre del producto que quiera modificar");
					s=lee.String();
					ProductoDAO.editProducto(s);
					break;
				case 4:
					lee.print("Introduzca el nombre del producto que quiera buscar");
					s=lee.String();
					ProductoDAO.searchProducto(s);
					break;
				case 5:
					ProductoDAO.showProducto();
					break;
					default:
						lee.print("error");
						break;
			}
		}while(opcion!=6);
	}
	
	private void switchMenuClientes() {
		
		int opcion=-1;
		String s="";
		
		do {
			showMenuClientes();
			switch(opcion) {
				case 1:
					newCliente();
					break;
				case 2:
					lee.print("Introduzca el dni del cliente a eliminar");
					s=lee.String();
					ClienteDAO.removeCliente(s);
					break;
				case 3:
					lee.print("Introduzca el dni del cliente que quiera modificar");
					s=lee.String();
					ClienteDAO.editCliente(s);
					break;
				case 4:
					lee.print("Introduzca el dni del cliente que quiera buscar");
					s=lee.String();
					ClienteDAO.searchCliente(s);
					break;
				case 5:
					ClienteDAO.showCliente();
					break;
					default:
						lee.print("error");
						break;
			}
		}while(opcion!=6);
	}
	
	private void switchMenuReservas() {
		
		int opcion=-1;
		String s="";
		
		do {
			showMenuReservas();
			switch(opcion) {
				case 1:
					newReserva();
					break;
				case 2:
					lee.print("Introduzca el id de la reserva a eliminar");
					s=lee.String();
					ReservaDAO.removeReserva(s);
					break;
				case 3:
					lee.print("Introduzca el id de la reserva que quiera modificar");
					s=lee.String();
					ReservaDAO.editProducto(s);
					break;
				case 4:
					lee.print("Introduzca el id de la reserva que quiera buscar");
					s=lee.String();
					ReservaDAO.searchReserva(s);
					break;
				case 5:
					ReservaDAO.showReserva();
					break;
					default:
						lee.print("error");
						break;
			}
		}while(opcion!=6);
	}
	
	private boolean newProduct() {
		
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
	
	private boolean newCliente() {
		
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
	
	private boolean newReserva() {
		
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
