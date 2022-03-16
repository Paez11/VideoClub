package controlador;

import DAO.*;
import modelo.*;
import utils.lee;
import vistas.menu;

public class Submenus {
	
	
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
					productos.deleteProducto(s);
					break;
				case 3:
					lee.Print("Introduzca el nombre del producto que quiera modificar");
					s=lee.String();
					Editmenu.Producto(s, productos);
					break;
				case 4:
					lee.Print("Introduzca el nombre del producto que quiera buscar");
					s=lee.String();
					Producto p = new Producto();
					p=productos.searchProducto(s);
					lee.Print(p);
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
					try {
					clientes.deleteCliente(s);
					}catch(Exception e) {
						lee.Print("No se ha podido elimar al cliente o no existe");
					}
					break;
				case 3:
					lee.Print("Introduzca el dni del cliente que quiera modificar");
					s=lee.String();
					Editmenu.Cliente(s, clientes);
					break;
				case 4:
					lee.Print("Introduzca el dni del cliente que quiera buscar");
					Cliente c = new Cliente();
					s=lee.String();
					c=clientes.searchCliente(s);
					lee.Print(c);
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
					reservas.deleteReserva(s);
					break;
				case 3:
					lee.Print("Introduzca el id de la reserva que quiera modificar");
					s=lee.String();
					Editmenu.Reservas(s, reservas);
					break;
				case 4:
					lee.Print("Introduzca el id de la reserva que quiera buscar");
					s=lee.String();
					Reserva r = new Reserva();
					r=reservas.searchReserva(s);
					lee.Print(r);
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
