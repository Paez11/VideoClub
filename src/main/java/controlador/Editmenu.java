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
		menu.menuEditarProducto();
		do {
			switch(opcion) {
				case 1:
					
					break;
				case 2:

					break;
				case 3:

					break;

					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=4);
	}
	
	public static void Cliente(String s) {
		int opcion=-1;
		menu.menuEditarCliente();
		do {
			switch(opcion) {
				case 1:
					
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
					
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=5);
	}
	
	public static void Reservas(String s) {
		int opcion=-1;
		menu.menuEditarReserva();
		do {
			switch(opcion) {
				case 1:
					
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
					
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=6);
	}
}
