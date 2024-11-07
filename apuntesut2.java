


public class ApuntesUT2 {

    // Definimos una clase genérica
    class MiClaseSimple {
        // ATRIBUTOS (propiedades) de la clase, en este caso dos atributos genéricos
        private String atributo1;//string = texto
        private int atributo2; // int = numeros enteros

        // Constructor sin parámetros
        // Este constructor inicializa los atributos con valores por defecto
        public MiClaseSimple() {
            this.atributo1 = ""; // "this" se refiere al atributo de la clase (atributo1)
            this.atributo2 = 0;  // Aquí también "this" se refiere al atributo atributo2
        }

        // Constructor con parámetros
        // Este constructor permite inicializar el objeto con valores específicos
        public MiClaseSimple(String atributo1, int atributo2) {
            this.atributo1 = atributo1; // "this.atributo1" es el atributo de la clase, "atributo1" es el parámetro
            this.atributo2 = atributo2; // Igual que arriba, "this.atributo2" es el atributo de la clase
        }

        // Métodos(setters)
        // Estos métodos permiten cambiar el valor de los atributos después de crear el objeto
        public void setAtributo1(String atributo1) {
            this.atributo1 = atributo1;
        }

        public void setAtributo2(int atributo2) {
            this.atributo2 = atributo2;
        }

        // Métodos(getters)
        // Estos métodos permiten obtener el valor de los atributos
        public String getAtributo1() {
            return this.atributo1;
        }

        public int getAtributo2() {
            return this.atributo2;
        }

        // Método adicional para mostrar información
        // Este método muestra el valor de los atributos en formato de texto
        public String mostrarInformacion() {
            return "Atributo1: " + this.atributo1 + ", Atributo2: " + this.atributo2;
        }
    }

    // Método principal donde creamos y manipulamos objetos
    public static void main(String[] args) {
        ApuntesUT2 programa = new ApuntesUT2(); // Necesario para acceder a la clase interna MiClaseSimple

        // Crear un objeto usando el constructor sin parámetros
        MiClaseSimple obj1 = programa.new MiClaseSimple();
        
        // Crear un objeto usando el constructor con parámetros
        MiClaseSimple obj2 = programa.new MiClaseSimple("Ejemplo", 42);

        // Modificar los atributos del primer objeto usando setters
        obj1.setAtributo1("Nuevo valor");
        obj1.setAtributo2(100);

        // Obtener y mostrar los valores de los atributos del primer objeto
        System.out.println("Valores de obj1: " + obj1.mostrarInformacion());

        // Obtener y mostrar los valores de los atributos del segundo objeto
        System.out.println("Valores de obj2: " + obj2.mostrarInformacion());
    }
}
