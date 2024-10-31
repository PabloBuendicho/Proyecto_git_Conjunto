/*
	22. Algorisme que sol·licita notes introduïdes per teclat acabades amb un nombre negatiu, i imprimeix en pantalla l'aprovat de nota més baixa i el suspens de nota més alta.
*/

public class ejercicio22
{
	public static void main(String args[])
	{
		double nota=0,apr=10,sus=0;

		while ((nota >= 0) && (nota <= 10))
		{
			System.out.println("Introduce una nota:");
			nota = Double.parseDouble(System.console().readLine());
			if ((nota >= 5) && (nota <= apr))
				apr = nota;
			if ((nota < 5) && (nota >= sus))
				sus = nota;

		}
		System.out.println("El aprobado más bajo es = " + apr);
		System.out.println("El suspenso más alto es = " + sus);
	}
}
