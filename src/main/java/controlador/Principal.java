package controlador;

import interfaces.IControlador;
import utils.lee;
import vistas.menu;

public class Principal implements IControlador {

	
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
				Submenus.switchMenuProductos();
				break;
			case 2:
				Submenus.switchMenuClientes();
				break;
			case 3:
				Submenus.switchMenuReservas();
				break;
			default:
				lee.Print("Error");
				break;
				
		}
	}
}
