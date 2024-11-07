/*
	Programa que cree 2 objetos rectangulo, le doy valores (amplio y alto) y muestra los perimetros y areas */

public class usaRectangulos
{
	public static void main(String args[])
	{
		// crear 2 rectngulos
		rectangulo r1 = new rectangulo();	// llama al constructor de la CLASSE
		rectangulo r2 = new rectangulo(2,5);	// llama al constructor general de la CLASSE
		rectangulo r3 = new rectangulo(3,4);	// llama al constructor general de la CLASSE
		// r4 tiene q ser copia de r2
		rectangulo r4 = new rectangulo(r2);	// llama al constructor de copia

		// el primero tendrá amplio 2 y altura 5
		//r1.amplio = 2;
		//r1.alto = 5;
	//	r1.setAmplio(2);
	//	r1.setAlto(5);

		// El segundo tendre amplio 4 y altura 3
	//	r2.setAmplio(4);
	//	r2.setAlto(3);

		// Mostrar área y perimetro para cada rectangulo
		System.out.println("El primer rectangulo tiene un área de: " + r1.area() + " y el perimetro es: " + r1.perimetro());
		System.out.println("El segon rectangulo tiene un área de: " + r2.area() + " y el perimetro es: " + r2.perimetro());
		System.out.println("El tercer rectangulo tiene un área de: " + r3.area() + " y el perimetro es: " + r3.perimetro());
		System.out.println("El quart rectangulo tiene un área de: " + r4.area() + " y el perimetro es: " + r4.perimetro());

		// canvio r4 --> no canviará r2
		r4.setAmplio(8);
		System.out.println("El segon rectangulo tiene un área de: " + r2.area() + " y el perimetro es: " + r2.perimetro());
		System.out.println("El quart rectangulo tiene un área de: " + r4.area() + " y el perimetro es: " + r4.perimetro());

		// Mostrar los valores de cada rectangulo (haciendo uso del metodo toString())
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}

class rectangulo
{
	// 2 tipos de miembros: ATRIBUTOS (propiedades) y METODOS (funciones internas a la classe)

	// atributos: en principio seran privados
	private double amplio;
	private double alto;

	// metodos: en principio seran publicos
	/* tipos de metodos:
			1. constructors
			2. setters: permiten cambiar los valores de los atributos
			3. getters: permiten obtener los valores de los atributos
			4. otros metodos: mejoran el comportamiento de la classe */

	// constructor por defecto (sin parametro)
	public rectangulo()
	{
		amplio=alto=1;
	}

	// constructor pasandole los parametros introducidos
	public rectangulo(double am, double al)
	{
		amplio=am;
		alto=al;
	}

	//CONSTRUCTOR DE COPIA
	public rectangulo(rectangulo r)
	{
		this.amplio = r.amplio; // copio el amplio del objeto r al amplio del objeto que estoy construyendo
		this.alto = r.alto; // copio el alto del objeto r al alto del objeto que estoy construyendo
	}

	// setters: generalmente, un setter por atributo
	public void setAmplio(double am)
	{
		amplio = am; // atributo=parametro;
	}
	public void setAlto(double al)
	{
		alto = al;	// atributo=parametro;
	}

	// getters: generalmente, un getter por atributo
	public double getAmplio()
	{
		return amplio;
	}
	public double getAlto()
	{
		return alto;
	}

	// resta de metodos
	public double area()
	{
		return amplio * alto;
	}
	public double perimetro()
	{
		return 2 * (amplio + alto);
	}

	// metodo toString(): metodo que retorna los valores de los atributos
	public String toString()
	{
		return "amplio: " + amplio + ", alto: " + alto;
	}
}
