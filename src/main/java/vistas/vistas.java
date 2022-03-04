package vistas;

import interfaces.IVista;

public class vistas implements IVista{

	public void showMenuPrincipal() {
		System.out.println(" __     __  _       _                   ____   _           _     \r\n"
				+ " \\ \\   / / (_)   __| |   ___    ___    / ___| | |  _   _  | |__  \r\n"
				+ "  \\ \\ / /  | |  / _` |  / _ \\  / _ \\  | |     | | | | | | | '_ \\ \r\n"
				+ "   \\ V /   | | | (_| | |  __/ | (_) | | |___  | | | |_| | | |_) |\r\n"
				+ "    \\_/    |_|  \\__,_|  \\___|  \\___/   \\____| |_|  \\__,_| |_.__/ \r\n"
				+ "                                                                 /n");
		System.out.println("1. Catálogo de productos");
		System.out.println("2. Catálogo de clientes");
		System.out.println("3. Gestión de reservas");
		System.out.println("0. Salir");
		
	}

	public void showMenuProductos() {

		System.out.println("  ___                  _               _              \r\n"
				+ " | _ \\  _ _   ___   __| |  _  _   __  | |_   ___   ___\r\n"
				+ " |  _/ | '_| / _ \\ / _` | | || | / _| |  _| / _ \\ (_-<\r\n"
				+ " |_|   |_|   \\___/ \\__,_|  \\_,_| \\__|  \\__| \\___/ /__/\r\n"
				+ "                                                      ");
		System.out.println("1. Añadir producto");
		System.out.println("2. Ver producto");
		System.out.println("3. Editar producto");
		System.out.println("4. Eliminar producto");
		System.out.println("0. salir");
	}

	public void showMenuClientes() {

		System.out.println("   ___   _   _                _              \r\n"
				+ "  / __| | | (_)  ___   _ _   | |_   ___   ___\r\n"
				+ " | (__  | | | | / -_) | ' \\  |  _| / -_) (_-<\r\n"
				+ "  \\___| |_| |_| \\___| |_||_|  \\__| \\___| /__/\r\n"
				+ "                                             ");
		System.out.println("1. Añadir cliente");
		System.out.println("2. Ver cliente");
		System.out.println("3. Editar cliente");
		System.out.println("4. Eliminar cliente");
		System.out.println("0. Salir");
	}

	public void showMenuReservas() {

		System.out.println("  ___                                          \r\n"
				+ " | _ \\  ___   ___  ___   _ _  __ __  __ _   ___\r\n"
				+ " |   / / -_) (_-< / -_) | '_| \\ V / / _` | (_-<\r\n"
				+ " |_|_\\ \\___| /__/ \\___| |_|    \\_/  \\__,_| /__/");
		System.out.println("1. Hacer reserva");
		System.out.println("2. Ver reserva");
		System.out.println("3. Editar reserva");
		System.out.println("4. Eliminar reserva");
		System.out.println("0. Salir");
	}

	
}
