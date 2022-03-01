package interfaces;

public interface IAlmacen {
	
	//añade un cliente a la coleccion, recibe el cliente a insertar
	boolean addCliente(ICliente c);
	//elimina un cliente de la coleccion segun el dni que le introduzcan
	ICliente deleteCliente(String dni);
	//edita un cliente segun el dni del cliente
	boolean editCliente(String dni);
	//muestra a todos los clientes de la coleccion
	void showClientes();
	//busca a un cliente de la coleccion segun su dni
	ICliente searchCliente(String dni);
	
	//añade una reserva a la coleccion, recibe la reserva a insertar
	boolean addReserva(IReserva r);
	//elimina una reserva por su clave
	ICliente deleteReserva(String key);
	//Edita una reserva por su clave
	boolean editReserva(String key);
	//muestra todas las reservas en circulacion
	void showReserva();
	//busca una reserva por su clave
	ICliente searchReserva(String key);
	
	boolean addProducto(IProducto p);
	ICliente deleteProducto(String nombre);
	boolean editProducto(String nombre);
	void showProductos();
	ICliente searchProductos(String nombre);
	
	//añade una o varias copia aleatoria de un producto
	boolean addCopia(IProducto p);
	//elimina una copia segun la clave que introduzcan
	ICliente deleteCopia(String key);
	//muestra todas las copias que hay del producto que se introduzca
	void showCopias(IProducto p);
	//busca una copia por su clave
	ICliente searchCopia(String key);
}
