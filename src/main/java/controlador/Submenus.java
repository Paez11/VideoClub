package controlador;

import DAO.*;
import modelo.*;
import utils.lee;
import vistas.menu;

public class Submenus {
	

	/**
	 * Metodo que contiene un switch en el que permitira en cada caso hacer una de las funciones que requiere el menu
	 * de productos
	 * @param productos arraylist de productos
	 * @param copias hashmap de copias
	 */
 public static void menuProductos(ProductoDAO productos, CopiaDAO copias) {
		
		int opcion=-1;
		String s="";
		
		do {
			menu.showMenuProductos();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					Addmenu.newProducto(productos, copias);
					break;
				case 2:
					lee.Print("Introduzca el nombre del producto a eliminar");
					s=lee.String();
					if(productos.searchProducto(s)!=null) {
						productos.deleteProducto(s);
						lee.Print("producto "+s+" eliminado");
					}else {
						lee.Print("No existe el producto: "+s);
					}
					break;
				case 3:
					lee.Print("Introduzca el nombre del producto que quiera modificar");
					s=lee.String();
					if(productos.searchProducto(s)!=null) {
						Editmenu.Producto(s, productos);
					}else {
						lee.Print("No existe el producto: "+s);
					}
					break;
				case 4:
					lee.Print("Introduzca el nombre del producto que quiera buscar");
					s=lee.String();
					if(productos.searchProducto(s)!=null) {
						Producto p = new Producto();
						p=productos.searchProducto(s);
						lee.Print(p);
					}else {
						lee.Print("No existe el producto: "+s);
					}
					break;
				case 5:
					lee.show(productos);
					break;
				case 6:
					lee.show(copias);
					break;
				case 0:
					break;
				default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
 	/**
 	 * Metodo que contiene un switch en el que permitira en cada caso hacer una de las funciones que requiere el menu
 	 * de clientes
 	 * @param clientes hashMap de clientes
 	 */
	public static void menuClientes(ClienteDAO clientes) {
		
		int opcion=-1;
		String s="";
		
		do {
			
			menu.showMenuClientes();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					Addmenu.newCliente(clientes);
					break;
				case 2:
					lee.Print("Introduzca el dni del cliente a eliminar");
					s=lee.String();
					if(clientes.searchCliente(s)!=null) {
						try {
							clientes.deleteCliente(s);
							}catch(Exception e) {
								lee.Print("No se ha podido elimar al cliente o no existe");
							}
						lee.Print("Cliente "+s+" eliminado");
					}else {
						lee.Print("No se ha podido eliminar al cliente "+s+" o no existe");
					}

					break;
				case 3:
					lee.Print("Introduzca el dni del cliente que quiera modificar");
					s=lee.String();
					if(clientes.searchCliente(s)!=null) {
						Editmenu.Cliente(s, clientes);
					}else {
						lee.Print("No se ha encontrado al cliente "+s);
					}
					
					break;
				case 4:
					lee.Print("Introduzca el dni del cliente que quiera buscar");
					s=lee.String();
					if(clientes.searchCliente(s)!=null) {
						Cliente c = new Cliente();
						c=clientes.searchCliente(s);
						lee.Print(c);
					}else {
						lee.Print("No se ha encontrado al cliente "+s);
					}
					break;
				case 5:
					lee.show(clientes);
					break;
				case 0:
					break;
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
	/**
	 * Metodo que contiene un switch en el que permitira en cada caso hacer una de las funciones que requiere el menu
	 * de reservas
	 * @param reservas hashMap de reservas
	 * @param copias hashMap de copias
	 * @param clientes hashMap de clientes
	 */
	public static void menuReservas(ReservaDAO reservas, CopiaDAO copias, ClienteDAO clientes) {
		
		int opcion=-1;
		String s="";
		
		do {
			
			menu.showMenuReservas();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					Addmenu.newReserva(reservas,copias,clientes);
					break;
				case 2:
					lee.Print("Introduzca el id de la reserva a eliminar");
					s=lee.String();
					if(reservas.searchReserva(s)!=null) {
						reservas.deleteReserva(s);
						lee.Print("Reserva "+s+" eliminada");
					}else {
						lee.Print("No se ha podido eliminar la reserva "+s+" o no existe");
					}
					break;
				case 3:
					lee.Print("Introduzca el id de la reserva que quiera modificar");
					s=lee.String();
					if(reservas.searchReserva(s)!=null) {
						Editmenu.Reservas(s, reservas);
					}else {
						lee.Print("No se ha podido encontrar la reserva "+s+" o no existe");
					}
					break;
				case 4:
					lee.Print("Introduzca el id de la reserva que quiera buscar");
					s=lee.String();
					if(reservas.searchReserva(s)!=null) {
						Reserva r = new Reserva();
						r=reservas.searchReserva(s);
						lee.Print(r);
					}else {
						lee.Print("No se ha podido encontrar la reserva "+s+" o no existe");
					}
					break;
				case 5:
					lee.show(reservas);
					break;
				case 0:
					break;
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
}
