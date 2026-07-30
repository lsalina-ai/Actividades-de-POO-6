
public class Pedido {


    static class ItemMenu {
        private String nombre;
        private double valor;

        public ItemMenu(String nombre, double valor) {
            this.nombre = nombre;
            this.valor = valor;
        }

        public String getNombre() {
            return nombre;
        }

        public double getValor() {
            return valor;
        }
    }


    public double calcularPedido(ItemMenu primerPlato, ItemMenu bebida) {
        double total = primerPlato.getValor() + bebida.getValor();
        mostrarDetalle(total, primerPlato, bebida);
        return total;
    }


    public double calcularPedido(ItemMenu primerPlato, ItemMenu segundoPlato, ItemMenu bebida) {
        double total = primerPlato.getValor() + segundoPlato.getValor() + bebida.getValor();
        mostrarDetalle(total, primerPlato, segundoPlato, bebida);
        return total;
    }


    public double calcularPedido(ItemMenu primerPlato, ItemMenu segundoPlato, ItemMenu bebida, ItemMenu postre) {
        double total = primerPlato.getValor() + segundoPlato.getValor() + bebida.getValor() + postre.getValor();
        mostrarDetalle(total, primerPlato, segundoPlato, bebida, postre);
        return total;
    }


    private void mostrarDetalle(double total, ItemMenu... items) {
        System.out.println("---- Detalle del pedido ----");
        for (ItemMenu item : items) {
            System.out.printf("  %-15s $%.2f%n", item.getNombre(), item.getValor());
        }
        System.out.printf("  TOTAL A PAGAR: $%.2f%n%n", total);
    }

    public static void main(String[] args) {
        Pedido restaurante = new Pedido();

        ItemMenu sopa = new ItemMenu("Sopa del dia", 8000);
        ItemMenu bandejaPaisa = new ItemMenu("Bandeja paisa", 22000);
        ItemMenu jugoNatural = new ItemMenu("Jugo natural", 5000);
        ItemMenu arrozLeche = new ItemMenu("Arroz con leche", 6000);

        ItemMenu crema = new ItemMenu("Crema de champinones", 9000);
        ItemMenu pescado = new ItemMenu("Pescado a la plancha", 25000);
        ItemMenu gaseosa = new ItemMenu("Gaseosa", 4000);

        ItemMenu ensalada = new ItemMenu("Ensalada cesar", 10000);
        ItemMenu pollo = new ItemMenu("Pollo asado", 20000);
        ItemMenu limonada = new ItemMenu("Limonada natural", 5000);
        ItemMenu flan = new ItemMenu("Flan de caramelo", 7000);

        System.out.println("Pedido 1: Primer plato + bebida");
        double totalPedido1 = restaurante.calcularPedido(sopa, jugoNatural);

        System.out.println("Pedido 2: Primer plato + segundo plato + bebida");
        double totalPedido2 = restaurante.calcularPedido(crema, pescado, gaseosa);

        System.out.println("Pedido 3: Primer plato + segundo plato + bebida + postre");
        double totalPedido3 = restaurante.calcularPedido(ensalada, pollo, limonada, flan);

        System.out.println("=== Resumen de pedidos ===");
        System.out.printf("Pedido 1: $%.2f%n", totalPedido1);
        System.out.printf("Pedido 2: $%.2f%n", totalPedido2);
        System.out.printf("Pedido 3: $%.2f%n", totalPedido3);
    }
}
