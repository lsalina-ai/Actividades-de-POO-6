public class Caja {
    private double base;
    private double anchura;
    private double altura;
    private String tipo;

    public Caja(double base, double anchura, double altura) {
        this.base = base;
        this.anchura = anchura;
        this.altura = altura;
    }

    public Caja() {
        this.base = 0;
        this.anchura = 0;
        this.altura = 0;
    }

    public Caja(double longitud) {
        this.base = longitud;
        this.anchura = longitud;
        this.altura = longitud;
    }

    public Caja(double base, double anchura, double altura, String tipo) {
        this(base, anchura, altura);
        this.tipo = tipo;
    }

    public void imprimirCaja() {
        System.out.println("----- Caja -----");
        System.out.println("Base: " + base);
        System.out.println("Anchura: " + anchura);
        System.out.println("Altura: " + altura);
        System.out.println("Tipo: " + tipo);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Caja caja1 = new Caja(10, 5, 8);
        caja1.imprimirCaja();

        Caja caja2 = new Caja();
        caja2.imprimirCaja();

        Caja caja3 = new Caja(7);
        caja3.imprimirCaja();

        Caja caja4 = new Caja(12, 6, 9, "Cartón");
        caja4.imprimirCaja();
    }
}
