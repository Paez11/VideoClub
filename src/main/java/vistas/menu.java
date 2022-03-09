package vistas;

public class menu{

	public static void showMenuPrincipal() {
		System.out.println(" __     __  _       _                   ____   _           _     \r\n"
				+ " \\ \\   / / (_)   __| |   ___    ___    / ___| | |  _   _  | |__  \r\n"
				+ "  \\ \\ / /  | |  / _` |  / _ \\  / _ \\  | |     | | | | | | | '_ \\ \r\n"
				+ "   \\ V /   | | | (_| | |  __/ | (_) | | |___  | | | |_| | | |_) |\r\n"
				+ "    \\_/    |_|  \\__,_|  \\___|  \\___/   \\____| |_|  \\__,_| |_.__/ \r\n"
				+ "                                                                 /n");
		System.out.println("1. Cat�logo de productos");
		System.out.println("2. Cat�logo de clientes");
		System.out.println("3. Gesti�n de reservas");
		System.out.println("0. Salir");
		
	}

	public static void showMenuProductos() {

		System.out.println("  ___                  _               _              \r\n"
				+ " | _ \\  _ _   ___   __| |  _  _   __  | |_   ___   ___\r\n"
				+ " |  _/ | '_| / _ \\ / _` | | || | / _| |  _| / _ \\ (_-<\r\n"
				+ " |_|   |_|   \\___/ \\__,_|  \\_,_| \\__|  \\__| \\___/ /__/\r\n"
				+ "                                                      ");
		System.out.println("1. A�adir producto");
		System.out.println("2. Ver producto");
		System.out.println("3. Editar producto");
		System.out.println("4. Eliminar producto");
		System.out.println("0. Volver");
	}

	public static void showMenuClientes() {

		System.out.println("   ___   _   _                _              \r\n"
				+ "  / __| | | (_)  ___   _ _   | |_   ___   ___\r\n"
				+ " | (__  | | | | / -_) | ' \\  |  _| / -_) (_-<\r\n"
				+ "  \\___| |_| |_| \\___| |_||_|  \\__| \\___| /__/\r\n"
				+ "                                             ");
		System.out.println("1. A�adir cliente");
		System.out.println("2. Ver cliente");
		System.out.println("3. Editar cliente");
		System.out.println("4. Eliminar cliente");
		System.out.println("0. Volver");
	}

	public static void showMenuReservas() {

		System.out.println("  ___                                          \r\n"
				+ " | _ \\  ___   ___  ___   _ _  __ __  __ _   ___\r\n"
				+ " |   / / -_) (_-< / -_) | '_| \\ V / / _` | (_-<\r\n"
				+ " |_|_\\ \\___| /__/ \\___| |_|    \\_/  \\__,_| /__/");
		System.out.println("1. Hacer reserva");
		System.out.println("2. Ver reserva");
		System.out.println("3. Editar reserva");
		System.out.println("4. Eliminar reserva");
		System.out.println("0. Volver");
	}
	
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
	
	public static void menuEditarReserva() {
		System.out.println("           _   _   _                                                            \r\n"
				+ "  ___   __| | (_) | |_   __ _   _ _     _ _   ___   ___  ___   _ _  __ __  __ _ \r\n"
				+ " / -_) / _` | | | |  _| / _` | | '_|   | '_| / -_) (_-< / -_) | '_| \\ V / / _` |\r\n"
				+ " \\___| \\__,_| |_|  \\__| \\__,_| |_|     |_|   \\___| /__/ \\___| |_|    \\_/  \\__,_|\r\n"
				+ "                                                                                ");
		System.out.println("1. Fecha de creaci�n");
		System.out.println("2. Fecha Prevista");
		System.out.println("3. Fecha real");
		System.out.println("4. Estado");
		System.out.println("0. Volver");
	}
	
	public static void estados() {
		System.out.println("1. bien");
		System.out.println("2. roto");
		System.out.println("3. sin carcasa");
		System.out.println("4. sucio");
		System.out.println("5. rallado");
	}	
}
