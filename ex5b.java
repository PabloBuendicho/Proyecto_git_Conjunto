/*
	5b. Programa Java que descomponga un número entero, solicitado al usuario, en sus divisores.
*/

// Importamos la clase Scanner
import java.util.Scanner;

public class ex5b {
	public static void main(String[] args) {
		// Creamos el objeto de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos la variable que contendra el número entero
		int num, mult=2;
		
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		while (num != mult){
			if ((num%mult)==0){
				System.out.print(mult+",");
				num = num/mult;
				mult=2;
			} else
				mult++;
		}
		
		System.out.print(mult);
	}
}
