
public class Suma {

   
    public int sumar(int a, int b) {
        return a + b;
    }


    public int sumar(int a, int b, int c) {
        return a + b + c;
    }


    public double sumar(double a, double b) {
        return a + b;
    }


    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Suma miSuma = new Suma();

        int resultado1 = miSuma.sumar(5, 7);
        System.out.println("Suma de dos enteros (5 + 7): " + resultado1);

        int resultado2 = miSuma.sumar(5, 7, 10);
        System.out.println("Suma de tres enteros (5 + 7 + 10): " + resultado2);

        double resultado3 = miSuma.sumar(3.5, 2.25);
        System.out.println("Suma de dos double (3.5 + 2.25): " + resultado3);

        double resultado4 = miSuma.sumar(3.5, 2.25, 1.1);
        System.out.println("Suma de tres double (3.5 + 2.25 + 1.1): " + resultado4);
    }
}
