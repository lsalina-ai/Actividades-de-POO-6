public class Empleado {
    private int identificador;
    private String nombre;
    private String apellidos;
    private int edad;

    public Empleado() {
        this.identificador = 100;
        this.nombre = "Nuevo empleado";
        this.apellidos = "Nuevo empleado";
        this.edad = 18;
    }

    public Empleado(int identificador, String nombre, String apellidos, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void imprimirEmpleado() {
        System.out.println("----- Empleado -----");
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.imprimirEmpleado();

        Empleado empleado2 = new Empleado(101, "Carlos", "Ramírez Gómez", 30);
        empleado2.imprimirEmpleado();
    }
}
