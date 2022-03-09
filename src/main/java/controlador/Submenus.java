package controlador;

import DAO.*;
import utils.lee;
import vistas.menu;

public class Submenus {
	
	static ProductoDAO productos = new ProductoDAO();
	static ClienteDAO clientes = new ClienteDAO();
	static CopiaDAO copias = new CopiaDAO();
	static ReservaDAO reservas = new ReservaDAO();
	
 public static void menuProductos() {
		
		int opcion=-1;
		String s="";
		
		do {
			menu.showMenuProductos();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					Addmenu.newProducto();
					break;
				case 2:
					lee.Print("Introduzca el nombre del producto a eliminar");
					s=lee.String();
					productos.deleteProducto(s);
					break;
				case 3:
					lee.Print("Introduzca el nombre del producto que quiera modificar");
					s=lee.String();
					Editmenu.Producto(s);
					break;
				case 4:
					lee.Print("Introduzca el nombre del producto que quiera buscar");
					s=lee.String();
					productos.searchProducto(s);
					break;
				case 5:
					productos.showProducto();
					break;
				case 0:
					break;
				default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
	public static void menuClientes() {
		
		int opcion=-1;
		String s="";
		
		do {
			
			menu.showMenuClientes();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					Addmenu.newCliente();
					break;
				case 2:
					lee.Print("Introduzca el dni del cliente a eliminar");
					s=lee.String();
					try {
					clientes.deleteCliente(s);
					}catch(Exception e) {
						lee.Print("No se ha podido elimar al cliente o no existe");
					}
					break;
				case 3:
					lee.Print("Introduzca el dni del cliente que quiera modificar");
					s=lee.String();
					Editmenu.Cliente(s);
					break;
				case 4:
					lee.Print("Introduzca el dni del cliente que quiera buscar");
					s=lee.String();
					clientes.searchCliente(s);
					break;
				case 5:
					clientes.showClientes();
					break;
				case 0:
					break;
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
	public static void menuReservas() {
		
		int opcion=-1;
		String s="";
		
		do {
			
			menu.showMenuReservas();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					Addmenu.newReserva();
					break;
				case 2:
					lee.Print("Introduzca el id de la reserva a eliminar");
					s=lee.String();
					reservas.deleteReserva(s);
					break;
				case 3:
					lee.Print("Introduzca el id de la reserva que quiera modificar");
					s=lee.String();
					Editmenu.Reservas(s);
					break;
				case 4:
					lee.Print("Introduzca el id de la reserva que quiera buscar");
					s=lee.String();
					reservas.searchReserva(s);
					break;
				case 5:
					reservas.showReserva();
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
