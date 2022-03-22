package utils;

import java.util.Scanner;

import DAO.*;

public class lee {

	/**
	 * Método que controla que el valor que ha introducido el usuario sea un entero
	 * @return devuelve el valor introducido por el usuario cuando  haya introducido un entero válido
	 */
	public static int Entero() {
		int x=-1;
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextInt();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while(valid);
		return x;
	}
	
	/**
	 * Método que controla que el valor que ha introducido el usuario sea un Double
	 * @return devuelve el valor introducido por el usuario cuando  haya introducido un Double válido
	 */
	public static double Double() {
		double x=-1;
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextDouble();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while (valid);
		return x;
	}
	
	/**
	 * Método que controla que el valor que ha introducido el usuario sea un String
	 * @return devuelve el valor introducido por el usuario cuando  haya introducido un String válido
	 */
	public static String String() {
		String x="";
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextLine();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while (valid);
		return x;
	}
	
	/**
	 * Método que muestra por pantalla un String
	 * @param f: String que se va a mostrar por pantalla
	 */
	public static void Print(String f) {
		System.out.println(f);
	}
	
	/**
	 * Método que muestra por pantalla un objeto
	 * @param o: objeto que se va a mostrar por pantalla
	 */
	public static void Print(Object o) {
		System.out.println(o);
	}
	
	/**
	 * Método que muestra por pantalla un Cliente
	 * @param o: Cliente que se va a mostrar por pantalla
	 */
	public static void show(ClienteDAO c) {
		System.out.println(c);
		System.out.println();
	}
	
	/**
	 * Método que muestra por pantalla un Producto
	 * @param o: Producto que se va a mostrar por pantalla
	 */
	public static void show(ProductoDAO p) {
		System.out.println(p);
		System.out.println();
	}
	
	/**
	 * Método que muestra por pantalla una Reserva
	 * @param o: Reserva que se va a mostrar por pantalla
	 */
	public static void show(ReservaDAO r) {
		System.out.println(r);
		System.out.println();
	}
	
	/**
	 * Método que muestra por pantalla una Copia
	 * @param o: Copia que se va a mostrar por pantalla
	 */
	public static void show(CopiaDAO co) {
		System.out.println(co);
		System.out.println();
	}
}
