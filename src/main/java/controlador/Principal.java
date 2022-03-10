package controlador;

import DAO.ClienteDAO;
import DAO.CopiaDAO;
import DAO.ProductoDAO;
import DAO.ReservaDAO;
import interfaces.IControlador;
import utils.lee;
import vistas.menu;

public class Principal implements IControlador {

	static ClienteDAO clientes = new ClienteDAO();
	static ProductoDAO productos = new ProductoDAO();
	static CopiaDAO copias = new CopiaDAO();
	static ReservaDAO reservas = new ReservaDAO();
	
	public void run() {
		int opcion=-1;
		do {
			menu.showMenuPrincipal();
			opcion=lee.Entero();
			switchMenuPrincipal(opcion);
		}while(opcion!=0);
		lee.Print("Adios");
	}
	
	private void switchMenuPrincipal(int opcion) {
		
		switch(opcion) {
			case 1:
				Submenus.menuProductos(productos);
				break;
			case 2:
				Submenus.menuClientes(clientes);
				break;
			case 3:
				Submenus.menuReservas(reservas);
				break;
			case 0:
				break;
			default:
				lee.Print("Error");
				break;
				
		}
	}
}
