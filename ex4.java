/*
	4. Realitzar un programa que demane un número positiu a l'usuari i done la llista dels factorials dels números des del valor introduït fins al 1, indicant quins dels factorials trobats tenen algun dígit igual a 2.
	S'utilitzarà una funció per al càlcul del factorial de cada número i una altra per a saber si el factorial calculat té o no algun dígit igual a 2.
	Exemple per al 5:

	5: factorial = 120	SI té 2
	4: factorial = 24	SI té 2
	3: factorial = 6	 NO té 2
	2: factorial = 2	SI té 2
	1: factorial = 1	NO té 2
*/

public class ex4
{
	public static void main(String args[])
	{
		int n,facto=1;

		System.out.println("Introduce un número entero:");
		n = Integer.parseInt(System.console().readLine());

		while (n > 0) {
			facto=factorial(n);
			if (digito(facto) == true)
				System.out.println("El factorial de " + n + " es = " + facto + "  SI tiene 2");
			else
				System.out.println("El factorial de " + n + " es = " + facto + "  NO tiene 2");
			n--;
		}
	}

	public static int factorial(int num)
	{
		int total=1;
		while (num > 0){
			total = total * num;
			num--;
		}
		return total;
	}

	public static boolean digito(int digi)
	{
		while (digi > 0)
		{
			if (digi % 10 == 2)
				return true;
			else
				digi =  digi/10;
		}
		return false;
	}
}
