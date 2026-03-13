package introduccionajava;

import java.util.Scanner;

public class InputDelUsuario {

	public static void main(String[] args) {
		// Generamos el objeto scanner (nos servira para pedir el input al usuario)
		Scanner scan = new Scanner(System.in);
		
		// Entrada del usuario
		System.out.println("Ingrese una palabra: ");
		String cadenaDeTextoIngresada = scan.nextLine();
		
		System.out.println("La cadena de texto ingresada es: " + cadenaDeTextoIngresada);
		
		scan.close();
		
	}

}
//Esto es esta comentado para hacer un push
//1 paso - hacer un git add . para guardar al archivo
// 2 paso - hacer un git commit 
//3 paso git push para que los cambios se vean en GitHub 