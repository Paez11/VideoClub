package controlador;
import java.time.LocalDate;

import DAO.*;
import modelo.*;
import utils.lee;
import vistas.menu;

public class Addmenu {
	
	
	public static boolean newProducto(ProductoDAO productos, CopiaDAO copias) {
			
			boolean valid=true;
			String id="";
			do {	
				lee.Print("Introduzca el nombre del producto");
				id=lee.String();
				valid=true;
				if(productos.searchProducto(id)!=null) {
					lee.Print("Ya existe un producto con ese nombre");
					valid=false;
				}
			}while(!valid);
			lee.Print("Introduzca una descripcion del producto");
			String des=lee.String();
			lee.Print("Introduzca el precio del producto");
			double precio=lee.Double();
			lee.Print("Introduzca el numero de copias");
			int cops=lee.Entero();
			Producto p=null;
			p=new Producto(id,des,precio,cops);
			generarCopias(cops,p,copias);
			if(p!=null) {
				lee.Print("Producto añadido correctamente");
			}
			
			return productos.addProducto(p);
		}
	
	public static boolean newCliente(ClienteDAO clientes) {
		
		boolean valid=true;
		String dni="";
		
		lee.Print("Introduzca el nombre del cliente");
		String id=lee.String();
		do {
			lee.Print("Introduzca el dni del cliente");
			dni=lee.String();
			valid=true;
			if(clientes.searchCliente(dni)!=null) {
				lee.Print("Ya existe un cliente con este dni");
				valid=false;
			}
		}while(!valid);
		lee.Print("Introduzca la edad del cliente");
		int edad=lee.Entero();
		lee.Print("¿va a ser cliente vip?\n 1 para vip\n 2 para cliente normal");
		int eleccion=lee.Entero();
		boolean vip=false;
		//do {
			if(eleccion==1) {
				vip=true;
			}else if(eleccion==2) {
				vip=false;
			}else {
				lee.Print("eleccion no valida");
			}
		//}while(eleccion!=1 || eleccion!=2); 
		Cliente cliente=null;
		cliente=new Cliente(id,dni,edad,vip);
		
		if(cliente!=null) {
			lee.Print("Cliente añadido correctamente");
		}
		
		return clientes.addCliente(cliente);
	}
	
	public static boolean newReserva(ReservaDAO reservas,CopiaDAO copias, ClienteDAO clientes) {
		
		boolean valid=true;
		String id="";
		do {	
			lee.Print("Introduzca el id de la copia que quiere reservar");
			lee.Print("Escriba (salir) para salir");
			id=lee.String();
			valid=true;
			if(copias.searchCopia(id)==null) {
				lee.Print("No existe un producto con esa id");
				valid=false;
			}
			if(id.equals("salir")) {
				valid=true;
			}
		}while(!valid);
		
		if(id.equals("salir")) {
			return false;
		}
		
		String dni="";
		do {	
			lee.Print("Introduzca el dni del cliente que va ha reservar el producto");
			dni=lee.String();
			valid=true;
			if(clientes.searchCliente(dni)==null) {
				lee.Print("No existe un cliente con ese dni");
				valid=false;
			}
			if(dni.equals("salir")) {
				valid=true;
			}
		}while(!valid);
		
		if(dni.equals("salir")) {
			return false;
		}
		
		LocalDate fechaCreacion = LocalDate.now();
		lee.Print("Introduzca la fecha prevista para devolver la pelicula (año-mes-dia)");
		String fechaPrevista=lee.String();
		String fechaReal="Sin entrega";
		lee.Print("Introduzca el estado del producto");
		estado e = null;
		int opcion=-1;
		//do {
			
			menu.estados();
			opcion=lee.Entero();
			
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
		//}while(e!=null);
		String clave="";
		Reserva reserva=null;
		reserva=new Reserva(fechaCreacion,fechaPrevista,fechaReal,e,clave,id,dni);
		clave=reserva.generarID();
		reserva.setKey(clave);
		lee.Print("id de la reserva --> "+clave);
		
		if(reserva!=null) {
			lee.Print("Reserva añadido correctamente");
		}
		
		return reservas.addReserva(reserva);
	}
	
	public static Copia generarCopias(int cops, Producto p,CopiaDAO copias) {
		int cont=0;
		String id="";
		Copia c =new Copia();
		while(cont<cops){
			id=c.generarID();
			c.setKey(id);
			c = new Copia(p.getNombre(),p.getDescripcion(),p.getPrecio(), p.getnCopias(), c.getKey());
			copias.addCopia(c);
			cont++;
		}
		
		return c;
		
	}
}
