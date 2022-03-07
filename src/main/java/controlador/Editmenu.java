package controlador;

public class Editmenu {
	private void switchEditProducto() {
		int opcion=-1;
		
		do {
			showMenuEditProducto();
			switch(opcion) {
				case 1:
					
					break;
				case 2:

					break;
				case 3:

					break;

					default:
						lee.print("error");
						break;
			}
		}while(opcion!=4);
	}
	
	private void switchEditCliente() {
		int opcion=-1;
		
		do {
			showMenuEditCliente();
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
						lee.print("error");
						break;
			}
		}while(opcion!=5);
	}
	
	private void switchEditReservas() {
		int opcion=-1;
		
		do {
			showMenuEditReservas();
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
						lee.print("error");
						break;
			}
		}while(opcion!=6);
	}
}
