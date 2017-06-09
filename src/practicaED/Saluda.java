package practicaED;

import java.util.Scanner;

public class Saluda {
	
	public String nombre="";
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void pideNombre() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca nombre");
		String nombre = teclado.nextLine();
		System.out.println("hola " + nombre);
	}
	
	public static void main(String[] args) {
		
		Saluda sal = new Saluda();
		sal.pideNombre();

	}

}
