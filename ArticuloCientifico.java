public class ArticuloCientifico {
    private String nombre;
    private String autor;
    private String palabrasClaves;
    private String nombrePublicacion;
    private int anio;
    private String resumen;

    public ArticuloCientifico(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public ArticuloCientifico(String nombre, String autor, String palabrasClaves,
                               String nombrePublicacion, int anio) {
        this(nombre, autor);
        this.palabrasClaves = palabrasClaves;
        this.nombrePublicacion = nombrePublicacion;
        this.anio = anio;
    }

    public ArticuloCientifico(String nombre, String autor, String palabrasClaves,
                               String nombrePublicacion, int anio, String resumen) {
        this(nombre, autor, palabrasClaves, nombrePublicacion, anio);
        this.resumen = resumen;
    }

    public void imprimirArticulo() {
        System.out.println("----- Artículo Científico -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras clave: " + palabrasClaves);
        System.out.println("Publicación: " + nombrePublicacion);
        System.out.println("Año: " + anio);
        System.out.println("Resumen: " + resumen);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        ArticuloCientifico articulo = new ArticuloCientifico(
                "Inteligencia Artificial aplicada a la Educación",
                "María Fernanda López",
                "IA, educación, aprendizaje automático",
                "Revista Latinoamericana de Tecnología Educativa",
                2024,
                "Este artículo analiza el impacto de la inteligencia artificial en los procesos educativos modernos."
        );

        articulo.imprimirArticulo();
    }
}
