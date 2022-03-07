package controlador;

import Utils.Read;
import interfaces.IControlador;
import view.Print;

public class Principal implements IControlador {

	
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
				Submenus.switchMenuProductos();
				break;
			case 2:
				Submenus.switchMenuClientes();
				break;
			case 3:
				Submenus.switchMenuReservas();
				break;
				default:
					lee.print("Error");
					break;
				
		}
	}
}
