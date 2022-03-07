package controlador;

public class Submenus {
	
 public static void switchMenuProductos() {
		
		int opcion=-1;
		String s="";
		
		do {
			showMenuProductos();
			switch(opcion) {
				case 1:
					Addmenu.newProducto();
					break;
				case 2:
					lee.print("Introduzca el nombre del producto a eliminar");
					s=lee.String();
					ProductoDAO.removeProducto(s);
					break;
				case 3:
					lee.print("Introduzca el nombre del producto que quiera modificar");
					s=lee.String();
					switchMenuProductos();
					ProductoDAO.editProducto(s);
					break;
				case 4:
					lee.print("Introduzca el nombre del producto que quiera buscar");
					s=lee.String();
					ProductoDAO.searchProducto(s);
					break;
				case 5:
					ProductoDAO.showProducto();
					break;
					default:
						lee.print("error");
						break;
			}
		}while(opcion!=6);
	}
	
	public static void switchMenuClientes() {
		
		int opcion=-1;
		String s="";
		
		do {
			showMenuClientes();
			switch(opcion) {
				case 1:
					Addmenu.newCliente();
					break;
				case 2:
					lee.print("Introduzca el dni del cliente a eliminar");
					s=lee.String();
					ClienteDAO.removeCliente(s);
					break;
				case 3:
					lee.print("Introduzca el dni del cliente que quiera modificar");
					s=lee.String();
					switchEditCliente();
					ClienteDAO.editCliente(s);
					break;
				case 4:
					lee.print("Introduzca el dni del cliente que quiera buscar");
					s=lee.String();
					ClienteDAO.searchCliente(s);
					break;
				case 5:
					ClienteDAO.showCliente();
					break;
					default:
						lee.print("error");
						break;
			}
		}while(opcion!=6);
	}
	
	public static void switchMenuReservas() {
		
		int opcion=-1;
		String s="";
		
		do {
			showMenuReservas();
			switch(opcion) {
				case 1:
					Addmenu.newReserva();
					break;
				case 2:
					lee.print("Introduzca el id de la reserva a eliminar");
					s=lee.String();
					ReservaDAO.removeReserva(s);
					break;
				case 3:
					lee.print("Introduzca el id de la reserva que quiera modificar");
					s=lee.String();
					switchEditReservas();
					ReservaDAO.editProducto(s);
					break;
				case 4:
					lee.print("Introduzca el id de la reserva que quiera buscar");
					s=lee.String();
					ReservaDAO.searchReserva(s);
					break;
				case 5:
					ReservaDAO.showReserva();
					break;
					default:
						lee.print("error");
						break;
			}
		}while(opcion!=6);
	}
}
