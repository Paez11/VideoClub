package utils;

import java.util.Scanner;

import DAO.*;

public class lee {

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
	
	
	public static void Print(String f) {
		System.out.println(f);
	}
	
	public static void Print(Object o) {
		System.out.println(o);
	}
	
	public static void show(ClienteDAO c) {
		System.out.println(c);
		System.out.println();
	}
	
	public static void show(ProductoDAO p) {
		System.out.println(p);
		System.out.println();
	}
	
	public static void show(ReservaDAO r) {
		System.out.println(r);
		System.out.println();
	}
	
	public static void show(CopiaDAO co) {
		System.out.println(co);
		System.out.println();
	}
}
