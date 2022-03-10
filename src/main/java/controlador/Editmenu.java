package controlador;

import DAO.ClienteDAO;
import DAO.CopiaDAO;
import DAO.ProductoDAO;
import DAO.ReservaDAO;
import utils.lee;
import vistas.menu;

public class Editmenu {
	
	static ProductoDAO productos = new ProductoDAO();
	static ClienteDAO clientes = new ClienteDAO();
	static CopiaDAO copias = new CopiaDAO();
	static ReservaDAO reservas = new ReservaDAO();
	
	public static void Producto(String s) {
		int opcion=-1;
		
		do {
			
			menu.menuEditarProducto();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					productos.editProducto(s, s, opcion);
					break;
				case 2:

					break;
				case 3:

					break;
				case 0:
					break;
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
	public static void Cliente(String s) {
		int opcion=-1;
		
		do {
			
			menu.menuEditarCliente();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					clientes.editCliente(s, null, null);
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 0:
					break;
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
	public static void Reservas(String s) {
		int opcion=-1;
		
		do {
			
			menu.menuEditarReserva();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					reservas.editReserva(s);
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

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
