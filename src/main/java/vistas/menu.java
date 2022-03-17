package vistas;

public class menu{

	/**
	 * Método que muestra por pantalla el menu principal
	 */
	public static void showMenuPrincipal() {
		System.out.println(" __     __  _       _                   ____   _           _     \r\n"
				+ " \\ \\   / / (_)   __| |   ___    ___    / ___| | |  _   _  | |__  \r\n"
				+ "  \\ \\ / /  | |  / _` |  / _ \\  / _ \\  | |     | | | | | | | '_ \\ \r\n"
				+ "   \\ V /   | | | (_| | |  __/ | (_) | | |___  | | | |_| | | |_) |\r\n"
				+ "    \\_/    |_|  \\__,_|  \\___|  \\___/   \\____| |_|  \\__,_| |_.__/ \r\n"
				+ "                                                                 \n");
		System.out.println("1. Catálogo de productos");
		System.out.println("2. Catálogo de clientes");
		System.out.println("3. Gestión de reservas");
		System.out.println("0. Salir");
		
	}

	/**
	 * Método que muestra por pantalla el menu Productos
	 */
	public static void showMenuProductos() {

		System.out.println("  ___                  _               _              \r\n"
				+ " | _ \\  _ _   ___   __| |  _  _   __  | |_   ___   ___\r\n"
				+ " |  _/ | '_| / _ \\ / _` | | || | / _| |  _| / _ \\ (_-<\r\n"
				+ " |_|   |_|   \\___/ \\__,_|  \\_,_| \\__|  \\__| \\___/ /__/\r\n"
				+ "                                                      ");
		System.out.println("1. Añadir producto");
		System.out.println("2. Eliminar producto");
		System.out.println("3. Editar producto");
		System.out.println("4. Ver producto");
		System.out.println("5. Ver todos los productos");
		System.out.println("6. Ver las copias de los productos");
		System.out.println("0. Volver");
	}

	/**
	 * Método que muestra por pantalla el menu Clientes
	 */
	public static void showMenuClientes() {

		System.out.println("   ___   _   _                _              \r\n"
				+ "  / __| | | (_)  ___   _ _   | |_   ___   ___\r\n"
				+ " | (__  | | | | / -_) | ' \\  |  _| / -_) (_-<\r\n"
				+ "  \\___| |_| |_| \\___| |_||_|  \\__| \\___| /__/\r\n"
				+ "                                             ");
		System.out.println("1. Añadir cliente");
		System.out.println("2. Eliminar cliente");
		System.out.println("3. Editar cliente");
		System.out.println("4. Ver cliente");
		System.out.println("5. Ver todos los clientes");
		System.out.println("0. Volver");
	}

	/**
	 * Método que muestra por pantalla el menu Reservas
	 */
	public static void showMenuReservas() {

		System.out.println("  ___                                          \r\n"
				+ " | _ \\  ___   ___  ___   _ _  __ __  __ _   ___\r\n"
				+ " |   / / -_) (_-< / -_) | '_| \\ V / / _` | (_-<\r\n"
				+ " |_|_\\ \\___| /__/ \\___| |_|    \\_/  \\__,_| /__/");
		System.out.println("1. Hacer reserva");
		System.out.println("2. Eliminar reserva");
		System.out.println("3. Editar reserva");
		System.out.println("4. Ver reserva");
		System.out.println("5. Ver todas las reservas");
		System.out.println("0. Volver");
	}
	
	/**
	 * Método que muestra por pantalla el menu para editar Productos
	 */
	public static void menuEditarProducto() {
		 System.out.println("           _   _   _                                          _               _         \r\n"
		 		+ "  ___   __| | (_) | |_   __ _   _ _     _ __   _ _   ___   __| |  _  _   __  | |_   ___ \r\n"
		 		+ " / -_) / _` | | | |  _| / _` | | '_|   | '_ \\ | '_| / _ \\ / _` | | || | / _| |  _| / _ \\\r\n"
		 		+ " \\___| \\__,_| |_|  \\__| \\__,_| |_|     | .__/ |_|   \\___/ \\__,_|  \\_,_| \\__|  \\__| \\___/\r\n"
		 		+ "                                       |_|                                              ");
		 System.out.println("1. Nombre");
		 System.out.println("2. Descripcion");
		 System.out.println("3. Precio");
		 System.out.println("0. Volver");
	}
	
	/**
	 * Método que muestra por pantalla el menu para editar Clientes
	 */
	public static void menuEditarCliente() {
		System.out.println("           _   _   _                         _   _                _         \r\n"
				+ "  ___   __| | (_) | |_   __ _   _ _     __  | | (_)  ___   _ _   | |_   ___ \r\n"
				+ " / -_) / _` | | | |  _| / _` | | '_|   / _| | | | | / -_) | ' \\  |  _| / -_)\r\n"
				+ " \\___| \\__,_| |_|  \\__| \\__,_| |_|     \\__| |_| |_| \\___| |_||_|  \\__| \\___|\r\n"
				+ "                                                                            ");
		System.out.println("1. Nombre");
		System.out.println("2. DNI");
		System.out.println("3. Edad");
		System.out.println("0. Volver");
	}
	
	/**
	 * Método que muestra por pantalla el menu para editar Reservas
	 */
	public static void menuEditarReserva() {
		System.out.println("           _   _   _                                                            \r\n"
				+ "  ___   __| | (_) | |_   __ _   _ _     _ _   ___   ___  ___   _ _  __ __  __ _ \r\n"
				+ " / -_) / _` | | | |  _| / _` | | '_|   | '_| / -_) (_-< / -_) | '_| \\ V / / _` |\r\n"
				+ " \\___| \\__,_| |_|  \\__| \\__,_| |_|     |_|   \\___| /__/ \\___| |_|    \\_/  \\__,_|\r\n"
				+ "                                                                                ");
		System.out.println("1. Fecha Prevista");
		System.out.println("2. Fecha real");
		System.out.println("3. Estado");
		System.out.println("0. Volver");
	}
	
	/**
	 * Método que muestra las opciones del estado de una reserva
	 */
	public static void estados() {
		System.out.println("1. bien");
		System.out.println("2. roto");
		System.out.println("3. sin carcasa");
		System.out.println("4. sucio");
		System.out.println("5. rallado");
	}	
}
