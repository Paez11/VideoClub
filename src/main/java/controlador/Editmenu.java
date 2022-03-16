package controlador;

import DAO.ClienteDAO;
import DAO.ProductoDAO;
import DAO.ReservaDAO;
import modelo.estado;
import utils.lee;
import vistas.menu;

public class Editmenu {
	
	/**
	 * Metodo que contiene un switch con los casos necesarios para editar cada atributo de uno de los elementos de la
	 * coleccion productos
	 * @param s recibira una cadena que se correspondera con el nombre del producto que se quiera editar
	 * @param productos arrayList de productos
	 */
	public static void Producto(String s, ProductoDAO productos) {
		int opcion=-1;
		
		do {
			
			menu.menuEditarProducto();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					lee.Print("Introduzca el nuevo nombre");
					String nombre=lee.String();
					productos.editNombre(nombre);
					break;
				case 2:
					lee.Print("Introduzca una nueva descripcion");
					String descripcion=lee.String();
					productos.editDescripcion(descripcion);
					break;
				case 3:
					lee.Print("Introduzca un nuevo precio");
					double precio=lee.Double();
					productos.editPrecio(precio);
					break;
				case 0:
					break;
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
	/**
	 * Metodo que contiene un switch con los casos necesarios para editar cada atributo de uno de los elementos de la
	 * coleccion clientes
	 * @param s recibira una cadena que se correspondera con el dni del cliente  que se quiera editar
	 * @param clientes hashMap de clientes
	 */
	public static void Cliente(String s, ClienteDAO clientes) {
		int opcion=-1;
		
		do {
			
			menu.menuEditarCliente();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					lee.Print("Introduzca el nuevo nombre");
					String nombre=lee.String();
					clientes.editClienteNombre(s, nombre);
					break;
				case 2:
					lee.Print("Introduzca el nuevo dni");
					String dni=lee.String();
					clientes.editClienteDni(s, dni);
					break;
				case 3:
					lee.Print("Introduzca la nueva edad");
					int edad=lee.Entero();
					clientes.editClienteEdad(s, edad);
					break;
				case 0:
					break;
					default:
						lee.Print("error");
						break;
			}
		}while(opcion!=0);
	}
	
	/**
	 * Metodo que contiene un switch con los casos necesarios para editar cada atributo de uno de los elementos de la
	 * coleccion reservas
	 * @param s recibira una cadena que se correspondera al id de la reserva que se quiera editar
	 * @param reservas hashMap de reservas
	 */
	public static void Reservas(String s, ReservaDAO reservas) {
		int opcion=-1;
		
		do {
			
			menu.menuEditarReserva();
			opcion=lee.Entero();
			
			switch(opcion) {
				case 1:
					lee.Print("Introduzca la fecha prevista");
					String fechaPrevista=lee.String();
					reservas.editFechaEntrega(s, fechaPrevista);
					break;
				case 2:
					lee.Print("Introduzca la fecha de entrega");
					String fechaEntrega=lee.String();
					reservas.editFechaEntrega(s, fechaEntrega);
					break;
				case 3:
					menu.estados();
					opcion=lee.Entero();
					estado e=null;
					switch(opcion) {
						case 1:
							e=estado.BIEN;
							break;
						case 2:
							e=estado.ROTO;
							break;
						case 3:
							e=estado.SIN_CARCASA;
							break;
						case 4:
							e=estado.SUCIO;
							break;
						case 5:
							e=estado.RAYADO;
							break;
							default:
								lee.Print("error");
								break;
					}
					reservas.editEstado(s, e);
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
