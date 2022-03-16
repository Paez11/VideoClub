package controlador;

import DAO.ClienteDAO;
import DAO.CopiaDAO;
import DAO.ProductoDAO;
import DAO.ReservaDAO;
import interfaces.IControlador;
import utils.lee;
import vistas.menu;

public class Principal implements IControlador {

	static ClienteDAO clientes = ClienteDAO.getInstance();
	static ProductoDAO productos = ProductoDAO.getInstance();
	static CopiaDAO copias = CopiaDAO.getInstance();
	static ReservaDAO reservas = ReservaDAO.getInstance();
	
	/**
	 * Metodo que sera llamado en el main de la clase ejecutable y que sera el inicio del programa, es decir, llamara al
	 * switch del menu principal hasta que el usuario decida salir
	 */
	public void run() {
		int opcion=-1;
		do {
			menu.showMenuPrincipal();
			opcion=lee.Entero();
			switchMenuPrincipal(opcion);
		}while(opcion!=0);
		lee.Print("Adios");
	}
	
	/**
	 * Metodo que contendra el switch principal que redirigira en cada case a  uno de los menus para hacer las operaciones 
	 * en cada coleccion
	 * @param opcion variable primitiva entera que recibira para seleccionar un posible case del switch
	 */
	private void switchMenuPrincipal(int opcion) {
		
		switch(opcion) {
			case 1:
				Submenus.menuProductos(productos, copias);
				break;
			case 2:
				Submenus.menuClientes(clientes);
				break;
			case 3:
				Submenus.menuReservas(reservas,copias,clientes);
				break;
			case 0:
				break;
			default:
				lee.Print("Error");
				break;
				
		}
	}
}
