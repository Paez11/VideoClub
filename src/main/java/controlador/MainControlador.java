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
					lee.print("Introduzca el nombre del producto que quiera modificar");
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
					lee.print("Introduzca el nombre del cliente a eliminar");
					s=lee.String();
					ClienteDAO.removeCliente(s);
					break;
				case 3:
					lee.print("Introduzca el nombre del cliente que quiera modificar");
					s=lee.String();
					ClienteDAO.editCliente(s);
					break;
				case 4:
					lee.print("Introduzca el nombre del cliente que quiera modificar");
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
					lee.print("Introduzca el nombre del producto a eliminar");
					s=lee.String();
					ReservaDAO.removeReserva(s);
					break;
				case 3:
					lee.print("Introduzca el nombre del producto que quiera modificar");
					s=lee.String();
					ReservaDAO.editProducto(s);
					break;
				case 4:
					lee.print("Introduzca el nombre del producto que quiera modificar");
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
		lee.print("Introduzca una descripcion del producto");
		String des=lee.String();
		lee.print("Introduzca el precio del producto");
		float precio=lee.Float();
		
		Producto producto=null;
		producto=new Producto(id,des,precio);
		
		return ProductoDAO.addProduct(producto);
	}
	
	private boolean newReserva() {
		
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
}
